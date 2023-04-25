package org.example.upto100;

import java.util.Scanner;

public class Code094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.valueOf(sc.nextLine());

        String[] nums = sc.nextLine().split(" ");

        for (int i = n - 1; i > 0; i--) {
            System.out.printf(nums[i] + " ");
        }
    }
}
