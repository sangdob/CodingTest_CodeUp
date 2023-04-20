package org.example.upto100;

import java.util.Scanner;

public class Code023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] arr = s.split("\\.");
        System.out.println(Integer.parseInt(arr[0]));
        System.out.println(Integer.parseInt(arr[1]));
    }
}
