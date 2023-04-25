package org.example.upto100;

import java.util.Scanner;

public class Code046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(i + j + k);
        System.out.printf("%.1f", (float)(i+ j + k) / 3);
    }
}
