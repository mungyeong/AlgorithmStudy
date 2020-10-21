package programmers;

public class Problem42585 {
    public int solution(String arrangement) {
        int answer = 0,b=1;
        for (int i=1;i<arrangement.length();i++){
            char a=arrangement.charAt(i);
            char a1=arrangement.charAt(i-1);
            System.out.println(answer+" "+i);
            if(a1=='('&&a==')'){
                b--;
                answer+=b;
            }
            else if(a==')'){
               b--;
               answer+=1;
            }
            else b++;
        }
        return answer;
    }
}
