package pratice.code.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution5 {

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2,5,3}, {4,4,1}, {1,7,3}
        };
        solution5.solution2(array, commands);
    }

    // K번째수
    // [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
    // [2,5,3] -> 2번째부터 5번째까지 3번째 값 -> 5,2,6,3 -> (정렬) 2, 3, 5, 6 -> 3번째 값 5
    // [4,4,1] -> 4번째부터 4번째까지 자르고 1번째 값 -> 6 -> 정렬 6
    // [1,7,3] -> 1번째부터 7번째까지 자르고 3번째 값 -> 1, 5, 2, 6, 3, 7, ,4 -> (정렬) 1, 2, 3, 4, 5, 6, 7 -> 3
    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = {};
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            list.add(Arrays.stream(array).skip(commands[i][0] - 1).limit(commands[i][1] - commands[i][0] + 1).toArray());
        }

        answer = new int[list.size()];

        for (int i = 0; i < commands.length; i++) {
            int[] ints1 = Arrays.stream(list.get(i)).sorted().toArray();
            if (commands[i][2] == 1) {
                answer[i] = ints1[0];
            }else {
                answer[i] = ints1[commands[i][2]-1];
            }

        }

        return answer;
    }





}
