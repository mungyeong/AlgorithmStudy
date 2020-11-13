package programmers;

import java.util.Arrays;

public class Problem42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i=0;i<reserve.length;i++){
            for(int i1=0;i1<lost.length;i1++){
                if(reserve[i]==lost[i1]){
                    reserve[i]=0;
                    lost[i1]=0;
                    answer++;
                    continue;
                }
            }

        }
        for(int i=0,i1=0;i<lost.length&&i1<reserve.length;){
            if(reserve[i1]<=0)i1++;
            else if(lost[i]<=0)i++;
            else if(lost[i]==reserve[i1]||lost[i]==(reserve[i1]+1)||lost[i]==(reserve[i1]-1)){
                i++;i1++;answer++;
            }
            else if(lost[i]<reserve[i1]){i++;}
            else if(lost[i]>reserve[i1]){i1++;}
        }
        return answer;
    }
}
