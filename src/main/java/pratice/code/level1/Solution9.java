package pratice.code.level1;

public class Solution9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        long solution = solution9.solution(3, 20, 4);// 결과 10 리턴해야함
        System.out.println(solution);
    }

    // 부족한 금액 계산하기
    public long solution(int price, int money, int count) {

        long sum = 0L;
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }

        long max = Math.max(sum, money);
        if (max > money) {
            return max - money;
        }else {
           return 0;
        }

    }
}
