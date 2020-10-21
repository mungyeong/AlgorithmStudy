package baeKjoon;

import java.util.Scanner;

public class Problem2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),sum=1000;
        for(int i=0;i<=a/5;i++){
            int b=a-(5*i);
            if(b%3==0&&sum>(b/3+i)){sum=b/3+i;}
        }
        System.out.println(sum<1000 ? sum:-1 );
        sc.close();
    }
}
