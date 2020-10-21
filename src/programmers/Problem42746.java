package programmers.sort;

import java.util.*;

public class Problem42746 {
    public String solution(int[] numbers) {
        String[] answer = new String[numbers.length];
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < numbers.length; i++)
            answer[i] = String.valueOf(numbers[i]);
        Arrays.sort(answer,(a1,a2) -> (a2+a1).compareTo(a1+a2));
        if(answer[0].equals("0")) return "0";

        for(String i:answer){
            a.append(i);
        }

        return a.toString();
    }

}
