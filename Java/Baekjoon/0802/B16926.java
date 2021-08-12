package com.day8;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B16926 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 }; // 배열 시계반대방향 회전
	static int H; // 배열 크기 세로 길이
	static int W; // 배열 크기 가로 길이
	static int R; // 배열 회전수
	static String[][] table; // 배열이 저장되는 테이블
	static int x, y = 0; // 현재 요소의 위치
	static StringBuilder sb = new StringBuilder();
	static Queue<String> queue = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 배열 크기 세로 길이
		int M = Integer.parseInt(st.nextToken()); // 배열 크기 가로 길이
		R = Integer.parseInt(st.nextToken()); // 배열 회전 수

		table = new String[N][M];
		int n = 0;
		for (int x = 0; x < N; x++) {
			st = new StringTokenizer(br.readLine());
			for (int y = 0; y < M; y++) {
				table[x][y] = st.nextToken();
			}
		}
		H = N;
		W = M;
		rotate(R);

		for (int x = 0; x < N; x++) {
			for (int y = 0; y < M; y++) {
				sb.append(table[x][y] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

	static void rotate(int cnt) {
		if (cnt == 0) {
			if (H-2>=2 && W-2>=2) {
				
				cnt = R;
				H -= 2;
				W -= 2;
				queue.clear();
				x++;
				y++;
			}
			else if (cnt == 0 && (H-2<2 || W-2 <2)) 
			return;

		}

		int temp = 0;
		queue.add(table[x][y]);
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				for (int n = 0; n < H - 1; n++) {
					x += dx[i];
					y += dy[i];
					queue.add(table[x][y]);
					table[x][y] = queue.poll();
				}
			}
			if (i % 2 == 1) {
				for (int m = 0; m < W - 1; m++) {
					x += dx[i];
					y += dy[i];
					queue.add(table[x][y]);
					table[x][y] = queue.poll();
				}
			}
		}
		queue.clear();
		rotate(--cnt);

	}
}