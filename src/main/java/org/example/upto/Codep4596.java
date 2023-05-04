package org.example.upto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Codep4596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length ; i++) {
            String[] nums = sc.nextLine().split(" ");

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.valueOf(nums[j]);
            }
        }

        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
