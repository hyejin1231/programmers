package pratice.code.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution2 {

    // 문자열 내 마음대로 정렬하기

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(list);

        answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }


        return answer;
    }

    // 문자열 내 마음대로 정렬하기
    public String[] solution2(String[] strings, int n) {

        return  Arrays.stream(strings).sorted().sorted(Comparator.comparingInt(element -> element.charAt(n))).toArray(String[]::new);

    }
}
