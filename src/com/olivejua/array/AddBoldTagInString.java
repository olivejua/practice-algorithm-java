package com.olivejua.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddBoldTagInString {

    public String addBoldTag(String targetStr, String[] dict) {
        boolean[] bolds = new boolean[targetStr.length()];

        Map<Character, List<String>> tags = new HashMap<>();
        for (String keyword : dict) {
            char firstLetter = keyword.charAt(0);
            tags.putIfAbsent(firstLetter, new ArrayList<>());
            tags.get(firstLetter).add(keyword);
        }

        char[] targetChars = targetStr.toCharArray();
        for (int i = 0; i < targetChars.length; i++) {
            char targetChar = targetChars[i];

            if (tags.containsKey(targetChar)) {
                for (String tag : tags.get(targetChar)) {
                    if (i + tag.length() > targetChars.length) {
                        break;
                    }

                    String str = targetStr.substring(i, i + tag.length());
                    if (str.equals(tag)) {
                        for (int j = i; j < i + tag.length(); j++) {
                            bolds[j] = true;
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < targetChars.length; i++) {
            if (bolds[i] && (i-1 < 0 || !bolds[i-1])) {
                sb.append("<b>");
            }

            sb.append(targetChars[i]);

            if (bolds[i] && (i+1 >= targetChars.length || !bolds[i+1])) {
                sb.append("</b>");
            }
        }

        return sb.toString();
    }


    public String addBoldTag2(String s, String[] dict) {
        boolean[] bold = new boolean[s.length()];

        for (String word : dict) {
            int start = s.indexOf(word);

            while (start != -1) {
                for (int i = start; i < start + word.length(); i++) {
                    bold[i] = true;
                }

                start = s.indexOf(word, start + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (bold[i] && (i == 0 || !bold[i-1])) {
                sb.append("<b>");
            }

            sb.append(s.charAt(i));

            if (bold[i] && (i == s.length() - 1 || !bold[i+1])) {
                sb.append("</b>");
            }
        }

        return sb.toString();
    }
}
