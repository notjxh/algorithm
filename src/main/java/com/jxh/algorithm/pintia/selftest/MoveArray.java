package com.jxh.algorithm.pintia.selftest;

import java.util.Scanner;

/**
 * 自测3：移动数组
 */
public class MoveArray {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        Scanner scanner = new Scanner(System.in);
        //只读取前两行
        if (scanner.hasNextLine()) {
            String num = scanner.nextLine();
            String[] nums = num.split(" ");
            n = Integer.parseInt(nums[0]);
            m = Integer.parseInt(nums[1]);
        }
        if (scanner.hasNextLine()) {
            //给定数组
            String[] strings = scanner.nextLine().split(" ");
            m = m % n;
            for (int i = 0; i < m; i++) {
                String temp = strings[n - 1];
                System.arraycopy(strings,0,strings,1,n-1);
                strings[0] = temp;
            }

            for (int i = 0; i < strings.length; i++) {
                System.out.print(strings[i]);
                if (i < strings.length - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
