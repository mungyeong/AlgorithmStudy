package baeKjoon;

import java.util.*;

public class Problem4673 {
	public static void main(String[] args) {
		Set<Integer> a=new HashSet<Integer>();
		for (int i=1;i<=10000;i++) {
			a.add(i);
		}
		for(int i=1;i<=10000;i++){
			int i2, i3=i,i1=i;
			for(i2=10;i1/i2!=0;i2*=10);
			i2/=10;
			for(int i4=i2;i4>0;i4/=10) {
				i3+=i1/i4;
				i1%=i4;
			}
			i3+=i1%10;
			a.remove(i3);
		}	
		for(int i:a) {
			System.out.println(i);
		}
	}
}
