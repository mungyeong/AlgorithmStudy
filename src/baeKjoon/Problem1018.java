package baeKjoon;

import java.util.Scanner;

public class Problem1018 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),e=64;
		String c[]=new String[a];
		for(int i=0;i<a;i++){c[i]=sc.next();}
		for(int p=0;p<2;p++){
			int t=(p==0?'B':'W');
			for(int i=0;i+7<a;i++){
				for(int j=0;j+7<b;j++){
					int t1=0;
			    	for(int i1=i;i1<i+8;i1++){
			    		for(int j1=j;j1<j+8;j1++){
			    			if(c[i1].charAt(j1)==t)t1++;
			    			t=t=='B'?'W':'B';
						}
						t=t=='B'?'W':'B';
					}
					if(t1<e)e=t1;
			    }
			}
		}
		System.out.println(e);
		sc.close();
	}
}