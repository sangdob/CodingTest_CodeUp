package org.example.upto100;

import java.util.Scanner;

public class Code024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String english = sc.next();
        String[] s = english.split("");
        for (String a: s){
            System.out.println("\'" + a + "\'");
        }
    }
}
