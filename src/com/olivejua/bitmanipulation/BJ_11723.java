package com.olivejua.bitmanipulation;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 집합
 */
public class BJ_11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int bitset = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int number;

            switch (command) {
                case "add":
                    number = Integer.parseInt(st.nextToken());
                    bitset |= (1 << (number - 1));
                    break;
                case "remove":
                    number = Integer.parseInt(st.nextToken());
                    bitset &= ~(1 << (number - 1));
                    break;
                case "check":
                    number = Integer.parseInt(st.nextToken());
                    sb.append((bitset & (1 << (number - 1))) != 0 ? "1\n" : "0\n");
                    break;
                case "toggle":
                    number = Integer.parseInt(st.nextToken());
                    bitset ^= (1 << (number - 1));
                    break;
                case "all":
                    bitset |= (~0);
                    break;
                case "empty":
                    bitset &= 0;
                    break;
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
