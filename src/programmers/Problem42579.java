package programmers;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.*;

public class Problem42579 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String,Integer> a = new LinkedHashMap<>();
        Map<String,Integer> b = new HashMap<>();
        for(int i=0;i<genres.length;i++) {
            a.put(genres[i], plays[i]);
            b.put(genres[i],b.getOrDefault(genres[i],0)+plays[i]);
        }



        return new int[]{1,2} ;
    }


}
