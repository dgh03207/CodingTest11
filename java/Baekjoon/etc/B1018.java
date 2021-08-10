package Algo_04_0805;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1018 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] size = br.readLine().split(" ");
		int M = Integer.parseInt(size[0]);
		int N = Integer.parseInt(size[1]);
		String [][]board = new String[M][N];
		int [] top_l = new int[M];
		int [] bottom_r = new int[M];
		
		for (int m = 0; m < M; m++) {
			board[M] = br.readLine().split(" ");	//board값 넣음	
		}
		
		
		
	}
}
