package org.example.upto100;

import java.util.Scanner;

public class Code026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] nums = s.split(":");
        System.out.println(Integer.parseInt(nums[1]));
    }
}
