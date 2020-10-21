package baeKjoon;

import java.util.Scanner;

class Problem2562 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=0,maxnum=0;
		Integer b[]=new Integer[9];
		for(int i=0;i<9;i++){
			b[i]=sc.nextInt();
			if(max<b[i]) {maxnum=i;max=b[i];
			}
		}
		System.out.print(max+"\n"+(maxnum+1));
		sc.close();
	}
}
