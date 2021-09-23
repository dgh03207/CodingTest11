package com.algo2.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//해밀턴 순환회로
public class J1681 {
	
	static int[][] map;
	static int N,cost;
	static int min_cost = Integer.MAX_VALUE;
	static boolean[] visited;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//배달해야 하는 장소의 수
		N = Integer.parseInt(st.nextToken());
		visited = new boolean[N];
		map = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		visited[0] = true;
		dfs(0,0,0);
		System.out.println(min_cost);
	}
	
	
	private static void dfs(int current,int chosen,int cost) {
		
		if(chosen==N-1) {
			if(map[current][0]==0) return;
			
			cost+= map[current][0];
			min_cost = Math.min(cost, min_cost);
			return;
		}
		
		
		for (int i = 0; i < N; i++) {
			if(!visited[i]&&map[current][i]!=0&& min_cost > cost+map[current][i]) {
				visited[i] = true;
				dfs(i,chosen+1,cost+map[current][i]);
				visited[i] = false;
			}
		}
	}

}
