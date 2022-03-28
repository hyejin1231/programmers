package pratice.code.level2;


import java.util.Stack;

public class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution("()()")); // result true
        System.out.println(solution5.solution("(())()")); // result true
        System.out.println(solution5.solution(")()(")); // result false
        System.out.println(solution5.solution("(()(")); // result false
    }

     // 올바른 괄호
    boolean solution2(String s) {
        while (s.contains("()")) {
            s = s.replace("()", "");
        }

        if (s.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

    boolean solution(String s) {
        boolean answer = false;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count ++;
            }

            if (s.charAt(i) == ')') {
                count--;
            }

            if (count < 0) {
                break;
            }
        }

        if (count == 0) {
            answer = true;
        }

        return answer;
    }


}
