package baeKjoon;

import java.util.*;

public class Problem3052 {
	public static void main(String[] args) {
		Set<Integer> a=new HashSet<>();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a.add(s.nextInt()%42);
		}
		System.out.println(a.size());
		s.close();
	}
}
