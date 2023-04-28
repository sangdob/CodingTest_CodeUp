package org.example.programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            arr.add(score[i]);
            if (i >= k) {
                arr.remove(Collections.min(arr));
            }
            answer[i] = Collections.min(arr);
        }

        return answer;
    }
}
