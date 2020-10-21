package baeKjoon;

import java.util.*;
class Problem10950 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a= s.nextInt();
		Integer[] b=new Integer[a*2];
		for (int b1=0;b1<(a*2);b1++) {
			b[b1]=s.nextInt();
		}
		for (int b2=0;b2<(a*2);b2=b2+2) {
			System.out.println(b[b2]+b[b2+1]);
		}
		s.close();
	}
}
