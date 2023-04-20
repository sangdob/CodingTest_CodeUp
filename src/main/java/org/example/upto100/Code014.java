package org.example.upto100;

import java.util.Scanner;

public class Code014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        System.out.println(String.format("%c %c", c2, c));
    }
}
