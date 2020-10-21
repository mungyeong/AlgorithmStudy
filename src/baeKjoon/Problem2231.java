package baeKjoon;

import java.util.Scanner;
import java.lang.Math;


public class Problem2231 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=0,e=1;
		for(int i=1;i<a;i++){
			int n=(int)(Math.log10(i)+1),i1=i,i2=0;
			if(n>1){
				for(int i3=0;i3<n;i3++){
					i2+=i1%10;
					i1/=10;
				}
			}
			b=i+i2;
			if(b==a) {
				e=0;b=i;break;
			}
		}
		System.out.println(e==0?b:0);
		sc.close();
	}
}
