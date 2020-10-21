package baeKjoon;

import java.util.*;

public class Problem2941 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] a=new String[] {"dz=","c=","c-","d-","lj","nj","s=","z="};
		String b=sc.nextLine().trim();
		for(String i:a) {
			b=b.replaceAll(i,"*");
		}
		System.out.println(b.length());
		sc.close();
	}
}
