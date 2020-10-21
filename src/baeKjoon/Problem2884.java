package baeKjoon;

import java.util.Scanner;

class Problem2884 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		b=b-45;
		if(b<0) {
			a=a-=1;
			if(a<0) {a+=24;}
			b=b+=60;
			System.out.println(a+" "+b);
			}
		else {System.out.println(a+" "+b);}
	s.close();
	}
}

