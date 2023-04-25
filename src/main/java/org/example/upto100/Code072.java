package org.example.upto100;

import java.util.Scanner;

public class Code072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        String stringNumber = sc.nextLine();
        String[] numbers = stringNumber.split(" ");
        for (String num : numbers) {
            System.out.println(Integer.parseInt(num));
        }
    }
}
