package pratice.code.level2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        String[][] clothes = {
                {"yellowhat", "headgear"}, // (0,0), (0,1)
                {"bluesunglasses", "eyewear"}, // (1,0), (1,1)
                {"green_turban", "headgear"} // (2,0), (2,1)
        };

        String[][] clothes2 = {
                {"crowmask", "face"},
                {"bluesunglasses", "face"},
                {"smoky_makeup", "face"}
        };
        System.out.println(solution11.solution(clothes)); // result 5

    }


    // 위장
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().intValue());
            answer *= iterator.next().intValue() + 1;
        }
        

        return answer-1;
    }



}



















