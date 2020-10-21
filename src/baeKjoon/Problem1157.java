package baeKjoon;

import java.util.*;

public class Problem1157 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next().toUpperCase();
		int b=0;
		char c=0;
		for(int i=65;i<91;i++) {
			int i1=0;
			for(int i2=0;i2<a.length();i2++) {
				if(a.charAt(i2)==(char)i) {i1++;}
			}
			c=(i1>b?(char)i:(i1==b?'?':c));
			b=(i1>b?i1:b);
		}	
		System.out.println(c);
		sc.close();
	}
}
