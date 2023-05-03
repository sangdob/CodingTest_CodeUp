package org.example.upto300;

import java.util.Scanner;

public class Code121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", a % b);
    }
}
