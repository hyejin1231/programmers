package pratice.code.level2;



public class Solution12 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.solution(3)); // result 2
        System.out.println(solution12.solution(5)); // result 5

    }


    // 피보나치 수
    public int solution2(int n) {
        int[] num = new int[n+1];

        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }

        return num[n] % 1234567;

    }

    public int solution(int n) {
        int[] num = new int[n+1];

        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i <= n; i++) {
            num[i] = num[i - 1] % 1234567 + num[i - 2] % 1234567;
        }

        return num[n] % 1234567;

    }


}



















