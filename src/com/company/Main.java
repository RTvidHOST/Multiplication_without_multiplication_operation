package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        int c = 0;
        int x = 0;
        while (x != b) {
            c = c + a;
            x++;
        }
        System.out.println("Разность равняется" + " " + c);
    }
}
