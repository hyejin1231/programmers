package pratice.code.level2;


import java.util.Stack;

public class Solution10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        System.out.println(solution10.solution("1924", 2)); // result 94
        System.out.println(solution10.solution("1231234", 3)); // result 3234
        System.out.println(solution10.solution("4177252841", 4)); // result 775841
    }


    // 큰 수 만들기      
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int scope = number.length() - k;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < number.length(); i++) {
            stack.add(Integer.valueOf(String.valueOf(number.charAt(i))));
        }

        for (Integer integer : stack) {
            System.out.println("integer = " + integer);
        }

        return sb.toString();
    }




}



















