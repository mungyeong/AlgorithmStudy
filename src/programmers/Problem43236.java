package programmers;

import java.util.Arrays;

public class Problem43236 {
    public static int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);
        int left = 0, mid = 0, right = distance;
        while (left <= right) {
            mid = (left + right) / 2;
            int prv = 0;
            int removeCnt = 0;
            for (int i : rocks) {
                if (i - prv < mid) {
                    removeCnt++;
                    if (removeCnt > n) {
                        break;
                    }
                } else {
                    prv = i;
                }
            }
            if (removeCnt > n) {
                right = mid - 1;
            } else {
                answer = Math.max(answer, mid);
                left = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println((Problem43236.solution(25, new int[]{2, 14, 11, 21, 17}, 2)));
    }
}
