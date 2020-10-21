package baeKjoon;

import java.util.Scanner;

public class Problem1193 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),sum=1,i=1;
		for(i=1;sum<a;i++,sum+=i);
		sum-=i;a-=sum+1;
		if(i%2==0) System.out.println((1+a)+"/"+(i-a));
		else System.out.println((i-a)+"/"+(1+a));
		sc.close();
	}
}
