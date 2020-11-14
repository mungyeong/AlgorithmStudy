package programmers;

import java.util.Arrays;

public class Problem42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] b =Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(b);
            answer[i]=b[commands[i][2]-1];
        }
        return answer;
    }
}
