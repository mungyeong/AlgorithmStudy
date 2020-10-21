package baeKjoon;

import java.util.Scanner;

class Problem2577 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {sc.nextInt(),sc.nextInt(),sc.nextInt()},tot=a[0]*a[1]*a[2],b[]=new int[10];
		for(;tot>0;tot/=10){
			b[(int)tot%10]++;
		}
		for(int b1:b) {
			System.out.println(b1);
		}
		sc.close();
	}
}
