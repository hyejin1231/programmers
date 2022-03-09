package pratice.code.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution17 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int[] nums = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 7, 6, 4};

        System.out.println(solution17.solution(nums)); // result 1
        System.out.println(solution17.solution(nums2)); // result 4
    }


    // 소수 만들기
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i + 2 > nums.length) break;
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int n = nums[i] + nums[j] + nums[k];
                    if (isAnswer(n)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    private boolean isAnswer(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
