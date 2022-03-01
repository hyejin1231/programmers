package pratice.code.level1;

import java.util.Arrays;

public class Solution10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        int[] d = {1, 3, 2, 5, 4};
        int[] d2 = {2,2,3,3};
        System.out.println( solution10.solution(d, 9));
        System.out.println(solution10.solution(d2, 10));

    }

    // 예산
    public int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (sum + d[i] > budget) {
                break;
            }

            sum += d[i];
            count++;
        }

        return count;
    }

    public int solution1(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        int count = 0;

        int[] ints = Arrays.stream(d).sorted().toArray();

        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];

            if (sum == budget) {
                answer = i+1;
                break;
            }else if(sum > budget) {
                answer = i;
                break;
            } else if (sum < budget) {
                if (ints.length == 1) {
                    answer = 1;
                    break;
                }

            }
        }
        return answer;
    }
}
