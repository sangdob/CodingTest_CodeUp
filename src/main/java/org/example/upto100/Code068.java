package org.example.upto100;

import java.util.Scanner;

public class Code068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String alpha = "";

        switch (score / 10){
            case 10:
            case 9:
                alpha = "A";
                break;
            case 8:
            case 7:
                alpha = "B";
                break;
            case 6:
            case 5:
            case 4:
                alpha = "C";
                break;
            default:
                alpha = "D";
        }

        System.out.println(alpha);
    }
}
