package com.yangbingdong.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static com.yangbingdong.component.RpnUtil.getOpWeight;
import static com.yangbingdong.component.RpnUtil.isNum;
import static com.yangbingdong.component.RpnUtil.isOp;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class RpnConverter {

    public String[] convert(String expression) {
        List<String> rs = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        for (String s : expression.split("")) {
            if (isNum(s)) {
                rs.add(s);
                continue;
            }
            if (isOp(s)) {
                while (!stack.isEmpty() && !"(".equals(stack.peek()) && getOpWeight(s) <= getOpWeight(stack.peek())) {
                    rs.add(stack.pop());
                }
                stack.push(s);
                continue;
            }
            if ("(".equals(s)) {
                stack.push(s);
                continue;
            }
            if (")".equals(s)) {
                String t;
                while (!"(".equals(t = stack.pop())) {
                    rs.add(t);
                }
                continue;
            }
            throw new IllegalArgumentException();
        }
        while (!stack.isEmpty()) {
            rs.add(stack.pop());
        }
        return rs.toArray(new String[0]);
    }

}
