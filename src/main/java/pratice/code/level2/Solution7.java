package pratice.code.level2;


public class Solution7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.solution(1)); // result 1
        System.out.println(solution7.solution(2)); // result 2
        System.out.println(solution7.solution(3)); // result 4
        System.out.println(solution7.solution(4)); // result 11
        System.out.println(solution7.solution(5)); // result 12
        System.out.println(solution7.solution(6)); // result 14
        System.out.println(solution7.solution(7)); // result 21
        System.out.println(solution7.solution(8)); // result 22
        System.out.println(solution7.solution(9)); // result 24
        System.out.println(solution7.solution(10)); // result 41
    }

    // 124 나라의 숫자    
    public String solution(int n) {
        String[] list = {"4", "1", "2"};
        String answer = "";

        int num = n;

        while (num > 0) {
            int a = num %3;
            num /= 3;

            if (a == 0) {
                num--;
            }

            answer = list[a] +  answer;
        }


        return answer;
    }

}
