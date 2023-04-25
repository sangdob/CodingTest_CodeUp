package org.example.upto100;

import java.util.Scanner;

public class Code066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};

        for (int num : nums) {
            String status = num % 2 == 0 ? "even" : "odd";
            System.out.println(status);
        }
    }
}
