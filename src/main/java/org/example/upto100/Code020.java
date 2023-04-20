package org.example.upto100;

import java.util.Scanner;

public class Code020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split("-");

        System.out.println(s[0] + s[1]);
    }
}
