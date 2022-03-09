package pratice.code.level1;

import java.util.Arrays;

public class Solution18 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int[] nums = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};
        System.out.println(solution18.solution(nums)); // result 2
        System.out.println(solution18.solution(nums2)); // result 3
        System.out.println(solution18.solution(nums3)); // result 2
    }

    // 폰켓몬
    public int solution(int[] nums) {
        int answer = 0;

        int[] ints = Arrays.stream(nums).distinct().toArray();
        int choice = nums.length / 2;


            if (ints.length > choice) {
                answer = choice;
            } else {
                answer = ints.length;
            }


        return answer;
    }

}
