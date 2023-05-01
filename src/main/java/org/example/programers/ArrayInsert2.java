package org.example.programers;

import java.util.*;

public class ArrayInsert2 {
    public static List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            boolean flag = true;
            int n = Integer.valueOf(i);
            for (; n != 0; ) {
                if (n % 10 != 5 && n % 10 != 0) {
                    flag = false;
                    break;
                }
                n /= 10;
            }

            if (flag) {
                answer.add(i);
            }
        }

        return answer.size() != 0 ? answer : new ArrayList<>(-1);
    }

    public static void main(String[] args) {
        solution(5, 555);
    }
}
