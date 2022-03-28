package pratice.code.level2;


public class Solution4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        /**
         * 1 + 2 + 3 + 4 + 5 = 15
         * 4 + 5 + 6 = 15
         * 7 + 8 = 15
         * 15 = 15
         */
        System.out.println(solution4.solution(15)); // result 4
    }


    // 숫자의 표현
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (true) {
                sum += num;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
                num++;
            }
        }
        return answer;
    }

}
