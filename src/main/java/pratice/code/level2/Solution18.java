package pratice.code.level2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution18 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
        String[] words4 = {"land", "dream", "mom", "mom", "ror"};
        String[] words5 = {"land", "dream", "mom", "mom"};

        System.out.println(solution18.solution(3, words)); // result [3,3]
        System.out.println(solution18.solution(5, words2)); // result [0,0]
        System.out.println(solution18.solution(2, words3)); // result [1, 3]
        System.out.println(solution18.solution(2, words4)); // result [ 2, 2 ]
        System.out.println(solution18.solution(2, words5));
    }

    // 영어 끝말잇기
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String last = list.get(list.size() - 1);
            String now = words[i];

            if (!list.contains(now) && last.charAt(last.length() - 1) == now.charAt(0)) {
                list.add(now);
            }else {
                answer[0] = i % n +1;
                answer[1] = i / n +1;
                break;
            }
        }

        return answer;
    }

    public int[] solutio4(int n, String[] words) {
        int[] answer = new int[2];
        char last = words[0].charAt(words[0].length() - 1);
        String str = Arrays.stream(words).filter(s -> s.equals(s)).findAny().get();

        for ( int i = 1; i < words.length; i++) {
            char first = words[i].charAt(0);

            if (last != first || words[i].contains(str)) {
                answer[0] =(int)Math.ceil((double) i + 1) / n;
                answer[1] = (int)Math.floor((double) i/ n) + 1;
                break;
            }
            last = words[i].charAt(words[i].length() - 1);

        }

        return answer;
    }

    public int[] solution4(int n, String[] words) {
        int[] answer = new int[2];
        char last = words[0].charAt(words[0].length() - 1);
        String str = Arrays.stream(words).filter(s -> s.equals(s)).findAny().get();

        for ( int i = 1; i < words.length; i++) {
            char first = words[i].charAt(0);

            if (last != first) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            if (words[i].contains(str)) {
                answer[0] =  i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            last = words[i].charAt(words[i].length() - 1);
        }
        System.out.println("answer[0] = " + answer[0]);
        System.out.println("answer[1] = " + answer[1]);
        return answer;
    }

    public int[] solution2(int n, String[] words) {
        int[] answer = new int[2];
        char last = words[0].charAt(words[0].length() - 1);
        String str = Arrays.stream(words).filter(s -> s.equals(s)).findAny().get();
        if (str.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        }
        for ( int i = 1; i < words.length; i++) {
            char first = words[i].charAt(0);

            if (last != first) {
                answer[0] = (i + 1) % n;
                answer[1] = words.length / n ;
                break;
            }
            if (words[i].contains(str)) {
                answer[0] = (i + 1) / n;
                answer[1] = words.length / n ;
                break;
            }
            last = words[i].charAt(words[i].length() - 1);
        }
        return answer;
    }


}



















