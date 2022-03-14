package pratice.code.level1;

public class Solution21 {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        System.out.println(solution21.solution("...!@BaT#*..y.abcdefghijklm")); // result bat.y.abcdefghi
        System.out.println(solution21.solution("z-+.^.")); // result z--

    }

    // 신규아이디 추천
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();

        String id = "";
        for (int i = 0; i < new_id.length(); i++) {
            char c = answer.charAt(i);

            if (c >= 'a' && c <= 'z') {
                id += String.valueOf(c);
            } else if (c >= '0' && c <= '9') {
                id += String.valueOf(c);
            } else if (c == '.' || c == '-' || c == '_') {
                id += String.valueOf(c);
            }
        }
        answer = id;

        answer = answer.replace("..", ".");
        while (answer.contains("..")) {
            answer = answer.replace("..", ".");
        }

        if (answer.startsWith(".")) {
            answer = answer.substring(1);
        } else if (answer.endsWith(".")){
            answer = answer.substring(0, answer.length()-1);
        }

        if (answer.isBlank()) {
            answer += "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }

        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }

        String substring = answer.substring(answer.length() - 1);
        if (answer.length() == 2) {
            answer += substring;
        } else if (answer.length() == 1) {
            answer += substring + substring;
        }

        return answer;
    }

}
