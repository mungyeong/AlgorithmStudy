package baeKjoon;

import java.util.*;

public class Problem5622 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[] {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		String b=sc.nextLine();
		int tot=0;
		for(int i=0;i<b.length();i++)tot+=a[b.charAt(i)-65];
		System.out.println(tot);
		sc.close();
	}
}
