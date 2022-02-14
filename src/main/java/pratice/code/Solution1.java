package pratice.code;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        int[] array = {5, 9, 7, 10};
        Solution1 solution1 = new Solution1();
        System.out.println( Arrays.toString( solution1.solution(array, 5) ));
    }

    // 나누어 떨어지는 숫자 배열
    public int[] solution(int[] arr, int divisor) {
        int[] ints = Arrays.stream(arr).filter(element -> element % divisor == 0).sorted().toArray();

        if (Arrays.stream(ints).findAny().isEmpty()) {
            return new int[]{-1};
        }else {
            return ints;
        }

    }
}
