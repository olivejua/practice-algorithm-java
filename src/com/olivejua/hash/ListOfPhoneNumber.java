package com.olivejua.hash;

import java.util.HashMap;

public class ListOfPhoneNumber {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String phone_number : phone_book) {
            hashMap.put(phone_number, 1);
        }

        for (String phone_number : phone_book) {
            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < phone_number.length(); i++) {
                temp.append(phone_number.charAt(i));
                if (hashMap.containsKey(temp.toString()) && !(temp.toString().equals(phone_number))) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
