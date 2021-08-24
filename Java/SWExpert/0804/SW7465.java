package com.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SW7465 {
	static int N,M,cnt;
	static int[] parent;
	static boolean[] roots;
	private static void make() {
		parent = new int[N];
		roots = new boolean[N];
		for (int i = 0; i < N; i++) {
			parent[i] = i;
			roots[i] = true;
		}
	}
	private static int find(int a) {
		if(parent[a]==a) return a;
		return parent[a]= find(parent[a]);
	}
	
	private static void union(int a, int b) {
		int aRoot = find(a);
		int bRoot = find(b);
		if(aRoot==bRoot) {
			roots[aRoot] = true;
		}else {
			parent[bRoot] = aRoot;
			roots[bRoot] = false;
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			cnt = 0;
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());			//관계의 수
			make();
			
			for (int m = 0; m < M; m++) {
				st = new StringTokenizer(br.readLine());
				int a= Integer.parseInt(st.nextToken())-1;
				int b= Integer.parseInt(st.nextToken())-1;
				
				union(a,b);
			}
			
			for (int n = 0; n < N; n++) {
				if(roots[n])cnt ++;
			}
			
			sb.append(cnt+"\n");
		}
		
		System.out.println(sb.toString());
	}
}
