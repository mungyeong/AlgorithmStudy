package programmers.sort;

import java.util.*;

public class Problem42747 {
    public int solution(int[] citations) {
        int answer = 0,h=0,k=0,l=citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < l; i++) {
            h = citations[i];
            k =  l - i;
            if (k <= h) {
                answer = k;
                break;
            }
        }
        return answer;
    }
}
