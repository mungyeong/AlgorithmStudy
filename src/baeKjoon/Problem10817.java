package baeKjoon;

import java.util.*;
class Problem10817 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Integer a[]= {s.nextInt(),s.nextInt(),s.nextInt()};
		Arrays.sort(a);
		System.out.println(a[1]);
		s.close();
	}
}
