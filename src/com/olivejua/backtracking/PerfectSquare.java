package com.olivejua.backtracking;

import java.util.Scanner;

public class PerfectSquare {
    private int sum;
    private int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        PerfectSquare obj = new PerfectSquare();
        obj.execute(m, n);

        if (obj.sum > 0) {
            System.out.println(obj.sum);
            System.out.println(obj.min);
        } else {
            System.out.println(-1);
        }
    }

    private void execute(int m, int n) {
        int current = 1;
        int pow = (int) Math.pow(current, 2);
        while (pow <= n) {
            if (m <= pow) {
                sum += pow;

                if (min == 0) {
                    min = pow;
                }
            }

            current++;
            pow = (int) Math.pow(current, 2);
        }
    }
}
