package programmers;

import java.util.*;

public class Problem42578 {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String[] key : clothes) {
            map.put(key[1], map.getOrDefault(key[1], 0)+1);
        }
        int answer = 1;
        for(int i: map.values()){
            answer=answer*(i+1);
        }
        return answer-1;
    }
}
