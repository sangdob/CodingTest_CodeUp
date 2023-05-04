package org.example.upto100;

import java.util.Scanner;

public class Code098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] size = sc.nextLine().split(" ");
        int[][] arr = new int[Integer.valueOf(size[0])][Integer.valueOf(size[1])];

        int n = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] nums = sc.nextLine().split(" ");

            int length = Integer.valueOf(nums[0]);
            int d = Integer.valueOf(nums[1]);
            int x = Integer.valueOf(nums[2]) - 1;
            int y = Integer.valueOf(nums[3]) - 1;


            if (d == 0) {
                for (int j = x; j < x + length; j++) {
                    arr[x][j] = 1;
                }
            } else {
                for (int j = x; j < x + length; j++) {
                    arr[j][y] = 1;
                }
            }
        }

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
