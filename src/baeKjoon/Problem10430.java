package baeKjoon;

import java.util.Scanner;

class Problem10430 {

	public static void main(String[] args) {
		int a=0,b=0, c=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		s.close();
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}
