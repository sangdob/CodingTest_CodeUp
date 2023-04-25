package org.example.upto100;

import java.util.Scanner;

public class Code085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] stereo = sc.nextLine().split(" ");

        int h = Integer.valueOf(stereo[0]);
        int b = Integer.valueOf(stereo[1]);
        int c = Integer.valueOf(stereo[2]);
        int s = Integer.valueOf(stereo[3]);


        double vol = (double) h * b * c * s / 8;

        System.out.println(String.format("%.1f MB", vol / (1024 * 1024)));
    }
}
