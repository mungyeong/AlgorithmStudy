package baeKjoon;

import java.util.Scanner;

public class Problem1712 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),i=-1,b=sc.nextInt(),c=sc.nextInt();
		c=c-b;
		if(c>0) {
			for (i = 1; c * i <= a; i += 1);
		}
		System.out.println(i);
		sc.close();
	}
}
