package org.example.upto100;

import java.util.Scanner;

public class Code076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        int a = 'a';

        do {
            System.out.print((char)a);
            if (c <= a) {
                return;
            }
            a++;
            System.out.print(" ");
        } while (true);
    }
}
