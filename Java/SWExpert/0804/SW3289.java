package com.day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW3289 {

	static int M, N; // 입력으로 주어지는 연산의 개수, n이하의 자연수
	static int[] parents;

	private static void make() {
		for (int n = 0; n < N+1; n++) {
			parents[n] = n; // N까지의 배열을 생성함.
		}
	}

	private static int find(int a) {
		if (parents[a] == a)
			return a; 									// root가 무엇인지 찾는 함수
		return parents[a] = find(parents[a]);
	}

	private static int rootCheck(int a, int b) { 		// a,b의 루트가 같은지 체크
		int aRoot = find(a);
		int bRoot = find(b);
		if (aRoot == bRoot)
			return 1;
		else
			return 0;
	}

	private static void union(int a, int b) { 			// a,b를 합집합으로 합침
		int aRoot = find(a);
		int bRoot = find(b);

		if (aRoot != bRoot)
			parents[bRoot] = aRoot;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine()); 		// 테스트 케이스 수가 주어짐
		for (int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append("#"+(tc+1)+" ");
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			parents = new int[N+1];
			make();										//N만큼 make를 함.
			
			for (int i = 0; i < M; i++) {				//함수를 실행함.
				st = new StringTokenizer(br.readLine());
				if(Integer.parseInt(st.nextToken())==1) {
					sb.append(rootCheck(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
				}else {
					union(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
				}
			}
			sb.append("\n");
		}//테스트 케이스 for문
		System.out.println(sb.toString());
	}
}
