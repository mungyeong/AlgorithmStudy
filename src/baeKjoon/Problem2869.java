package baeKjoon;

import java.util.Scanner;

public class Problem2869 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		System.out.println((c-b-1)/(a-b)+1);
		sc.close();
	}
}
