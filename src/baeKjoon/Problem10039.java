package baeKjoon;

import java.util.Scanner;

public class Problem10039 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++){
			int a=sc.nextInt();
			sum+=(a>39?a:40);
		}
		System.out.println((int)sum/5);
		sc.close();
	}
}
