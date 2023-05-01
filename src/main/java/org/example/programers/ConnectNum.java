package org.example.programers;

public class ConnectNum {
    public int solution(int[] num_list) {
        int answer = 0;

        int odd = 0;
        int even = 0;

        for (int i = num_list.length; i >= 0; i--) {
            if (num_list[i] % 2 == 0) {
                even *= 10;
                even += num_list[i];
            } else {
                odd *= 10;
                odd += num_list[i];
            }
        }

        answer = odd + even;

        return answer;
    }
    public static void main(String[] args) {

    }
}
