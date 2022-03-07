package pratice.code.level1;

import java.util.Arrays;

public class Solution15 {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution15.solution(absolutes, signs)); // result 9
    }

    // 음양 더하기
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i] = -absolutes[i];
            }

            answer += absolutes[i];
        }

        return answer;
    }

}
