package baeKjoon;

import java.util.Scanner;

class Problem2438 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=1;i<=a;i++) {
			for(int i1=0;i1<i;i1++) {
				System.out.print("*");
				}
			System.out.println("");
			}
		s.close();
	}
	}
