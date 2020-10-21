package baeKjoon;

import java.io.*;
import java.util.*;
class Problem15552 {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter p=new BufferedWriter((new OutputStreamWriter(System.out)));
		st=new StringTokenizer(s.readLine());
		int a=Integer.parseInt(st.nextToken()),d[] = new int[a];	
		for (int i=0,b=0,c=0;i<a;i++) {
			st=new StringTokenizer(s.readLine());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            d[i]=b+c;
		}
		for(int i:d) {
			p.write(String.valueOf(i));
			p.newLine();
		}p.flush();
	}
}
