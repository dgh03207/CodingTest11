package com.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

//최적 경로
public class SW1247 {

	static int[] Company,Home;
	static int[][] Customer;
	static int distance;
	static int N;
	static boolean[] selected;
	static int cnt;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			N = Integer.parseInt(br.readLine());		// 고객의 수를 받아옴
			StringTokenizer st = new StringTokenizer(br.readLine());
			distance = Integer.MAX_VALUE;
			
			cnt = 0;
			Company = new int[2];
			Home = new int[2];
			Customer = new int[N][2];
			
			Company[0] = Integer.parseInt(st.nextToken());
			Company[1] = Integer.parseInt(st.nextToken());
			
			Home[0] = Integer.parseInt(st.nextToken());
			Home[1] = Integer.parseInt(st.nextToken());
			
			for (int n = 0; n < N; n++) {
				Customer[n]=new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
			}
			
			int[] present = Company;

			selected = new boolean[N];
			tracker(0,Company,0);
			
			sb.append(" "+distance+"\n");
		}//for문
		System.out.println(sb.toString());
	}//main
	
	private static void tracker(int cnt,int[] present,int dist) {
		if (cnt==N) {
			dist += getDistance(present[0],present[1],Home[0],Home[1]);
			if(dist<distance) distance =dist;
			
		}
		
		for (int i = 0; i < N; i++) {					//고객의 수만큼 돈다.
			if(selected[i]) continue;
			
			selected[i] = true;
			int d = getDistance(present[0],present[1],Customer[i][0],Customer[i][1]);
			
			tracker(cnt+1,Customer[i],dist+d);
			selected[i] = false;
		}
		
	}
	
	
	private static int getDistance(int x1,int y1,int x2,int y2) {
		return Math.abs(x1-x2)+Math.abs(y1-y2);
	}
}
