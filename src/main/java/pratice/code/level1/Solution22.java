package pratice.code.level1;

import java.util.ArrayList;

public class Solution22 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        System.out.println(solution22.solution("1S2D*3T")); // result 37 11 * 2 + 22 * 2 + 33
        System.out.println(solution22.solution("1D2S#10S")); // result 9 12 + 21 * (-1) + 101
        System.out.println(solution22.solution("1D2S0T")); // result 3 12 + 21 + 03
    }


    // [1차] 다트 게임
    public int solution(String dartResult) {
        int answer = 0;
        String first = "";
        int[] list = new int[3];
        int idx= 0;

        for (int i = 0; i < dartResult.length(); i++) {

            switch (dartResult.charAt(i)) {
                case '*':
                    list[idx-1] *= 2;
                    if (idx > 1) list[idx-2] *= 2;
                    break;
                case '#':
                    list[idx-1] *= -1;
                    break;
                case 'S':
                     list[idx] = (int) Math.pow(Integer.parseInt(first), 1);
                     idx++;
                    first = "";
                    break;
                case 'D':
                    list[idx] = (int) Math.pow(Integer.parseInt(first), 2);
                    idx++;
                    first = "";
                    break;
                case 'T':
                    list[idx] = (int) Math.pow(Integer.parseInt(first), 3);
                    idx++;
                    first = "";
                    break;
                default:
                    first += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }

        for (int i : list) {
            answer += i;
        }


        return answer;
    }

}
