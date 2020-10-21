package programmers;

import java.util.*;

public class Problem42586 {
    public int solution(int[] progresses, int[] speeds) {
        int[]  a = new int[progresses.length];
        LinkedList<Integer> b= new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int i1 = 100 - progresses[i], i2 = speeds[i];
            a[i] = (int) (i1 / i2) + (i1 % i2 == 0 ? 0 : 1);
        }




        return 1;
    }
}
