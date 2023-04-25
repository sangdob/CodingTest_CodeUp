package org.example.upto100;

import java.util.Scanner;

public class Code096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int[][] arr = new int[20][20];
        for (int i = 0; i < n; i++) {
            String[] xy = sc.nextLine().split(" ");
            arr[Integer.valueOf(xy[0])][Integer.valueOf(xy[1])] = 1;
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
