package pratice.code.level2;


public class Solution8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        int[] arr = {2,6,8,14};
        int[] arr2 = {1, 2, 3};
        System.out.println(solution8.solution(arr)); // result 168
        System.out.println(solution8.solution(arr2)); // result 6
    }

    // N개의 최소공배수
    public int solution(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (max < i) max = i;
        }

        for (int i = 1; ; i++) {
            int temp = max * i;
            boolean flag = true;

            for (int j = 0; j < arr.length; j++) {
                if (temp % arr[j] != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) return temp;
        }

    }


}
