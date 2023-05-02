package org.example.programers;

import java.util.Arrays;
import java.util.Collections;

public class SequenceAndPointQuery4 {
    public static int[] solution(int[] arr, int[][] queries){
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < queries.length; i++) {
            int k = queries[i][2];

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % k == 0) {
                    arr[j]++;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{0, 1, 2, 4, 3}
                , new int[][]{{0, 4, 1}
                        , {0, 3, 2}
                        , {0, 3, 3}});

        System.out.println(Arrays.toString(solution));
    }
}
