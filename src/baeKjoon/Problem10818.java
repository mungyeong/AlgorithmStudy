package baeKjoon;

import java.util.*;
class Problem10818 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Integer b[]=new Integer[a];
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		System.out.println(b[0].intValue()+" "+b[a-1].intValue());
		
		sc.close();
	}
}
