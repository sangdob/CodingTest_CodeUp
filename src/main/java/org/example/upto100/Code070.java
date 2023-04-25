package org.example.upto100;

import java.util.Scanner;

public class Code070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        String season = "";

        switch (month / 3){
            case 1:
                season = "spring";
                break;
            case 2:
                season = "summer";
                break;
            case 3:
                season = "fall";
                break;
            case 4:
            case 0:
                season = "winter";
                break;
        }

        System.out.println(season);
    }
}
