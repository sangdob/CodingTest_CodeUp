package org.example.upto100;

import java.util.Scanner;

public class Code080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
            if (sum >= n) {
                System.out.println(i);
                return;
            }
        }
    }
}
