package baeKjoon;

import java.util.Scanner;
public class Problem10872 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int k = sc.nextInt();
			System.out.println(re(k));
			sc.close();
		}
	private static int re(int k) {
		if (k <= 0)
			return 1;
		else {
			return k-- * re(k);
		}
	}
}
