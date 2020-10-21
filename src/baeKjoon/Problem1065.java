package baeKjoon;

import java.util.*;

public class Problem1065 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=99;
		if(a<100) {b=a;}
		else {
		for(int i=100;i<=a;i++) {
			int a1=(i/100) ,a2=(i/10)%10, a3=i%10;
			if(a1-a2==a2-a3)
			{
				b++;
			}
		}
		}
		System.out.println(b);
		sc.close();
	}
}
