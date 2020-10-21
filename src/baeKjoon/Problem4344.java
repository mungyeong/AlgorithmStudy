package baeKjoon;

import java.util.*;

public class Problem4344 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=sc.nextInt();i>0;i--) {
			int a=sc.nextInt(),a1[]=new int[a],a2=0;
			Double b=0.0,c=0.0;
			for(int i1=0;a>i1;i1++) {
				a1[i1]=sc.nextInt();
				b+=a1[i1];
			}
			for(int i1:a1){
				if(i1>b/a) {
					a2++;
				}
			}
			c=(double) Math.round((double)a2/a*100*1000)/1000.000;
			System.out.printf("%.3f%%\n",c);
		}
		sc.close();
	}
}
