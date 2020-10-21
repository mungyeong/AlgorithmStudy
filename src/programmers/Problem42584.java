package programmers;

public class Problem42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0;i<prices.length;i++){
            for(int i1=i+1;i1<prices.length;i1++){
                answer[i]++;
                if(prices[i]>prices[i1]){
                    break;
                }
            }
        }
        return answer;
    }
}
