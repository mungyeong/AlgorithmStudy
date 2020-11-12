package programmers;

public class Problem62048 {
    public long solution(int w, int h) {
        long answer = w+h,big = w>h?w:h,small = w>h?h:w,r=0,b=w*h;
        do{
            r = big%small;
            if(r==0) break;
            big = small;
            small = r;
        }while (r!=0);
        answer-=small;
        return b-answer;
    }
}
