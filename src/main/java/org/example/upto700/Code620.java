package org.example.upto700;

import java.util.Scanner;

public class Code620 {
    private static long sum(long n) {
    int i = 0;

    while (n > 0) {
        i += n % 10;
        n /= 10;
    }

    return i < 10 ? i : sum(i);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sum(n));
    }
}
