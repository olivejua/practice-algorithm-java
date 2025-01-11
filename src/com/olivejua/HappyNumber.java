package com.olivejua;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        boolean isHappy = false;

        Set<Integer> history = new HashSet<>();

        int number = n;
        while (!isHappy && !history.contains(number)) {
            history.add(number);

            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                sum += digit * digit;
            }

            if (sum == 1) {
                isHappy = true;
            }

            number = sum;
        }

        return isHappy;
    }

    public boolean isHappy2(int n) {
        if (n <= 0) {
            return false;
        }

        int slow = n;
        int fast = n;

        do {
            slow = nextNumber(slow);
            fast = nextNumber(nextNumber(fast));

            if (slow == 1 || fast == 1) {
                return true;
            }
        } while (slow != fast);

        return false;
    }

    private int nextNumber(int n) {
        int sum = 0;

        while (n != 0) {
            sum += (n%10) * (n%10);
            n /= 10;
        }

        return sum;
    }
}
