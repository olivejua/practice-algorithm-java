package com.olivejua.array;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[10][9];
        boolean[][] cols = new boolean[10][9];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                char value = board[row][col];
                if (value == '.') {
                    continue;
                }

                int digit = Character.getNumericValue(value);
                //같은 row에 존재하는지 확인
                if (rows[digit][row]) {
                    return false;
                }

                //같은 col에 존재하는지 확인
                if (cols[digit][col]) {
                    return false;
                }

                int subBoxRow = ((row/3) * 3); // subBoxRow ~ +2 or row
                int subBoxCol = ((col/3) * 3); // subBoxCol ~ +2 or col
                for (int r = subBoxRow; r <= Math.min(subBoxRow+2, row); r++) {
                    for (int c = subBoxCol; c <= subBoxCol+2; c++) {
                        if (r == row && c == col) continue;

                        if (Character.getNumericValue(board[r][c]) == digit) {
                            return false;
                        }
                    }
                }

                rows[digit][row] = true;
                cols[digit][col] = true;
            }
        }

        return true;
    }
}
