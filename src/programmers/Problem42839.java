package programmers;

import java.util.*;

public class Problem42839 {
    private Set<Integer> b= new HashSet<>();
    public int solution(String numbers) {
        char a[] = new char[numbers.length()];
        for(int i=0;i<numbers.length();i++) {
            a[i] = numbers.charAt(i);
            isprime(a[i]-'0');
        }
        for(int i=0;i<a.length;i++){
            char[] result = new char[a.length-1];
            System.arraycopy(a, 0, result, 0, i);
            System.arraycopy(a, i + 1, result, i, a.length - i - 1);
            Combination(a[i]-'0',result,10);
        }
        return b.size();
    }
    private void isprime(int a){
        if(a <=1){return;}
        for (int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return;
            }
        }
        b.add(a);
    }
    private void Combination(int i,char[] a,int i1){
        for(int i2=0;i2<a.length;i2++){
            char[] result = new char[a.length-1];
            int i3 = ((a[i2]-'0')*i1)+i;
            System.arraycopy(a, 0, result, 0, i2);
            System.arraycopy(a, i2 + 1, result, i2, a.length - i2 - 1);
            isprime(i3);
            Combination(i3,result,(i1*10));
        }
    }
}