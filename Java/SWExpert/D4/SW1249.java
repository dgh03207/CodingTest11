package com.algo2.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SW1249 {
	static int N,map[][],cost[][];
	static int[] dr = {0,1,0,-1};
	static int[] dc = {1,0,-1,0};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			
			map = new int[N][N];
			cost = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				int j= 0;
				for (String s : br.readLine().split("")) {
					map[i][j++] = Integer.parseInt(s);
				}
				Arrays.fill(cost[i], Integer.MAX_VALUE);
			}
			
			dij();
			
			sb.append(cost[N-1][N-1]+"\n");
		}
		System.out.println(sb.toString());
	
	}
	
	private static boolean isRange(int x, int y) {
		return x>=0&& x<N&&y>=0&&y<N;
	}
	
	private static void dij() {
		PriorityQueue<Edge> queue = new PriorityQueue<Edge>();
		cost[0][0] = map[0][0];
		queue.add(new Edge(0,0,map[0][0]));
		
		while(!queue.isEmpty()) {
			Edge now = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = now.x+dc[i];
				int ny = now.y+dr[i];
				
				if(isRange(nx,ny)) {
					if(cost[ny][nx] > cost[now.y][now.x]+map[ny][nx]) {
						cost[ny][nx] = cost[now.y][now.x]+map[ny][nx];
						queue.add(new Edge(nx,ny,map[ny][nx]));
					}
					
				}
			
			}
			
		}
	}
	
	static class Edge implements Comparable<Edge>{
		int x;
		int y;
		int c;
		public Edge(int x, int y, int c) {
			super();
			this.x = x;
			this.y = y;
			this.c = c;
		}
		
		@Override
		public int compareTo(Edge o) {
			return this.c-o.c;
		}
		
		
	}
}
