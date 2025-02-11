package com.olivejua.greedy;

import java.io.*;

public class StrongPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    static class Result {
        public static int minimumNumber(int n, String password) {
            boolean hasDigit = false;
            boolean hasLower = false;
            boolean hasUpper = false;
            boolean hasSpecial = false;

            String numbers = "0123456789";
            String lowerCase = "abcdefghijklmnopqrstuvwxyz";
            String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String specialCharacters = "!@#$%^&*()-+";

            for (char ch : password.toCharArray()) {
                if (numbers.indexOf(ch) >= 0) hasDigit = true;
                else if (lowerCase.indexOf(ch) >= 0) hasLower = true;
                else if (upperCase.indexOf(ch) >= 0) hasUpper = true;
                else if (specialCharacters.indexOf(ch) >= 0) hasSpecial = true;
            }

            int missingTypes = 0;
            if (!hasDigit) missingTypes++;
            if (!hasLower) missingTypes++;
            if (!hasUpper) missingTypes++;
            if (!hasSpecial) missingTypes++;

            return Math.max(missingTypes, 6-n);
        }

    }
}
