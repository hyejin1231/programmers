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
        System.out.println(solution7.solution(10)); // result 41
    }

    // 124 나라의 숫자
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        if (n / 4 != 0) {
            sb.append ( n / 4);
        }
        switch (n % 3) {
            case 1:
                sb.append( 1);
                break;
            case 2:
              sb.append( 2);
                break;
            case 0:
                sb.append( 4);
                break;
        }

        return sb.toString();
    }

}
