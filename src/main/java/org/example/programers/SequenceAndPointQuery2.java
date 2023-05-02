package org.example.programers;

import java.util.Arrays;

public class SequenceAndPointQuery2 {
    public static int[] solution(int[] arr, int[][] queries){
        int[] answer = new int[queries.length];
        int cnt = 0;

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int min = Integer.MAX_VALUE;

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    min = Math.min(min, arr[i]);
                }
            }

            if(min == Integer.MAX_VALUE){
                answer[cnt++] = -1;
                continue;
            }

            answer[cnt++] = min;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}});
    }
}
