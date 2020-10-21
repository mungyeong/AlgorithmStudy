package programmers;

import java.util.*;

public class Problem42579 {
    public int[] solution(String[] genres, int[] plays) {
        List<Integer> b = new LinkedList<>();
        Map<String,Integer> a = new TreeMap<>();
        for(int i=0;i<plays.length ;i++){
            a.put(genres[i],a.getOrDefault(genres[i],plays[i]));
        }
        for(int o: a.values()){
            System.out.println(o);
        }




        return new int[]{1,2} ;
    }
}
