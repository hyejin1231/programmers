package pratice.code.level2;


import java.util.Locale;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution("3people unFollowed me"));
        System.out.println(solution3.solution("for the last week"));
    }

    // JadenCase 문자열 만들기
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for (String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }


        return answer;
    }
}
