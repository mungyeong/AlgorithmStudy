package baeKjoon;

import java.util.Scanner;

class Problem11021 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int a1[]=new int[a*2];
		for(int i=0;i<(a*2);i+=2) {
			a1[i]=s.nextInt();
			a1[i+1]=s.nextInt();
		}
		for(int i=0,i1=1;i<(a*2);i+=2,i1++) {
			System.out.println("Case #"+i1+": "+(a1[i]+a1[i+1]));
		}
		s.close();
	}
}