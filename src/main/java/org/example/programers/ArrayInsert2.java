package org.example.programers;

import java.util.*;

public class ArrayInsert2 {
    public static int[] solution(int l, int r) {
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

        return answer.isEmpty() ? answer.stream().mapToInt(value -> value).toArray() : new int[]{-1};
    }

    public static void main(String[] args) {
        solution(10, 20);
    }
}
