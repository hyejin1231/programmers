package pratice.code.level2;

import java.util.Arrays;

public class Solution22 {
    public static void main(String[] args) {
        Solution22 solution20 = new Solution22();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution20.solution(citations)); // result 3
    }

    // H - Index
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.parallelSort(citations);
        double ceil = Math.ceil(citations.length / 2.0);
        answer=  citations[(int) ceil - 1];

        return answer;
    }

}




















