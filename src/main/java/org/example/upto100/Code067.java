package org.example.upto100;

import java.util.Scanner;

public class Code067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        String sign = i > 0 ? "plus" : "minus";
        System.out.println(sign);

        String status = i % 2 == 0 ? "even" : "odd";
        System.out.println(status);
    }
}
