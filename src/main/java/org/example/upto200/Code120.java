package org.example.upto200;

import java.util.Scanner;

public class Code120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.printf("%.2f", (float)(x + y + z) /3);
    }
}
