package pratice.code.level1;

import java.util.ArrayList;

public class Solution13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.solution(13,17)); // result = 43
    }

    // 약수의 개수와 덧셈
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            array.add(i);
        }

        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j <= array.get(i); j++) {
                if (array.get(i) % j == 0) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                array.set(i, -array.get(i));
            }
            count = 0;
        }

        for (Integer integer : array) {
            answer += integer;
        }

        return answer;
    }

}
