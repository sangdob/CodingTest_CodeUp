package org.example.upto100;

import java.util.Scanner;

public class Code065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};

        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
