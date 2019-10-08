package com.jxh.algorithm.pintia.selftest;

import java.util.Scanner;

/**
 * 打印沙漏https://pintia.cn/problem-sets/17/problems/260
 */
public class PrintSandGlass {
    public static void main(String[] args) {
        //输入 n *
//        next();
//        nextLine();
//        printStar(5,5,"*");
        Scanner scanner = new Scanner(System.in);
        Integer num = 0;
        String star = null;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        }
        if (scanner.hasNext()) {
            star = scanner.next();
        }
        //是 第几阶
        int degree = 0;
        //TODO
        while (2 * degree * degree - 1 <= num) {
            ++degree;
        }
        degree = degree - 1;
        int numNeed = 2 * degree * degree - 1;

        //打印

        for (int temp = degree; temp > 0; temp--) {
            printStar(degree, temp, star);
        }

        for (int i = 1; i < degree; i++) {
            printStar(degree, i + 1, star);
        }

        System.out.println(num - numNeed);
    }

    public static void printStar(int allDegree, int nowDegree, String star) {
        for (int i = 0; i < allDegree - nowDegree; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < 2 * nowDegree - 1; i++) {
            System.out.print(star);
        }
        //这里是换行 不需要填充完空格
        /*for (int i = 0; i < allDegree-nowDegree; i++) {
            System.out.print(" ");
        }*/
        System.out.println();
    }

    /**
     * 以有效字符开始输入，以enter结束输入，next获取的内容过滤掉空格
     */
    public static void next() {
        Scanner scanner = new Scanner(System.in);
        // next方式接收字符串
        System.out.println("next方式接收：");
        while (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println("输出的数据：" + next);
        }
    }

    /**
     * 可以多次输入，以enter结束当前输入
     * 获取enter之前的整行内容，可以获取空格
     */
    public static void nextLine() {
        Scanner scanner = new Scanner(System.in);
        // next方式接收字符串
        System.out.println("next方式接收：");
        while (scanner.hasNextLine()) {
            String next = scanner.nextLine();
            System.out.println("输出的数据：" + next);
        }
    }
}
