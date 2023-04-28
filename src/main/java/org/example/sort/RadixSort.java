package org.example.sort;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        int[] radixArr = new int[10];
        Arrays.fill(radixArr, -1);

        Arrays.stream(arr)
                .forEachOrdered(i -> radixArr[i] = i);

        System.out.println(Arrays.toString(arr));

        int cnt = 0;

        for (int i = 0; i < radixArr.length; i++) {
            if (radixArr[i] != -1) {
                arr[cnt++] = radixArr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
