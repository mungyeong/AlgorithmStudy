package baeKjoon;

import java.util.*;
class Problem8393 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a= s.nextInt(),total=0;
		for(int i=1;a>=i;i++) {
			total+=i;
		}
		System.out.println(total);
		s.close();
	}
}
