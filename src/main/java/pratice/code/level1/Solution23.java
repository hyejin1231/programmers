package pratice.code.level1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution23 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };

        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution23.solution(board, moves)); // result 4
    }

    // 크레인 인형뽑기 게임
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i]-1] != 0) {

                    if (!stack.isEmpty() && board[j][moves[i] - 1] == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }else {
                        stack.add(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i]-1] = 0;
                   break;
                }
            }
        }

        return answer;
    }


}
