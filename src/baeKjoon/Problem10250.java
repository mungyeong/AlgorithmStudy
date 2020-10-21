package baeKjoon;

import java.util.Scanner;

public class Problem10250 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] s=new int[a];
		for (int i=0;i<a;i++){
			int b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
			System.out.println((d%b==0?((d/b)+(b*100)):((d%b*100)+(d/b+1))));
		}
		sc.close();
	}
}
