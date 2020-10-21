package baeKjoon;

import java.util.*;
public class Problem11399 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),c=0;
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		for(int i=0;i<a;i++){
			c+=re(i,b);
		}
		System.out.println(c);
		sc.close();
	}
	private static int re(int a, int[] b){
		if(a<1)return b[a];
		else return re(a-1,b)+b[a];
	}
}
