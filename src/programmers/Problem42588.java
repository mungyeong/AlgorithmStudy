package programmers;

public class Problem42588 {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i=heights.length-1;i>0;i--){
            answer[i]=0;
            for(int i1=i-1;i1>=0;i1--){
                if(heights[i]<heights[i1]){
                    answer[i]=i1+1;
                    break;
                }
            }
        }
        return answer;
    }
}
