package pratice.code.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(solution1.solution(A,B)); // result 29

    }

    // 최솟값 만들기
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);

        Integer B2[] = new Integer[B.length];
        for (int i = 0; i < B2.length; i++) {
            B2[i] = B[i];
        }

        Arrays.sort(B2, Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}
