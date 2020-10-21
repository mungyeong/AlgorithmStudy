package baeKjoon;
import java.util.*;

public class Problem1316 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),c=0,i=0;
        while(a --> 0){
            String b=sc.next();
            boolean b1[]=new boolean[26];
            for(boolean b2:b1){
                System.out.println(b2);
            }
            for(i=0;i<b.length();i++){
                if(!(b1[b.charAt(i)-'a'])){
                        b1[b.charAt(i)-'a']=true;
                }
                else if(b.charAt(i)==b.charAt(i-1)&&i>0){

                }
                else{
                    break;
                }
                if(i==b.length()-1){
                    c+=1;
                }
            }
        }
        System.out.println(c);
        sc.close();
    }
}
