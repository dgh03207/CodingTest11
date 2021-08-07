package com.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SW3499 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테케 갯수
		
		
	

		
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine()); // 카드 갯수
			String[] cards = new String[N];
			String[] answer = new String[N];
			cards = br.readLine().split(" ");
			int n = 0;
			if (N % 2 == 0) { // 사이즈가 짝수일때
				int back = N / 2;
				for (int i = 0; i < N / 2; i++) {
					answer[n++] = cards[i];
					answer[n++] = cards[back + i];
				}
			} else {
				int back = N / 2;
				n = 0;
				for (int i = 0; i <= (N / 2); i++) {
					answer[n++] = cards[i];
					if (back + i+1 < N)
						answer[n++] = cards[back + i+1];
				}
			}

			System.out.print("#"+(t+1)+" ");
			for (String s : answer) {
				System.out.print(s+" ");
			}
			System.out.println();
		}

	}
}
