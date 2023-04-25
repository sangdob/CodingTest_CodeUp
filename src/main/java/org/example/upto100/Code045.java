package org.example.upto100;

import java.util.Scanner;

public class Code045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j);
        System.out.println(i % j);
        System.out.printf("%.2f", (float)i / j);
    }
}
