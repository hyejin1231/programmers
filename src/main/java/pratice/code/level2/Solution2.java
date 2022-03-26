package pratice.code.level2;

import java.util.Arrays;
import java.util.Collections;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("1 2 3 4")); // result 1 4
        System.out.println(solution2.solution("-1 -2 -3 -4")); // result -4 -1
    }

    // 최댓값과 최솟값
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split(" ");
        int[] number = new int[s1.length];

        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(s1[i]);
        }

        Arrays.sort(number);

        if (number[0] == number[number.length-1]) {
            answer += number[0] + " " + number[number.length-1];
        }else {
            if (Math.min(number[0], number[number.length-1]) == number[0]) {
                answer += number[0] + " " + number[number.length-1];
            }else {
                answer += number[number.length-1] + " " + number[0];
            }
        }

        return answer;
    }
}
