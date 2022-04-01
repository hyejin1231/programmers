package pratice.code.level2;


public class Solution9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution9.solution("CBD", skill_trees)); // result 2
    }

    // 스킬트리
    public int solution(String skill, String[] skill_trees) {
        int answer = 4;
        char[] ch = new char[skill.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = skill.charAt(i);
        }

        for (String skill_tree : skill_trees) {
            for (int i = 0; i < ch.length; i++) {
                System.out.print(skill_tree.indexOf(ch[i])  + " ");
            }
            System.out.println();
        }

        return answer;
    }
// System.out.println(skill_tree.indexOf(ch[i]) );



}
