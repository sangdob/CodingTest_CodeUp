package org.example.upto100;

import java.util.Scanner;

public class Code091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");

        long a = Integer.valueOf(nums[0]);
        int m =  Integer.valueOf(nums[1]);
        int d =  Integer.valueOf(nums[2]);
        int n =  Integer.valueOf(nums[3]);

        for (int i = 1; i < n; i++) {
            a = a * m + d;
        }
        System.out.println(a);
    }
}
