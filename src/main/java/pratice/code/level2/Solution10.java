package pratice.code.level2;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        System.out.println(solution10.solution("1924", 2)); // result 94
        System.out.println(solution10.solution("1231234", 3)); // result 3234
        System.out.println(solution10.solution("4177252841", 4)); // result 775841
    }


    // 큰 수 만들기      
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int scope = number.length() - k;

        int[] num = new int[number.length()];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                sb.append(max);
            }

            if (sb.toString().length() == scope) {
                System.out.println("scope = " + scope);
                break;
            }

        }


        return sb.toString();
    }


    public String solution2(String number, int k) {
        String answer = "";

        ArrayList<String> num = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            num.add(String.valueOf(number.charAt(i)));
        }



        return answer;
    }



}



















