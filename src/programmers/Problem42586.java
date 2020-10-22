package programmers;

import java.util.*;

public class Problem42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> a= new LinkedList<>();
        LinkedList<Integer> b= new LinkedList<>();
        LinkedList<Integer> answer= new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            a.add(progresses[i]);
            b.add(speeds[i]);
        }
        while (a.size()>0&&b.size()>0){
            int i=0;
            if(a.getFirst()>=100){
                for(;i<a.size()&&a.get(i)>=100;i++);
                answer.add(i);
                for(int i1=0;i1<i;i1++){
                    a.removeFirst();
                    b.removeFirst();
                }
            }
            else {
                for(int i1=0;i1<a.size();i1++){
                    if(a.get(i1)<100) {
                        a.set(i1, a.get(i1) + b.get(i1));
                    }
                }
            }
        }
        int[] answer1 = new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            answer1[i]=answer.get(i);
        }
        return answer1;
    }
}
