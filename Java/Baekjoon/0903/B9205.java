package com.algo2.day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//맥주 마시면서 걸어가기
public class B9205 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
//		StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());

		ArrayList<Point> list;
		boolean[][] isConnected;
		
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine());
			list = new ArrayList<>();
			
			for (int i = 0; i < N+2; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				list.add(new Point(x,y));
				
			}
			
			//각 정점별 연결 여부 체크
			isConnected = new boolean[N+2][N+2];
			
			// 하나의 정점에서 다른 정점들간 연결 여부 체크
			// 두 정점간의 거리가 1000m 이하라면 연결 가능 -> true 라고 표시
			
			for (int i = 0; i < N+2; i++) {
				for (int j = i+1; j < N+2; j++) {
					if(getDistance(list.get(i),list.get(j))<=1000) {
						isConnected[i][j] = isConnected[j][i] = true;
					}
				}
			}
			
			Floyd(N,isConnected);
		
			sb.append((isConnected[0][N+1]?"happy":"sad")+"\n");
		}
		System.out.println(sb.toString());
		
	}
	
	private static int getDistance(Point p1, Point p2) {
		return Math.abs(p1.x-p2.x)+Math.abs(p1.y-p2.y);
	}
	
	private static void Floyd(int N,boolean[][] isConnected) {
		for (int n = 0; n < N+2; n++) {
			for (int i = 0; i < N+2; i++) {
				if(n==i) continue;
				
				for (int j = 0; j < N+2; j++) {
					if(i==j || n==j) continue;
					
					if(isConnected[i][n]==true && isConnected[n][j]==true)
						isConnected[i][j] = true;
				}
			}
		}
	}
	
	
	
	static class Point {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		
		
	}
}
