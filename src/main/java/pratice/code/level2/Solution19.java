package pratice.code.level2;


import java.util.Stack;

public class Solution19 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        System.out.println(solution19.solution("baabaa")); // result 1
        System.out.println(solution19.solution("cdcd")); // result 0
    }

    // 짝지어 제거하기
    public int solution(String s)
    {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack();
        char ch = chars[0];
        stack.push(ch);

        for (int i = 1; i < chars.length; i++) {
            if (!stack.isEmpty() && stack.peek() == chars[i]) {
                stack.pop();
            }else {
                stack.push(chars[i]);
            }
        }

      return stack.isEmpty() ? 1 : 0;
    }


}



















