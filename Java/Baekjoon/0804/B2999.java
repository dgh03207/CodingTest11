package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//비밀이메일

public class B2999 {
	
	static int R,C,N;
	static char[][] words;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		N = line.length();			//받아온 글자의 길이를 저장함
		getRC(N);
		words = new char[C][R];
		
		
		int n = 0;
		for (int c = 0; c < C; c++) {
			for (int r = 0; r < R; r++) {
				words[c][r] = line.charAt(n++);
			}
		}
		decoding(words);
		System.out.println(sb.toString());
	}
	
	private static void getRC(int N) {
		for (int i = 1; i < N; i++) {
			if(N%i == 0 && i<=(N/i)) {
				R = i;
				C = N/i;
			}
		}
	}
	
	private static void decoding(char[][] words) {
		
		
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				sb.append(words[c][r]);
			}
		}
		
	}
	
	
}
