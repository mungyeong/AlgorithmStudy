package baeKjoon;

import java.util.*;

public class Problem10809 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b= new String("abcdefghijklmnopqrstuvwxyz");
		for(int i=0;b.length()>i;i++){
			System.out.print(a.indexOf(b.charAt(i))+" ");
		}
		sc.close();
	}
}
