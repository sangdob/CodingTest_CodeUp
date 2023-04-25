package org.example.upto100;

import java.util.Scanner;

public class Code086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pic = sc.nextLine().split(" ");

        int h = Integer.valueOf(pic[0]);
        int b = Integer.valueOf(pic[1]);
        int c = Integer.valueOf(pic[2]);


        double vol = (double) h * b * c / 8;

        System.out.println(String.format("%.2f MB", vol / (1024 * 1024)));
    }
}
