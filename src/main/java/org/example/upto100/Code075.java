package org.example.upto100;

import java.util.Scanner;

public class Code075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        while(i > 0){
            System.out.println(--i);
        }
    }
}
