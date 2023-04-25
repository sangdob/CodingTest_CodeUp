package org.example.upto100;

import java.util.Scanner;

public class Code092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");

        int a = Integer.valueOf(nums[0]);
        int b =  Integer.valueOf(nums[1]);
        int c =  Integer.valueOf(nums[2]);

        for (int i = 1;; i++) {
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
