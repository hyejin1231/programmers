package pratice.code.level1;

public class Solution19 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        System.out.println(solution19.solution("one4seveneight")); //result 1478
        System.out.println(solution19.solution("23four5six7")); // result 234567
        System.out.println(solution19.solution("2three45sixseven")); // result 234567

    }

    // 숫자 문자열과 영단어
    public int solution(String s) {
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < number.length; i++) {
            s= s.replace(word[i], number[i]);
        }

        return Integer.parseInt(s);
    }

}
