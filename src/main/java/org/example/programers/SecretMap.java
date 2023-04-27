package org.example.programers;

public class SecretMap {
    public static void main(String[] args) {
        int[] arr1 = {46, 33, 33, 31, 50};
        int[] arr2 = {27, 56, 14, 14, 10};
        int n = 5;

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String binary = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));

            System.out.println(binary);

            binary = binary.replaceAll("0", " ");
            binary = binary.replaceAll("1", "#");

            System.out.println(binary);
            answer[i] = binary;
        }
    }
}
