package org.example.upto100;

import java.util.Scanner;

public class Code083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print(i%3 == 0 ? "X" : i);
            } else {
                System.out.print((i%3 == 0 ? "X " : i + " "));
            }
        }
    }
}
