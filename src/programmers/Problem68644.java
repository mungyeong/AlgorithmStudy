package programmers;


import java.util.*;

public class Problem68644 {
    public int[] solution(int[] numbers) {
        LinkedList<Integer> a = new LinkedList<>();
        for(int i=0;numbers.length>i;i++){
            for(int i1=0;numbers.length>i1;i1++){
                if(!(i==i1)){
                    if(!a.contains(numbers[i]+numbers[i1])){
                        a.add(numbers[i]+numbers[i1]);
                    }
                }
            }
        }
        int[] answer = new int[a.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=a.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
