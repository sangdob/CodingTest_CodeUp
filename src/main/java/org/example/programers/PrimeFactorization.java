package org.example.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactorization {
    private static int[] solution(int n) {
        int [] answer = {};

        answer = Factorization(new ArrayList<>(), n);


        return answer;
    }

    private static int[] Factorization(List<Integer> list, int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (list.indexOf(i) == -1) {
                    list.add(i);
                }
                n /= i;
                break;
            }
        }

        return n > 1 ? Factorization(list, n)
                : list.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(420)));
    }
}
