package pratice.code.level2;

public class Solution20 {
    int answer = 0;

    // 티켓 넘버 - 깊이/너비 우선
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }

    /**
     * @param numbers 알고리즘을 실행할 대상 배열
     * @param depth 노드의 깊이
     * @param target 타겟 넘버
     * @param sum 이전 노드까지의 결과값
     */
    public void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) { // 마지막 노드까지 탐색한 경우
            if (target == sum) {
                answer++;
            }
        }else { // 탐색할 노드가 남아있는 경우
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
        }
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        int[] numbers = {1, 1, 1, 1, 1};
        int[] numbers2 = {4, 1, 2, 1};
        System.out.println(solution20.solution(numbers, 3)); // result 5
        System.out.println(solution20.solution(numbers2, 4 )); // result 2
    }


}



















