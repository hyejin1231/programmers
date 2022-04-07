package pratice.code.level2;

public class Solution13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int[][] arr1 = {
                {1, 4},
                {3, 2},
                {4, 1}
        };
        int [][] arr2 = {
                {3,3},
                {3,3}
        };

        int[][] arr3 = {
                {2, 3, 2},
                {4, 2, 4},
                {3, 1, 4}
        };
        int[][] arr4= {
                {5, 4, 3},
                {2, 4, 1},
                {3,1, 1}
        };

        int[][] solution = solution13.solution(arr1, arr2);
        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.print("anInt = " + anInt + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] solution1 = solution13.solution(arr3, arr4);
        for (int[] ints : solution1) {
            for (int anInt : ints) {
                System.out.print("anInt = " + anInt + " ");
            }
            System.out.println();
        }

//        System.out.println(solution13.solution(arr1, arr2)); // result [15,15], [15,15], [15,15]
//        System.out.println(solution13.solution(arr3, arr4)); // result [22, 22, 11], [36, 28, 18], [29, 20, 14]
    }

    // 행렬의 곱셈
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }



        return answer;
    }


}



















