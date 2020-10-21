package baeKjoon;

import java.util.Scanner;

class Problem2439 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int a=s.nextInt(), i=1;i<=a;i++) {
			for(int i1=a;i1>0;i1--) {
				if(i1<=i) {
					System.out.print("*");
				}
				else	{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		s.close();
	}
}
