package com.yangbingdong.component;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class RpnExpressionEvaluator implements ExpressionEvaluator {

    private final RpnConverter rpnConverter;

    public RpnExpressionEvaluator(RpnConverter rpnConverter) {
        this.rpnConverter = rpnConverter;
    }

    @Override
    public int evaluate(String expression) {
        String[] tokens = rpnConverter.convert(expression);
        Deque<Integer> stack = new LinkedList<>();
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int right = stack.pop();
                int left = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(left + right);
                        break;
                    case "-":
                        stack.push(left - right);
                        break;
                    case "*":
                        stack.push(left * right);
                        break;
                    default:
                        stack.push(left / right);
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }
}
