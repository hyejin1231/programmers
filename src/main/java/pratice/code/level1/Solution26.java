package pratice.code.level1;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution26 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        System.out.println(solution26.solution(numbers, "right")); // result LRLLLRLLRRL
                                                                                // LRLLLRLLLR
    }

    // [카카오 인턴] 키패드 누르기
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10, right = 12;
        for (int number : numbers) {
            if (number == 0) number = 11;

            switch (number % 3) {
                case 0 :
                    answer.append("R");
                    right = number;
                    break;
                case 1 :
                    answer.append("L");
                    left = number;
                    break;
                case 2:
                    int L = Math.abs(number - left);
                    int R = Math.abs(number - right);
                    int distanceL = (L % 3) + (L / 3);
                    int distanceR = (R % 3) + (R / 3);

                    if (distanceL < distanceR) {
                        answer.append("L");
                        left = number;
                    } else if (distanceL > distanceR ) {
                        answer.append("R");
                        right = number;
                    }else {
                        if (hand.equals("right")) {
                            answer.append("R");
                            right = number;
                        }else {
                            answer.append("L");
                            left = number;
                        }
                    }
                   break;
            }
        }

        return answer.toString();
    }

}
