package pratice.code.level1;

import java.util.ArrayList;

public class Solution12 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.solution(45)); // result 7
        System.out.println(solution12.solution(125)); // result 229
    }

    // 3진법 뒤집기
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> answer2 = new ArrayList<>();

        while (n > 0) {
            answer2.add(n % 3);

            n /= 3;
        }

        for (int i = 0; i < answer2.size(); i++) {
            answer += answer2.get(i) * Math.pow(3, (answer2.size()-1) - i);
        }

        return answer;
    }
}
