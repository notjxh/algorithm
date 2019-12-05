package com.jxh.algorithm.pintia.class1;

import java.util.Scanner;

/**
 * 一元多项式的加法和乘法
 */
public class PolynomialCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] poly1 = readIn(scanner.nextLine());
        int[][] poly2 = readIn(scanner.nextLine());
        print(poly1);
        System.out.println();
        print(poly2);
    }

    /**
     * 读取
     */
    public static int[][] readIn(String input) {

        String[] split = input.split(" ");
        int size = Integer.parseInt(split[0]);
        int[][] poly1 = new int[size][2];
        for (int i = 0; i < size; i++) {
            poly1[i][0] = Integer.parseInt(split[2 * i + 1]);
            poly1[i][1] = Integer.parseInt(split[2 * i + 2]);
        }
        return poly1;
    }

    /**
     * 打印
     * 注意：最后一个空格不能有
     * 零多项式输出 0 0
     */
    public static void print(int[][] poly) {

        System.out.print(poly.length + " ");
        for (int[] ints : poly) {
            System.out.print(ints[0] + " ");
            System.out.print(ints[1] + " ");
        }
    }

    /**
     * 加法
     */
    public void plus(int[][] poly1,int[][] poly2) {

    }

    /**
     * 乘法
     */
    public void multiply() {

    }
}
