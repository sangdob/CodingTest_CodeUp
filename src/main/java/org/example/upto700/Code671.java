package org.example.upto700;

import java.util.Scanner;

public class Code671 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int me = sc.nextInt();
        int you = sc.nextInt();
        if(me == you){
            System.out.println("tie");
        }else if((me == 1 && you == 2) || (me == 2 && you == 0) || (me == 0 && you == 1)){
            System.out.println("win");
        }else{
            System.out.println("lose");
        }
    }
}
