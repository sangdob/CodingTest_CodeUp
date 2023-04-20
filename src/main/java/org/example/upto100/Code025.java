package org.example.upto100;

import java.util.Scanner;

public class Code025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] nums = s.split("");
        int i = 10000;
        for (String n : nums) {
            System.out.println("[" + i * Integer.parseInt(n) + "]");
            i /= 10;
        }
    }

}
