package org.example.upto100;

import java.util.Scanner;

public class Code034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = Integer.parseInt(s, 8);
        System.out.printf("%d", i);
    }
}
