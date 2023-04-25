package org.example.upto100;

import java.util.Scanner;

public class Code087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0;; i++) {
            if (sum >= n) {
                System.out.println(sum);
                return;
            }
            sum += i;
        }
    }
}
