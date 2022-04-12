package pratice.code.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution17 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        System.out.println(solution17.solution(10, 2)); // return [4,3]
        System.out.println(solution17.solution(8, 1)); // return [3,3]
        System.out.println(solution17.solution(24,24)); // return [8, 6]
        System.out.println(solution17.solution(12, 6)); // return
    }

    // 카펫
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int square = brown + yellow;

        for (int i = 1; i <= square; i++) {
            int col = square / i;
            if ((i - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = i;
            }
        }
        return answer;
    }



    public int[] solution2(int brown, int yellow) {
        int[] answer = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        int square = brown + yellow;

        for (int i = 1; i <= square; i++) {
            if (square % i == 0) {
                list.add(i);
            }
        }

        int size = list.size() / 2;
        if (list.size() % 2 == 0) {
            answer[0] = list.get(size);
            answer[1] = list.get(size - 1);
        }else {
            answer[0] = list.get(size);
            answer[1] = list.get(size);
        }


        return answer;
    }
}



















