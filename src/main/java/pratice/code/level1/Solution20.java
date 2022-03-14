package pratice.code.level1;

import java.util.ArrayList;

public class Solution20 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(solution20.solution(6, arr1, arr2));

    }

    // [1차] 비밀지도 비트연산자!!!!!
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {

            answer[i] =  Integer.toBinaryString(arr1[i] | arr2[i]).replace("1", "#").replace("0", " ");

            if (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }

        return answer;
    }

}
