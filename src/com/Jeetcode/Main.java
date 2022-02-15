package com.Jeetcode;

public class Main {


    public static boolean isDivisible(int x, int y) {
        if (x % y == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void printResult(int i, int a, int b, int c) {
        if (isDivisible(i, a)) {
            System.out.println(i + " je djeljiv sa " + a);
        } else if (isDivisible(i, b)) {
            System.out.println(i + " je djeljiv sa " + b);
        } else if (isDivisible(i, c)) {
            System.out.println(i + " je djeljiv sa " + c);
        } else {
            System.out.println(i + " nije djeljiv ");
        }
    }


    public static void printRange(int start, int end, int a, int b, int c) {
        for (int i = start; i <= end; i++) {
            printResult(i, a, b, c);
        }
    }


    public static void main(String[] args) {

        printRange(10, 20,
                3, 7, 11);

    }
}