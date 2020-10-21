package baeKjoon;

import java.util.Scanner;

public class Problem7568 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b[][]=new int [a][3];
		for(int i=0;i<a;i++){
			b[i][0]=sc.nextInt();b[i][1]=sc.nextInt();b[i][2]=1;
		}
		for(int i=0;i<a;i++){
			for(int i1=0;i1<a;i1++){
				if(i1!=i){
					if(b[i][0]<b[i1][0]&&b[i][1]<b[i1][1])b[i][2]++;
				}
			}
		}
		for (int i=0;i<a;i++) {
			System.out.print(b[i][2]+(i+1==a?"":" "));

		}
		sc.close();
	}
}
