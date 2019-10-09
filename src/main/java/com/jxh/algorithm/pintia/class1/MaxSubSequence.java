package com.jxh.algorithm.pintia.class1;

import java.util.Scanner;

/**
 * 最大子列和问题
 */
public class MaxSubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            }
        }
        getMaxSubSequence2(array,n);

    }
    private static void getMaxSubSequence(int[] array,int n){
        int maxSum = 0;
        int thisSum = 0;
        for (int i = 0; i < n; i++) {
            thisSum += array[i];
            if (thisSum> maxSum){
                maxSum = thisSum;
            }
            if (thisSum<0){
                thisSum = 0;
            }
        }
        System.out.println(maxSum);
    }

    /**
     * @param array
     * @param n
     * 输出最大和 开始元素 结束元素
     * 如果出现多个值相等的最大子列 输出最小的两个index 如果所有值都是负数，输出0 且输出整个列的开始和结束index值
     */
    private static void getMaxSubSequence2(int[] array,int n){
        int maxSum = -1;
        int thisSum = 0;
        int startIndex = 0;
        int endIndex = n-1;
        int maxLength = 0;
        int thisLength = 0;
        for (int i = 0; i < n; i++) {
            thisSum += array[i];
            thisLength++;
            if (thisSum> maxSum){
                maxLength = thisLength;
                maxSum = thisSum;
                endIndex = i;
            }
            else if (thisSum<0){
                thisSum = 0;
                thisLength = 0;
            }
        }
        if (maxLength>0){
            startIndex = endIndex-maxLength+1;
        }

        System.out.print((maxSum>0?maxSum:0)+" ");
        System.out.print(array[startIndex]+" ");
        System.out.print(array[endIndex]);
    }
}
