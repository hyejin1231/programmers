package pratice.code.level1;

import java.util.Arrays;

public class Solution16 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(solution16.solution(numbers)); // result 14
    }

    // 없는 숫자 더하기
    public int solution(int[] numbers) {
        int sum = 0;
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int answer = 45 - sum;

        return answer;
    }

}
