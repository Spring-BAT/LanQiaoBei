package com.Leetcode;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        int m = 0, b = 0;
        System.out.println("请输入一个想要测试的数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        b = fun(n);
        System.out.println(b);
        while (b != 0) {
            if (b % 10 == 0) {
                m++;
            }
            b /= 10;
        }
        System.out.println("结果中包含0的个数为"+m);
    }
        public static int fun(int c){
            if (c == 1) {
                return 1;
            } else {
                return c*fun(c - 1);
            }

        }

}