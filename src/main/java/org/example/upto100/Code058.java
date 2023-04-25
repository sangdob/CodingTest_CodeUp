package org.example.upto100;

import java.util.Scanner;

public class Code058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println((i == 0) && (j == 0) ? 1 : 0);
    }
}
