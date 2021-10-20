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
                Sumator sumator = new Sumator();
                result = sumator.oblicz(a, b);
                break;
            case "-":
                Odejmator odejmator = new Odejmator();
                result = odejmator.oblicz(a, b);
                break;
            case "/":
                Dzielnikator dzielnikator = new Dzielnikator();
                result = dzielnikator.oblicz(a, b);
                break;
            case "*":
                Mnożnik mnożnik = new Mnożnik();
                result = mnożnik.oblicz(a, b);
        }

        System.out.print("Wynik to " + result);
    }
}
