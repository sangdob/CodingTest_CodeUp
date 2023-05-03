package org.example.upto200;

import java.util.Scanner;

public class Code124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] particles = sc.nextLine().split("H");

        System.out.printf("%d", Integer.valueOf(particles[0].substring(1)) * 12 + Integer.valueOf(particles[1]));
    }
}
