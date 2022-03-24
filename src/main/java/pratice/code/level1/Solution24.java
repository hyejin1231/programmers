package pratice.code.level1;

import java.util.*;

public class Solution24 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        /// result [2, 1, 1, 0]
        int[] solution = solution24.solution(id_list, report, 2);
//        for (int i : solution) {
//            System.out.println(i +" ");
//        }

    }

    // 신고 결과 받기
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> list = new HashMap<>();
        Map<String, Integer> mail = new HashMap<>();

        for (String id : id_list) {
            Set<String> ids = new HashSet<>();
            list.put(id, ids);
            mail.put(id, 0);
        }


        for (String s : report) {
            String[] s1 = s.split(" ");
            Set<String> set = list.get(s1[1]);
            set.add(s1[0]);
            list.put(s1[1], set);
        }

        for (String s : list.keySet()) {
            Set<String> strings = list.get(s);
            if (strings.size() >= k) {
                for (String string : strings) {
                    int count = mail.get(string) + 1;
                    mail.put(string, count);
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mail.get(id_list[i]);
        }

        return answer;
    }


}
