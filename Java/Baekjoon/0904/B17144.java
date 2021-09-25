package com.algo2.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B17144 {

	static int R, C, T, map[][];
	static int[] dr = { 1, 0, -1, 0 };
	static int[] dc = { 0, 1, 0, -1 };
	static Queue<int[]> queue = new LinkedList<>();
	static int[] aircleaner;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		map = new int[R][C];
		aircleaner = new int[2];
		int a = 0;
		for (int r = 0; r < R; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < C; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
				if (map[r][c] != 0 && map[r][c] != -1) {
					queue.add(new int[] { c, r });
				}
				if (map[r][c] == -1) {
					aircleaner[a++] = r;
				}

			}
		}

		Arrays.sort(aircleaner);
		spread();
		print();
//
//		for (int t = 0; t < T; t++) {
//			spread();
//			clean();
//
//		}
	}

	private static boolean isRange(int x, int y) {
		return x >= 0 && x < C && y >= 0 && y < R;
	}

	private static void print() {
		for (int i = 0; i < R; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
	}
	
	private static void spread() {
		int size = queue.size();

		if (!queue.isEmpty()) {
			for (int i = 0; i < size; i++) {

				int[] dust = queue.poll();
				int den = map[dust[1]][dust[0]];
				int cnt = 0;
				// cnt구하는 배열
				for (int j = 0; j < 4; j++) {
					int nx = dust[0] + dr[j];
					int ny = dust[1] + dc[j];

					if (isRange(nx, ny) && map[ny][nx] != -1) {
						cnt++;
					}
				} // 사방 탐색

				den = (int)Math.floor(den/5);
				int origin = map[dust[1]][dust[0]];
				origin = origin - den * cnt;
				if (origin > 0) {
					map[dust[1]][dust[0]] = origin;
					
					for (int j = 0; j < 4; j++) {
						int nx = dust[0] + dr[j];
						int ny = dust[1] + dc[j];

						if (isRange(nx, ny) && map[ny][nx] != -1) {
							map[ny][nx] = map[ny][nx]+den;
						}
					} // 사방 탐색
				}
			}
		} // queue가 비어있는지 확인
	}// spread 종료문

	private static void clean() {
		
	}
}
