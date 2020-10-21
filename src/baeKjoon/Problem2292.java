package baeKjoon;

import java.util.Scanner;

public class Problem2292 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=1,i=1;
		for(;b<a;i++){
			b=b+(i*6);
		}
		sc.close();
	}
}
