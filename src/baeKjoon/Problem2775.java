package baeKjoon;

import java.util.Scanner;

public class Problem2775 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int c=0;c<T;c++){
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(re(k, n));
		}
		sc.close();
	}
	private static int re(int k, int n) {
		if (n == 0)
			return 0;
		else if (k == 0)
			return n;
		else {
			return re(k, n - 1) + re(k - 1, n);
		}
	}
}
