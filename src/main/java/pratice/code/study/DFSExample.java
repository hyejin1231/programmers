package pratice.code.study;

/**
 * 재귀함수를 이용한 dfs(깊이우선 탐색) 구현
 */
public class DFSExample {
    // 각 노드가 방문한 정보를 true/false 로 표현
    public static boolean[] visited = {false, false, false, false, false, false, false, false, false};
    public static int[][] graph = {
            {},
            {2, 3, 8},
            {1, 7},
            {1, 4, 5},
            {3, 5},
            {3, 4},
            {7},
            {2, 6, 8},
            {1, 7}
    };
    public static void main(String[] args) {
        int start = 1;
        dfs(start);
    }

    public static void dfs(int v) {
        visited[v] = true; // 방문

        System.out.print(v + " ");

        for (int i : graph[v]) {
            if (visited[i] == false) {
                dfs(i);
            }
        }
    }


}
