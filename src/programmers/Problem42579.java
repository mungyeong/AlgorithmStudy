package programmers;

import java.util.*;


public class Problem42579 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> total = new HashMap<>();
        Map<Integer, String> rank = new TreeMap<>();
        Map<String, LinkedList<Integer>> index = new HashMap<>();
        LinkedList<Integer> answertemp = new LinkedList<>();
        for (int i=0;i<genres.length;i++) {
            total.put(genres[i],total.getOrDefault(genres[i],0)+plays[i]);
            if(!index.containsKey(genres[i])){
                index.put(genres[i],new LinkedList<>(Collections.singletonList(i)));
            } else {
                LinkedList<Integer> index1 = index.get(genres[i]);
                if(index1.size()>1){
                    if(plays[index1.get(0)]<plays[i]){
                        index1.remove(1);
                        index1.addFirst(i);

                    }else if(plays[index1.get(1)]<plays[i]){
                        index1.remove(1);
                        index1.addLast(i);
                    }
                } else {
                    if (plays[index1.get(0)]<plays[i]) {
                        index1.addFirst(i);
                    }
                    else {
                        index1.addLast(i);
                    }
                }
            }
        };
        for(String i:total.keySet()){
            int ranktemp = 1;
            for (String i1:total.keySet()){
                if(i1.equals(i));
                else if(total.get(i1)>total.get(i)){
                    ranktemp ++;
                }
            }
            rank.put(ranktemp,i);
        }
        for (int i:rank.keySet()){
            String r = rank.get(i);
            answertemp.addAll(index.get(r));
        }
        int answer[] = new int[answertemp.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=answertemp.get(i);
        }
        return answer;
    }
}
