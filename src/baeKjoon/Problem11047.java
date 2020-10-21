package baeKjoon;

import java.util.Scanner;

public class Problem11047 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt(),b=sc.nextInt(),d=0;
		int a[]=new int[c];
		while (c-->0){
			a[c] = sc.nextInt();
		}
		for(int i:a){
			if(b/i>0)
			{ d+=b/i;b%=i;}
		}
		System.out.println(d);
		sc.close();
	}
}
