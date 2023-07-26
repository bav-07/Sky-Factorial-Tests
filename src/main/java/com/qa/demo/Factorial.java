package com.qa.demo;

public class Factorial {

    public static int reverseFactorialCalculation(double num) {
        int count = 0;
        do {
            num /= ++count;
        } while (num > 1);
        return num == 1 ? count : 0;
    }

    public static String reverseFactorial(int num) {
        int result = reverseFactorialCalculation(num);
        return result != 0 ? num + " = " + result + "!" : "NONE";
    }

}
