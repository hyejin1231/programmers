package pratice.code.level1;

import java.util.ArrayList;
import java.util.Collections;

public class Solution6 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        solution6.solution(10); // result = 3
//        solution6.solution(12);
    }

    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n-1; i >= 1; i--) {
            if (n % i == 1) {
                list.add(i);
            }
        }

        Collections.sort(list);

        return list.get(0);
    }
}
