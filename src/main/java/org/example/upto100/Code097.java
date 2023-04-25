package org.example.upto100;

import java.util.Scanner;

public class Code097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[20][20];

        for (int i = 1; i < 20; i++) {
            String[] s = sc.nextLine().split(" ");
            for (int j = 1; j < 20; j++) {
                arr[i][j] = Integer.valueOf(s[j-1]);
            }
        }

        int n = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] xy = sc.nextLine().split(" ");
            int x = Integer.valueOf(xy[0]);
            int y = Integer.valueOf(xy[1]);

            for (int j = 1; j < 20; j++) {
                arr[x][j] = arr[x][j] == 1 ? 0 : 1;
                arr[j][y] = arr[j][y] == 1 ? 0 : 1;
            }
        }

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
