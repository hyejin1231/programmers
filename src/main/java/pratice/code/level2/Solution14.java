package pratice.code.level2;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Solution14 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        int[] people = {70, 50, 80, 50};
        int[] people2 = {70, 80, 50};
        System.out.println(solution14.solution(people, 100)); // result 3
        System.out.println(solution14.solution(people2, 100)); // result 3
    }

    // 구명보트
    public int solution(int[] people, int limit) {
        int answer = 0;
        Stack<Integer> stack = new Stack();

        Arrays.sort(people);
        for (int person : people) {
            stack.push(person);
        }

        int sum = 0;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            Integer pop = stack.pop();
            sum += pop;

            if (limit - pop < 40) {
                answer ++;
                sum = 0;
            }

            if (sum >= limit) {
                answer++;
                sum = 0;
            }

        }

        return answer;
    }

    public int solution2(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int sum = 0;
        int count = 0;
        for (int person : people) {
            sum += person;
            if (sum < limit) {
                if (limit - person < 40) {
                    answer++;
                    sum = 0;
                }else {
                    count ++;
                }
            } else if (sum > limit) {
                answer++;
                answer += count;
                sum = 0;
            }
        }

        return answer;
    }

}



















