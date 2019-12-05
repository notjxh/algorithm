package com.jxh.algorithm.sort;

import java.util.Arrays;

/**
 * 从小到大排序
 */
public class Sort {

    public static void main(String[] args) {
        int[] sourceArray = new int[]{5, 7, 1, 9,5,2, 4};
        try {
            print(sourceArray);
            print(bubbleSort(sourceArray));
            print(selectionSort(sourceArray));
            print(insertSort(sourceArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @return 三、插入排序
     * 1.将第一个数作为一个有序序列，将第二个到最后一个数作为未排序序列
     * 2.依次将之后的每个数，插入到有序数列中的合适位置，使之保持有序，
     */
    private static int[] insertSort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        //从第二个数开始
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            //记录当前未排序的数
            int temp = arr[j];
            //存在比起小的数，排完序的数后移一位，继续比较排序完的数的前一个数
            while (j>0&&temp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            //存在比他小的值
            if (j<i){
                arr[j] = temp;
            }
        }
        return arr;
    }

    /**
     * @return 二、选择排序
     * 1.选择未排序序列里最小（大）的值，放在序列的起始位置
     * 2.在剩下的序列中继续选取最小（大的）放在已排序序列的末尾
     * 3.重复第二步直到没有数据
     * 时间复杂度：两层循环，n^2,=最好情况=最坏情况
     * 空间复杂度
     */
    private static int[] selectionSort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i; j <arr.length ; j++) {
                if (arr[j]<arr[temp]){
                    temp = j;
                }
            }
            int temp2 = arr[i];
            arr[i] = arr[temp];
            arr[temp] = temp2;
        }
        return arr;
    }
    /**
     * @return 一、冒泡排序：
     * 1.比较第一组相邻的两个数（第一个、第二个数），如果第一个比第二个大，则交换他们
     * 2.依次比较下一组相邻的数（第二个、第三个），直到最后一组，此时最后一个数是最大的数
     * 3.重新开始依次比较交换相邻的数，除了已经有序的部分
     * 注意，定义一个flag，如果在某一轮比较中没有交换，则说明已经有序，不需要重新开始比较
     * 时间复杂度：两层循环，n^2 ，最好情况 n ，最坏情况 n^2;
     * 空间复杂度：怎么定义？
     */
    private static int[] bubbleSort(int[] sourceArray) {
        //拷贝，为了不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        //注意i=1
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        return arr;

    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
