package baeKjoon;

import java.util.Scanner;
import java.lang.Math;

public class Problem2798 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),c=sc.nextInt(),e=0;
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i+2<a;i++){
			for(int i1=i+1;i1+1<a;i1++){
				for(int i2=i1+1;i2<a;i2++){
					int d=b[i]+b[i1]+b[i2];
					System.out.println(b[i]+b[i1]+b[i2]+" "+e+" "+c );
					if(c==d){
						e=c;
						break;
					}
					else if(c-e>c-d&&d<=c){
						e=d;
					}
					System.out.println(e);
				}
			}
		}
		System.out.println(e);
		sc.close();
	}
}
