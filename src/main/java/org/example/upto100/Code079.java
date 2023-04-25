package org.example.upto100;

import java.util.Scanner;

public class Code079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alphas = sc.nextLine().split(" ");
        for (String s : alphas) {
            System.out.println(s);
            if (s.equals("q")) {
                return;
            }
        }
    }
}
