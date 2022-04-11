package pratice.code.level2;


public class Solution15 {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int[][] land = {
                {1, 2, 3, 5},
                {5, 6, 7, 8},
                {4, 3, 2, 1}
        };
        System.out.println(solution15.solution(land)); // result = 5 + 7 + 4 = 16
    }

     //
    // 땅따먹기
    int solution(int[][] land) {
        int answer = 0;
        final int length = land.length;

        for (int i = 1; i < length; i++) {
            land[i][0] += max(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
            land[i][1] += max(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
            land[i][2] += max(land[i - 1][1], land[i - 1][3], land[i - 1][0]);
            land[i][3] += max(land[i - 1][1], land[i - 1][2], land[i - 1][0]);
        }

        for (int[] ints : land) {
            for (int anInt : ints) {
                answer = Math.max(answer, anInt);
            }
        }

        return answer;
    }

    private int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    int solution2(int[][] land) {
        int answer = 0;
        int index = land[0].length;

        for (int i = 0; i < land.length; i++) {
            int max = land[i][0];
            int idx = 0;
            for (int j = 0; j < index; j++) {
                if (max < land[i][j]) {
                    max = land[i][j];
                    idx = j;
                }
            }
            index = idx;
            answer += max;
        }

        return answer;
    }


}



















