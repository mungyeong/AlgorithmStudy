package baeKjoon;

import java.util.*;
class Problem2920 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b[]=new int[8];
		for(int i=0;i<8;i++) {
			b[i]=sc.nextInt();
		}
		if(b[0]==1&&b[1]==2&&b[2]==3&&b[3]==4&&b[4]==5&&b[5]==6&&b[6]==7&&b[7]==8) {
			System.out.println("ascending");
		}
		else if(b[0]==8&&b[1]==7&&b[2]==6&&b[3]==5&&b[4]==4&&b[5]==3&&b[6]==2&&b[7]==1) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
		sc.close();
	}
}
