package baeKjoon;

import java.util.*;

public class Problem8958 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=0;a>i;i++) {
			String c=sc.next();
			int d=c.length(),e=0, i2=0;
			for(int i1=0;d>i1;i1++) {
				if('O'==c.charAt(i1)) {
					i2++;e+=i2;
				}
				else {
					i2=0;
				}
			}
			System.out.println(e);
		}
		sc.close();
	}
}
