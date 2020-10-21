package baeKjoon;

public class Problem15596 {
		long sum(int[] a) {
	        long b = 0;
	        for(int i:a)b+=i;
	        return b;
		}
		public static void main(String[] args) {
			Problem15596 a=new Problem15596();
			int b[]=new int[100];
			for(int i=1,i1=0;i<=100;i++,i1++) {
				b[i1]=i;
			}
			System.out.println(a.sum(b));
		}
}
