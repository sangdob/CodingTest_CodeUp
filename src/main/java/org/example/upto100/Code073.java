package org.example.upto100;

import java.util.Scanner;

public class Code073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            int i = sc.nextInt();
            if (i == 0) {
                return;
            }
            System.out.println(i);
        }
    }
}
