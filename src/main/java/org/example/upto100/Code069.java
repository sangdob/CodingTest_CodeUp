package org.example.upto100;

import java.util.Scanner;

public class Code069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.next().charAt(0);

        String alpha = "";

        switch (score){
            case 'A':
                alpha = "best!!!";
                break;
            case 'B':
                alpha = "good!!";
                break;
            case 'C':
                alpha = "run!";
                break;
            case 'D':
                alpha = "slowly~";
                break;
            default:
                alpha = "what?";
        }

        System.out.println(alpha);
    }
}
