package com.olivejua.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int mStart = 0, mEnd = matrix.length-1;
        int nStart = 0, nEnd = matrix[0].length-1;
        while (mStart < mEnd && nStart < nEnd) {
            //top
            for (int i = 0; i < nEnd-nStart; i++) {
                result.add(matrix[mStart][nStart+i]);
            }
            // right
            for (int i = 0; i < mEnd-mStart; i++) {
                result.add(matrix[mStart+i][nEnd]);
            }
            // bottom
            for (int i = 0; i < nEnd-nStart; i++) {
                result.add(matrix[mEnd][nEnd-i]);
            }
            // left
            for (int i = 0; i < mEnd-mStart; i++) {
                result.add(matrix[mEnd-i][nStart]);
            }

            mStart++;
            mEnd--;
            nStart++;
            nEnd--;
        }

        //정사각형 모양이 아니라면 수평이라면 top만 추가하고 종료
        if (mStart == mEnd) {
            for (int i = nStart; i <= nEnd; i++) {
                result.add(matrix[mStart][i]);
            }

        //정사각형 모양이 아니라 수직선이라면 right만 추가하고 종료
        } else if (nStart == nEnd) {
            for (int i = mStart; i <= mEnd; i++) {
                result.add(matrix[i][nStart]);
            }
        }

        return result;
    }
}
