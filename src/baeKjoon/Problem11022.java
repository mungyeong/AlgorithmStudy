package baeKjoon;

import java.util.Scanner;

class Problem11022 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			int b=s.nextInt();
			int c=s.nextInt();
			System.out.println("Case #"+i+": "+b+" + "+c+" = "+(b+c));
		}
		s.close();
	}
}
