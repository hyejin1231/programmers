package pratice.code.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution25 {
    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages = {4,4,4,4};
//        System.out.println(solution25.solution(5,stages));
        int[] solution = solution25.solution(4, stages);
        for (int i : solution) {
            System.out.println(i);
        }


    }

    // 실패율
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] fail = new int[N];
        int count = 0;
        int length = stages.length;
        ArrayList<Float> list = new ArrayList<>();

        for (int i = 1; i <= answer.length; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    count++;
                }
            }
            if (count == 0) {
                list.add((float) 0);
            }else {
                answer[i-1] = count;
                list.add((float) count / length);
                length -= answer[i-1];
                count = 0;
            }
        }

        Object[] objects = list.stream().sorted(Comparator.comparing(Float::floatValue).reversed()).toArray();

        for (int i = 0; i < fail.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (objects[i] == list.get(j)) {
                    fail[i] = j+1;
                }
            }
        }



        return fail;
    }

}
