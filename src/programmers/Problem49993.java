package programmers;

import java.util.LinkedList;

public class Problem49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String s : skill_trees) {
            LinkedList<Integer> skillindex = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                int i1 = skill.indexOf(s.charAt(i));
                if(i1>-1){
                    skillindex.add(i1);
                }
            }
            int count = 0;
            for(int i=0;i<skillindex.size();i++){
                if(i!=skillindex.get(i)){
                    break;
                }
                count ++;
            }
            if(count ==skillindex.size()){
                answer ++;
            }
        }
        return answer;
    }
}
