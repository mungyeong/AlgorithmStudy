package baeKjoon;

import java.util.Scanner;

class Problem9498 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0;
		a=s.nextInt();
		int b =a/10;
		switch (b) {
		case 10:
		case 9: System.out.println("A");break;
		case 8: System.out.println("B");break;
		case 7: System.out.println("C");break;
		case 6: System.out.println("D");break;
		default:System.out.println("F");break;
		}
		s.close();
	}
}
