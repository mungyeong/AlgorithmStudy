package programmers;

import java.util.*;

public class Problem64061 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer>[] a = new ArrayList[board[0].length];
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<board[0].length;i++){
            a[i]=new ArrayList<>();
            for(int i1=0;i1<board.length;i1++){
                if(board[i1][i]>0){a[i].add(board[i1][i]);}
            }
        }
        for(int i:moves){
            if(a[i-1].size()>0){
                b.add(a[i-1].get(0));
                a[i-1].remove(0);
            }
        }
        for(int i=0;b.size()-1>i;){
            if (b.get(i) == b.get(i + 1)) {
            b.remove(i);
            b.remove(i);
            answer += 2;
            if (i > 0) {i--;}
            }
            else {i++;}
        }
        return answer;
    }
}
