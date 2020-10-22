package programmers;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Problem42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> a = new ConcurrentLinkedDeque<>();
        List<Integer> b = new LinkedList<>();

        int sum =0;
        for(int t:truck_weights){
            while (true){
                if(a.isEmpty()){
                    a.add(t);sum+=t;answer++;break;
                }
                else if(a.size()==bridge_length){
                    sum-=a.poll();
                }else {
                    if(sum+t>weight){
                        answer++;a.add(0);
                    }
                    else {
                        a.add(t);sum+=t;answer++;break;
                    }
                }
            }
        }
        return answer+bridge_length;
    }
}
