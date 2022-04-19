package pratice.code.level2;

import java.util.Stack;

public class Solution21 {
    public static void main(String[] args) {
        Solution21 solution20 = new Solution21();
        System.out.println(solution20.solution("1924", 2)); // result 94
        System.out.println(solution20.solution("1231234", 3)); // result 3234
        System.out.println(solution20.solution("4177252841", 4)); // result 775841
    }

    // 큰 수 만들기
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;

        int scope = number.length() - k;

        for (int i = 1; i <= scope; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < number.length() - (scope - i); j++) {
                if ((number.charAt(j) - '0') == 9) {
                    max = 9;
                    idx = j;
                    break;
                }

                if (max < (number.charAt(j) - '0')) {
                    max = number.charAt(j) - '0';
                    idx = j;
                }
            }

            sb.append(max);
            number = number.substring(idx + 1, number.length());
        }

        return sb.toString();
    }
    public String solution2(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <= number.length(); i++) {
            char c = number.charAt(i);

            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }

            stack.push(c);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return new String(result);
    }

}




















