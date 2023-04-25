package org.example.upto100;

import java.util.Scanner;

public class Code093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String[] nums = sc.nextLine().split(" ");
        int[] arr = new int[24];

        for (String num : nums) {
            int i = Integer.valueOf(num);
            arr[i] += 1;
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}
