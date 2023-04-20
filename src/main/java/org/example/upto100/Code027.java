package org.example.upto100;

import java.util.Scanner;

public class Code027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] date = s.split("\\.");
        System.out.printf("%02d-%02d-%04d", Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
    }
}
