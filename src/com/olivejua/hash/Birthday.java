package com.olivejua.hash;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Birthday {
    public static void main(String[] args) {
        sameBirthday();
    }

    static void sameBirthday() {
        int sameBirthdays = 0;

        for (int i = 0; i < 100_000; i++) {
            int[] birthdays = new int[23];
            for (int j = 0; j < birthdays.length; j++) {
                // 1~365 랜덤 지정
                int birthday = ThreadLocalRandom.current().nextInt(1, 365+1);
                if (IntStream.of(birthdays).anyMatch(x -> x==birthday)) {
                    sameBirthdays++;
                    break;
                }
                birthdays[j] = birthday;
            }
        }

        System.out.print("10만번 실험 중 생일이 같은 실험의 확률: ");
        System.out.print((double) sameBirthdays / 100_000 * 100);
        System.out.println("%");
    }
}
