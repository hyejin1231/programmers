package pratice.code.level1;


import static java.lang.Math.*;

public class Solution8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        int[][] sizes= {
                {60,50},
                {30,70},
                {60,30},
                {80,40}
        };
        int solution = solution8.solution(sizes);
        System.out.println(solution);
    }

    // 최소 직사각형 가로, 세로
    public int solution(int[][] sizes) {
        int widthMax = 0;
        int heightMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = max(sizes[i][0], sizes[i][1]);
            int h = min(sizes[i][0], sizes[i][1]);

            widthMax = max(widthMax, w);
            heightMax = max(heightMax, h);
        }

        return widthMax * heightMax;
    }
}
