package com.olivejua.twopointer;

public class RotatingTheBox {

    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        char[][] rotated = rotate(box, m, n);

        for (int i = 0; i < box.length; i++) {
            rotated = dropToBottom(rotated, i);
        }

        return rotated;
    }

    public char[][] rotate(char[][] box, int m, int n) {
        char[][] rotated = new char[n][m];

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                rotated[y][m-1-x] = box[x][y];
            }
        }

        return rotated;
    }

    public char[][] dropToBottom(char[][] box, int y) {
        int writeP = box.length - 1;
        int readP = box.length - 1;

        while (0 <= readP && 0 <= writeP) {
            if (box[readP][y] == '.') {
                --readP;
            } else if (box[readP][y] == '#') {
                char temp = box[writeP][y];
                box[writeP][y] = box[readP][y];
                box[readP][y] = temp;
                --writeP;
                --readP;
            } else if (box[readP][y] == '*') {
                writeP = readP - 1;
                readP = readP - 1;
            }
        }

        return box;
    }
}
