package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2138 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int[] bulbs = new int[N];
		int[] answer = new int[N];
		
		String[] temp = br.readLine().split("");
		for (int i = 0; i < N; i++) {
			bulbs[i] = Integer.parseInt(temp[i]);
		}
		temp = br.readLine().split("");
		for (int i = 0; i < N; i++) {
			answer[i] = Integer.parseInt(temp[i]);
		}
		
		turnoff(N,bulbs,answer);
		
		
	}
	
	private static void turnoff(int N, int[] bulbs, int[] answer) {
		
		
	}
	
	
}
