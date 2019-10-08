package com.jxh.algorithm.pintia.selftest;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 给定一个不超过20位的正整数N，判断N*2的值是否还是N中数字的组合
 * 注意对应的数字也是一样
 */
public class DoubleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextBigDecimal()) {
            BigDecimal num = scanner.nextBigDecimal();
            BigDecimal multiply = num.multiply(new BigDecimal(2));
            String numString = num.toString();
            String multiplyString = multiply.toString();

            if (numString.length() != multiplyString.length()) {
                System.out.println("No");
                System.out.println(multiply);
                return;
            }
            //每个数字用到的次数也是一样的
            int[] numCount = new int[10];
            for (int i = 0; i < numString.length(); i++) {
                int index = numString.charAt(i) - '0';
                numCount[index]++;
            }
            for (int i = 0; i < multiplyString.length(); i++) {
                int index = multiplyString.charAt(i) - '0';
                numCount[index]--;
            }
            for (int c : numCount) {
                if (c!=0){
                    System.out.println("No");
                    System.out.println(multiply);
                    return;
                }
            }
            System.out.println("Yes");
            System.out.println(multiply);
        }
    }
}
