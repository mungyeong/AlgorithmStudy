package baeKjoon;

import java.util.*;

public class Problem2675 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for (int a=0,b=sc.nextInt();a<b;a++) {
			int c=sc.nextInt();
			String d=sc.next();
			for(int i=0;i<d.length();i++) {
				for(int i1=0;i1<c;i1++) {
					System.out.print(d.charAt(i));
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
