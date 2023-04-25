package org.example.upto100;

import java.util.Scanner;

public class Code081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.println((i + 1) + " " + (j + 1));
            }
        }
    }
}
