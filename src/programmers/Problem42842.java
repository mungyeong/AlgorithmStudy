package programmers;

public class Problem42842 {
    public int[] solution(int brown, int yellow) {
        int answer[] = new int[]{3,3},total= brown + yellow;

        for(int i=3;i<((total/2)+1);i++){
            int i1=total%i,i2=total/i;
            if(i1==0&&i*i2==total&&(i2-2)*(i-2)==yellow){
                if(i2>i){answer[0]=i2;answer[1]=i;}
                else {answer[1]=i2;answer[0]=i;}
            }
        }
        return answer;
    }
}
