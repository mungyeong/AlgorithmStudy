package baeKjoon;

import java.util.Scanner;

class Problem1330 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0,b=0;
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		{System.out.println(">");}
		else if(a<b)
		{System.out.println("<");}
		else
		{System.out.println("==");}
		s.close();
	}
}
