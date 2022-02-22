package pratice.code;

import java.util.*;

public class Solution7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int[] answers = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};
        System.out.println( solution7.solution(answers)); // 결과 1
//        System.out.println(solution7.solution(answers2)); // 결과 2

    }

    // 모의고사
    // 이게 제출 문제
    public int[] solution(int[] answers) {
        int[][] answer = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answer[i][j % answer[i].length] == answers[j]) {
                    arr[i] ++;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

        int MaxValue = Math.max(Math.max(arr[0], arr[1]), arr[2]);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (MaxValue == arr[i]) {
                list.add(i + 1);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public int[] solution2(int[] answers) {
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] arr = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answer1[i % answers.length] == answers[i]) {
                arr[0]++;
            }
            if (answer2[i % answers.length] == answers[i]) {
                arr[1]++;
            }
            if (answer3[i % answers.length] == answers[i]) {
                arr[2]++;
            }
        }

        int MaxValue = Math.max(Math.max(arr[0], arr[1]), arr[2]);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (MaxValue == arr[i]) {
                list.add(i + 1);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}


































