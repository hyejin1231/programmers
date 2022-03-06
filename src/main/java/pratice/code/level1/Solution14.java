package pratice.code.level1;

import java.util.ArrayList;

public class Solution14 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(solution14.solution(a, b)); // result = 3
    }

    // 내적
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

}
