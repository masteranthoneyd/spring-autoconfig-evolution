package com.yangbingdong.component;

import java.util.Deque;
import java.util.LinkedList;

import static com.yangbingdong.component.RpnUtil.calculate;
import static com.yangbingdong.component.RpnUtil.getOpWeight;
import static com.yangbingdong.component.RpnUtil.isNum;
import static com.yangbingdong.component.RpnUtil.isOp;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class InfixExpressionEvaluator implements ExpressionEvaluator {

    @Override
    public int evaluate(String expression) {
        Deque<Integer> nums = new LinkedList<>();
        Deque<String> ops = new LinkedList<>();
        for (String s : expression.split("")) {
            if (isNum(s)) {
                nums.push(Integer.valueOf(s));
            }
            if (isOp(s)) {
                if (ops.isEmpty()) {
                    ops.push(s);
                } else {
                    String opInStack = ops.peek();
                    while (opInStack != null && !"(".equals(opInStack) &&
                            getOpWeight(opInStack) >= getOpWeight(s)) {
                        String op = ops.pop();
                        Integer right = nums.pop();
                        Integer left = nums.pop();
                        Integer tmp = calculate(left, right, op);
                        nums.push(tmp);
                        opInStack = ops.isEmpty() ? null : ops.peek();
                    }
                    ops.push(s);
                }
            }
            if ("(".equals(s)) {
                ops.push(s);
            }
            if (")".equals(s)) {
                String op;
                while (!ops.isEmpty() && !"(".equals(op = ops.pop())) {
                    Integer right = nums.pop();
                    Integer left = nums.pop();
                    Integer tmp = calculate(left, right, op);
                    nums.push(tmp);
                }
            }
        }
        String op;
        while (!ops.isEmpty()) {
            op = ops.pop();
            Integer right = nums.pop();
            Integer left = nums.pop();
            Integer tmp = calculate(left, right, op);
            nums.push(tmp);
        }
        return nums.pop();
    }

}
