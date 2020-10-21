package baeKjoon;

import java.util.Scanner;
class Problem1110 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt(),i1=i;
		int	count=0;
		while(true) {
			i1=((i1%10)*10) + (((i1/10)+(i1%10))%10);
			count++;
			if(i==i1){
				System.out.println(count);
				break;
			}
		}
		sc.close();
	}
}