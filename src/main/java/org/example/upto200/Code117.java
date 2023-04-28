package org.example.upto200;

import java.util.Scanner;

public class Code117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.printf("%.2f+%.2f=%.2f", a, b, a + b);
    }
}
