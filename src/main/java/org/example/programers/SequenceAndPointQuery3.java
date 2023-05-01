package org.example.programers;

import java.util.Arrays;

public class SequenceAndPointQuery3 {
    public static int[] solution(int[] arr, int[][] queries){
        int[] answer = Arrays.copyOf(arr, arr.length);

        int temp = 0;

        for (int i = 0; i < queries.length; i++) {
            temp = answer[queries[i][0]];
            answer[queries[i][0]] = answer[queries[i][1]];
            answer[queries[i][1]] = temp;
        }

        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}});
    }
}
