package com.jxh.algorithm.pintia.selftest;

import java.util.Scanner;

/**
 * 自测5，洗牌
 */
public class ShuffleCards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String[] order;
        if (scanner.hasNextLine()){
            num = Integer.parseInt(scanner.nextLine());
        }

        if (scanner.hasNextLine()){
            String nextLine = scanner.nextLine();
            order = nextLine.split(" ");

            String[] cards = new String[54];
            init(cards,"S",0,13);
            init(cards,"H",13,13);
            init(cards,"C",26,13);
            init(cards,"D",39,13);
            init(cards,"J",52,2);

            String[] swap = swap(cards, order, num);
            for (int i = 0; i < swap.length; i++) {
                System.out.print(swap[i]);
                if (i < swap.length - 1) {
                    System.out.print(" ");
                }
            }
        }
    }

    private static void init(String[] cards, String tag, int start,int num){
        for (int i = 0; i < num; i++) {
            cards[start+i]=tag+(i+1);
        }
    }
    private static String[] swap(String[] strings, String[] order,int count){

        for (int i = 0; i < count; i++) {
            String [] newStrings = new String[strings.length];
            for (int j = 0; j < strings.length; j++) {
                int num = Integer.parseInt(order[j])-1;
                newStrings[num] = strings[j];
            }
            strings = newStrings;
        }
        return strings;
    }
}
