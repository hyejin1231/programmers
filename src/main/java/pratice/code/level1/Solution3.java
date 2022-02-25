package pratice.code.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution3 {

    // 같은 숫자는 싫어
    public int[] solution(int []arr) {
        return Arrays.stream(arr).distinct().toArray(); // 이건 중복 제거만 해준다,,
    }

    public int[] solution2(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                list.add(arr[i]);
            } else if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }


        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
