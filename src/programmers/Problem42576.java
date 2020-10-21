package programmers;

import java.util.*;

public class Problem42576 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> a =new HashMap<>();
        for(String b:participant) {
            if(a.containsKey(b)) a.put(b,a.get(b)+1);
            else a.put(b,0);
        }
        for(String b:completion) {
            if(a.get(b).intValue()>0)a.put(b,a.get(b)-1);
            else a.remove(b);
        }
        return a.keySet().toString().replaceAll("\\[|\\]","");
    }
}
