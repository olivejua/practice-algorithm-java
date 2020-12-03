package com.olivejua;

import java.util.Stack;

public class 크레인_인형_뽑기 {

    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        크레인_인형_뽑기 _this = new 크레인_인형_뽑기();
        int result = _this.solution(board, moves);

        System.out.println("result: " + result);
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        for(int move : moves) {
            for(int i=0; i<board.length; i++) {
                if(board[i][move-1] != 0) {
                    if(stack.isEmpty()) {
                        stack.push(board[i][move-1]);
                        board[i][move-1] = 0;
                        break;
                    }

                    if(board[i][move-1] == stack.peek()) {
                        stack.pop();
                        answer = answer+2;
                    } else {
                        stack.push(board[i][move-1]);
                    }

                    board[i][move-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
