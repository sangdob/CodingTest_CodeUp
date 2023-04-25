package org.example.upto100;

import java.io.*;

public class Code084 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] s = br.readLine().split(" ");

            int i = Integer.valueOf(s[0]);
            int j = Integer.valueOf(s[1]);
            int k = Integer.valueOf(s[2]);

            int n = i * j * k;
            int m = j * k;

            for (int l = 0; l < n; l++) {
                int r = l / m;
                int g = (l % m) / k;
                int b = l % k;

                bw.write(r + " " + g + " " + b + "\n");
            }
            bw.write(String.valueOf(n));
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
