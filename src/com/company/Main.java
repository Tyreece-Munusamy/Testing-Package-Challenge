package com.company;
import com.Series.StaticMethods;
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(StaticMethods.nSum(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(StaticMethods.factorial(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(StaticMethods.fibonacci(i));
        }
    }
}
