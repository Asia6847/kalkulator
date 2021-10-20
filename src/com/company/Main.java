package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Wpisz liczbę");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.print("Wpisz drugą liczbę");
        int b= sc.nextInt();
        System.out.print("Podaj operację");
        String operator = sc.next();
        System.out.print(operator);
        int result = 0;
//        if (operator.equals("+")) {
//            result = a + b;
//        }
//        if (operator.equals("-")) {
//            result = a - b;
//        }
//        if (operator.equals("/")) {
//            result = a/b;
//        }
//        if (operator.equals("*")) {
//            result = a*b;
//        }
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a/b;
                break;
            case "*":
                result = a*b;
        }

        System.out.print("Wynik to " + result);
    }
}
