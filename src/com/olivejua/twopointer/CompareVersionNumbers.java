package com.olivejua.twopointer;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        int p1 = 0, p2 = 0;

        String[] revisions1 = version1.split("\\.");
        String[] revisions2 = version2.split("\\.");

        while (p1 < revisions1.length || p2 < revisions2.length) {
            int revision1 = p1 < revisions1.length ? Integer.parseInt(revisions1[p1]) : 0;
            int revision2 = p2 < revisions2.length ? Integer.parseInt(revisions2[p2]) : 0;

            if (revision1 < revision2) {
                return -1;
            }
            if (revision1 > revision2) {
                return 1;
            }

            p1++;
            p2++;
        }

        return 0;
    }
}
