package baeKjoon;

import java.util.Scanner;

class Problem2588 {

	public static void main(String[] args) {
		int a=0, b=0,tot=0;
		int a1[]=new int[3];
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		tot=a*b;
		a1[0]=b/100;
		b%=100;
		a1[1]=b/10;
		b%=10;
		a1[2]=b;
		a1[0]*=a;
		a1[1]*=a;
		a1[2]*=a;
		System.out.println(a1[2]);
		System.out.println(a1[1]);
		System.out.println(a1[0]);
		System.out.println(tot);
		s.close();
	}
}
