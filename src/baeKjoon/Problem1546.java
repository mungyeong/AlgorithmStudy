package baeKjoon;

import java.util.*;

public class Problem1546 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Double[] b= new Double[a];
		Double c= 0.0,d= 0.0;
		for (int i=0;i<a;i++) {
			b[i]=sc.nextDouble();
		}
		for(int i=0;i<a ;i++) {
			if(c<b[i]) {
				c=b[i];
			}
			if(i==(a-1)) {
				for(int i1=0;i1<a ;i1++) {
					b[i1]=b[i1]/c*100.0;
				}
			}
		}
		for(Double i:b)
		{
			d+=i;
		}
		System.out.println(d/a);
		sc.close();
	}
}
