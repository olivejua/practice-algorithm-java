package com.olivejua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class 체육복 {
    public int solution1(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];

        for(int i : lost) {
             students[i-1]--;
        }

        for(int i : reserve) {
            students[i-1]++;
        }

        for(int i=0; i<n; i++) {
            if(students[i] == -1) {
                if(i!=0 && students[i-1]==1) {
                    students[i]++;
                    students[i-1]--;
                } else if (i!=n-1 && students[i+1]==1) {
                    students[i]++;
                    students[i+1]--;
                }
            }
        }

        for(int student : students) {
            if(-1 < student) {
                answer++;
            }
        }

        return answer;
    }

    public int better_solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for(int l : lost) {
            people[l-1]--;
        }

        for(int r : reserve) {
            people[r-1]++;
        }

        for(int i=0; i<people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1]==1) {
                    people[i]++;
                    people[i-1]--;
                } else if(i+1<people.length && people[i+1]==1) {
                    people[i]++;
                    people[i+1]--;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }
}