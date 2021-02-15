package programmers;

public class Problem12909 {
    boolean solution(String s) {
        int a = 0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') {
               a++;
            } else if (s.charAt(i)==')' && a > 0){
                a--;
            } else {
                return false;
            }
        }
        if(a>0) {
            return false;
        }
        return true;
    }
}
