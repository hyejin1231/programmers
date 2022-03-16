package pratice.code.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution24 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        /// result [2, 1, 1, 0]
        int[] solution = solution24.solution(id_list, report, 2);
        for (int i : solution) {
            System.out.println(i +" ");
        }

    }

    // 신고 결과 받기
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        for (String s : report) {
            String[] s1 = s.split(" ");

            for (int i = 0; i < s1.length; i++) {
                if (i % 2 ==  0) {

                }
            }
        }

        return answer;
    }


}
