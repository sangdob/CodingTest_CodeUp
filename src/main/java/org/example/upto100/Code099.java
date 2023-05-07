package org.example.upto100;

import java.util.Scanner;

public class Code099 {
    public static int[][] arr = new int[10][10];
    public static int x = 1;
    public static int y = 1;

    public static void main(String[] args) {
        InputArr();

        for (; ; ) {
            if (isGameClear(arr, x, y)) {
                checkNowPoint();
                break;
            }

            checkNowPoint();
            if(endOfGame()){
                break;
            }
            movePoint();
            checkNowPoint();
        }

        printArr(arr);
    }

    private static void movePoint() {
        if (isRightMove(arr)) {
            y++;
        } else if (isDownMove(arr)) {
            x++;
        }
    }

    private static boolean endOfGame() {
        return arr[x + 1][y] == 1 && arr[x + 1][y] == 1;
    }

    private static void checkNowPoint() {
        arr[x][y] = 9;
    }

    private static void InputArr() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            String[] nums = sc.nextLine().split(" ");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.valueOf(nums[j]);
            }
        }

        sc.close();
    }

    private static boolean isRightMove(int[][] arr) {
        return arr[x][y + 1] == 0 || arr[x][y + 1] == 2;
    }

    private static boolean isDownMove(int[][] arr) {
        return arr[x + 1][y] == 0 || arr[x + 1][y] == 2;
    }

    private static boolean isGameClear(int[][] arr, int x, int y) {
        return arr[x][y] == 2;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
