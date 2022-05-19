package com.yangbingdong.component;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public final class RpnUtil {

    public static boolean isOp(String s) {
        return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
    }

    /**
     * 获取权重, 乘除大于加减
     */
    public static int getOpWeight(String op) {
        switch (op) {
            case "+":
            case "-":
                return 0;
            case "*":
            case "/":
                return 1;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static boolean isNum(String s) {
        return s.matches("\\d*");
    }

    public static Integer calculate(Integer left, Integer right, String op) {
        switch (op) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                throw new IllegalArgumentException();
        }
    }

}
