package pratice.code.level2;

import java.util.Arrays;

public class Solution16 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        System.out.println(solution16.solution("1924", 2)); // result 94
        System.out.println(solution16.solution("1231234", 3)); // result 3234
        System.out.println(solution16.solution("4177252841", 4)); // result 775841

    }

    // 큰 수 만들기
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        char[] ch = new char[number.length()];
        for (int i = 0; i < number.length(); i++) {
            ch[i] = number.charAt(i);
        }


        return sb.toString();
    }


}



















