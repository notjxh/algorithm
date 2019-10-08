package com.jxh.algorithm.pintia.selftest;

import java.util.Scanner;

/**
 * 给定正整数N<10^5;算出<=N的所有素数中有多少个素数对
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
        } else {
            System.out.println("输入错误");
            return;
        }
        //第一个素数是2
        int prime1 = 2;
        //素数对个数
        int primeNum = 0;

        for (int i = 3; i <= N; i++) {
            //算出i是否是素数，除以2,3+++
            boolean flag = true;
            //*****这里用开方而不是i/2
            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                //判断是否是素数对
                if (i - prime1 == 2) {
                    primeNum++;
                }
                //更新前一个素数值
                prime1 = i;
            }
        }
        System.out.println(primeNum);
    }
}
