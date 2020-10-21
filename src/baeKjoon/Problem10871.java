package baeKjoon;

import java.util.Scanner;

class Problem10871 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int a=s.nextInt(),b=s.nextInt() ,i=1;i<=a;i++) {
			int a1=s.nextInt();
			if(b>a1) {
				System.out.print(a1+" ");
			}
		}
		s.close();
	}
}
