package com.olivejua;

import java.util.Calendar;
import java.util.Locale;

public class 이공일육년 {
    public String solution(int a, int b) {
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDay = b-1;
        for(int i=0; i<a-1; i++) {
            totalDay += month[i];
        }

        return week[totalDay%7];
    }

    public String getDayName(int month, int day) {
        Calendar cal = new Calendar.Builder()
                .setCalendarType("iso8601")
                .setDate(2016, month-1, day).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
    }
}