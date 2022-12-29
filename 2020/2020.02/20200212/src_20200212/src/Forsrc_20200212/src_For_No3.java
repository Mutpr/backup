package Forsrc_20200212;

import java.io.*;
public class src_For_No3 {
	public static void main(String args[]) throws IOException {
		
		//Reader reader = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = bf.read();
		int j=0;
		
		for(int i=1; i<=10000000; i++) {
			j+=i;
		}bw.write(j);
	}

}
