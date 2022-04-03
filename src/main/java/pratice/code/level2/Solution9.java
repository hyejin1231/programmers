package pratice.code.level2;


public class Solution9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution9.solution("CBD", skill_trees)); // result 2
    }

    // 스킬트리
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skill_tree : skill_trees) {
            String temp = skill_tree;

            for (int i = 0; i < skill_tree.length(); i++) {
                String substring = skill_tree.substring(i, i + 1);
                if (!skill.contains(substring)) {
                     temp= temp.replace(substring, "");
                }
            }

            if (skill.indexOf(temp) == 0) {
                answer ++;
            }
        }

        return answer;
    }




}
