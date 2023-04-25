package org.example.upto100;

import java.util.Scanner;

public class Code089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");

        int a = Integer.valueOf(nums[0]);
        int d =  Integer.valueOf(nums[1]);
        int n =  Integer.valueOf(nums[2]);

        System.out.println(a + d * (n - 1));
    }
}
