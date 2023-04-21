package org.example.upto100;

import java.util.Scanner;

public class Code035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = Integer.parseInt(s, 16);
        System.out.printf("%o", i);
    }
}
