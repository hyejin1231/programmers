package pratice.code.level2;


public class Solution6 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.solution(78)); // result 83
        System.out.println(solution6.solution(15)); // result 23
    }

    // 다음 큰 숫자
    public int solution(int n) {
        int answer = 0;
        int i = nextNum(n);

        while (true) {
            n++;
            int i1 = nextNum(n);

            if (i == i1) {
                answer = n;
                break;
            }
        }


        return answer;
    }

    private int nextNum(int n) {
        String binary = Integer.toBinaryString(n);
        char[] list = new char[binary.length()];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
             list[i] = binary.charAt(i);
        }

        for (char c : list) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

}
