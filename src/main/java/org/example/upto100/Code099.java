package org.example.upto100;

import java.util.Scanner;

public class Code099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
/*        int[][] arr = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 2, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};*/


        for (int i = 0; i < arr.length; i++) {
            String[] nums = sc.nextLine().split(" ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.valueOf(nums[j]);
            }
        }

        int x = 1;
        int y = 1;

        for (; ; ) {
            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }
            if (arr[x][y + 1] == 0 || arr[x][y + 1] == 2) {
                arr[x][y++] = 9;
            } else if (arr[x + 1][y] == 0 || arr[x + 1][y] == 2) {
                arr[x++][y] = 9;
            } else {
                arr[x][y] = 9;
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
