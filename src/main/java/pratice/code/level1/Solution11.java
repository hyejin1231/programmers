package pratice.code.level1;


import java.util.Arrays;

public class Solution11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int[] lost = {2,4};
        int[] reserve = {3};
        System.out.println(solution11.solution(5, lost, reserve)); // 결과 5

    }

    // 체육복
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] check = new int[n+1];

        Arrays.fill(check, 1);

        for (int i = 0; i < reserve.length; i++) {
            check[reserve[i]] ++;
        }

        for (int i = 0; i < lost.length; i++) {
            check[lost[i]] --;
        }

        for (int i = 1; i <= n; i++) {
            if (check[i] == 2 && check[i - 1] == 0) {
                check[i] --;
                check[i-1] ++;
            }

            if (check[i] == 2 && check[i + 1] == 0) {
                check[i] --;
                check[i + 1] ++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (check[i] >= 1) {
                answer++;
            }
        }


        return answer;
    }
}
