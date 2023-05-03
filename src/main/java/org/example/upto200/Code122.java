package org.example.upto200;

import java.util.Scanner;

public class Code122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        System.out.printf("%d %d", m/60, m%60);
    }
}
