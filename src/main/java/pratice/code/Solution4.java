package pratice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution4 {

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] array = {2,1,3,4,1};
        solution4.solution(array);
    }

    // 두 개 뽑아서 더하기
    // length : 5
    // [2,1,3,4,1] -> 	[2,3,4,5,6,7]
    // 1,1, 2, 3, 4 (0, 5)
    // 2 3 4 5 (1, 4)
    // 3, 4, 5 ( 2, 3)
    // 5, 7 (3, 2)
    //7 (4,1)

    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.stream(numbers).sorted();

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length ; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }


        answer = new int[list.size()];


        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        int[] ints = Arrays.stream(answer).distinct().sorted().toArray();

        return ints;
    }


}
