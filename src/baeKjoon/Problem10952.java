package baeKjoon;

import java.util.Scanner;
public class Problem10952 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0)break;
			System.out.println(a+b);
		}while(true);
	sc.close();
	}
}
