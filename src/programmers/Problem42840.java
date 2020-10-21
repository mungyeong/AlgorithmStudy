package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.OptionalInt;

public class Problem42840{
    public int[] solution(int[] answers) {
        int[][] a = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int b[] = new int[]{0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            int i0 = (i%5==0?0:(i%5));
            int i1 = (i%8==0?0:(i%8)); ;
            int i2 = (i%10==0?0:(i%10)); ;
            if (answers[i] == a[0][i0]) {
                b[0] += 1;
            }
            ;
            if (answers[i] == a[1][i1]) {
                b[1] += 1;
            }
            ;
            if (answers[i] == a[2][i2]) {
                b[2] += 1;
            }
            ;
        }
        OptionalInt i=Arrays.stream(b).max();
        LinkedList<Integer> answer2 = new LinkedList<>();
        for(int t=0;t<b.length;t++){
            if(i.getAsInt()==b[t]){
                answer2.add(t);
            }
        }
        int[] answer= new int[answer2.size()];
        for(int t=0;t<answer2.size();t++){
            answer[t]=answer2.get(t)+1;
        }
        return answer;
    }
}