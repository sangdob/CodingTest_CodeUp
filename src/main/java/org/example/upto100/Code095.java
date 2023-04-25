package org.example.upto100;

import java.util.Scanner;

public class Code095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = Integer.valueOf(sc.nextLine());
        String[] nums = sc.nextLine().split(" ");

        int min = Integer.valueOf(nums[0]);

        for (String num : nums) {
            if (min > Integer.valueOf(num)) {
                min = Integer.valueOf(num);
            }
        }
        System.out.println(min);
    }
}
