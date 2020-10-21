package baeKjoon;

import java.util.*;

public class Problem2908 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		StringTokenizer a=new StringTokenizer(new Scanner(System.in).nextLine());
		StringBuffer b=new StringBuffer(a.nextToken().toString()).reverse(),c=new StringBuffer(a.nextToken().toString()).reverse();
		int b1=Integer.parseInt(b.toString()), c1=Integer.parseInt(c.toString());
		System.out.println(b1>c1?b1:c1);
	}
}
