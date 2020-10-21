package baeKjoon;

import java.util.Scanner;

public class Problem10870 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        System.out.println(re(a));
		sc.close();
	}
	private static int re(int a){
		if(a<3){return a==0?0:1;}
		else{return re(a-1)+re(a-2);}
	}
}
