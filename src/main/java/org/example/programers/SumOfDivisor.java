package org.example.programers;

public class SumOfDivisor {
    public static int solution(int n) {
        int answer = 0;
        return answer = sumDivisor(n);
    }

    private static int sumDivisor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(6));
    }
}
