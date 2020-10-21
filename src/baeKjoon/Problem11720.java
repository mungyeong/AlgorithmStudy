package baeKjoon;

import java.util.*;

public class Problem11720 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=0;
		String c=sc.next();
		for(int i=0;i<a;i++){
			b+=c.charAt(i)-'0';
		}
		System.out.println(b);
		sc.close();
	}
}
