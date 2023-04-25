package org.example.upto100;

import java.util.Scanner;

public class Code071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nums = sc.nextLine();

        String[] s = nums.split(" ");
        for (String num : s) {
            int i = Integer.parseInt(num);
            if (i == 0) {
                return;
            }

            System.out.println(i);
        }
    }
}
