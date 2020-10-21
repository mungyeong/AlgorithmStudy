package baeKjoon;

import java.util.Scanner;

public class Problem14681 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println(a>0?(b>0?1:4):(b>0?2:3));
		sc.close();
	}
}