package org.example.programers;

import java.util.Arrays;
import java.util.Collections;

public class SequenceAndPointQuery4 {
    public static int[] solution(int[] arr, int[][] queries){
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if (j % k == 0) {
                    answer[j]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{0, 1, 2, 4, 3}
                , new int[][]{{0, 4, 1}
                        , {0, 3, 2}
                        , {0, 3, 3}});

        System.out.println(Arrays.toString(solution));
    }
}
