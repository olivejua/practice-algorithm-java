package com.olivejua.array;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int first = 0;
        int last = matrix.length-1;

        while (first < last) {
            for (int i = 0; i < last - first; i++) {
                int value = matrix[first][first+i];

                // right, bottom, left, top
                for (int direction = 0; direction < 4; direction++) {
                    int temp = 0;

                    if (direction == 0) {
                        temp = matrix[first+i][last];
                        matrix[first+i][last] = value;

                        value = temp;
                    } else if (direction == 1) {
                        temp = matrix[last][last - i];
                        matrix[last][last - i] = value;

                        value = temp;
                    } else if (direction == 2) {
                        temp = matrix[last-i][first];
                        matrix[last-i][first] = value;

                        value = temp;
                    } else {
                        matrix[first][first+i] = value;
                    }
                }
            }

            first++;
            last--;
        }
    }
}
