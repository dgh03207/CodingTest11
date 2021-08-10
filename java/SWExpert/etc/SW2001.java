package com.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SW2001 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());		//테스트 케이스 갯수 받기
		for (int t = 0; t < T; t++) {
			String[] sizes  = br.readLine().split(" ");
			int N = Integer.parseInt(sizes[0]);			//파리배열 크기
			int M = Integer.parseInt(sizes[1]);			//파리채 크기
			int [][] flyswatter = new int[M][M];
			
			int[][] flies = new int[N][N];				//빈 파리 배열 생성
			for (int n = 0; n < N; n++) {
				flies[n] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			
			int max = 0;
			for (int i = 0; i < N-M+1; i++) {
				for (int j = 0; j < N-M+1; j++) {
					int sum = 0;
					for (int m = 0; m <M; m++) {
						for (int m1 = 0; m1 < M; m1++) {
							sum += flies[i+m][j+m1];
						}
					}
					if (max < sum) max = sum;
				}
			}
			System.out.println("#"+(t+1)+" "+max);
			
			
		}
		
	}
}
