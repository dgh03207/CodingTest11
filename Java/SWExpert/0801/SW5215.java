package com.day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW5215 {
	static int N = 0;				//전체 음식의 갯수
	static boolean[] isSelected;	//부분집합때, 선택되었는지 확인할 배열
	static int [][] ingredients;	//음식정보가 저장된 배열(점수,칼로리)
	static int calorie;				//현재 칼로리 저장할 변수
	static int L;					//제한 칼로리
	static int answer;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 		//테스트 케이스 수
		StringBuilder sb = new StringBuilder();
				
		for (int tc = 0; tc < T; tc++) {
			answer = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); 		//재료의 수 
			L = Integer.parseInt(st.nextToken());	//제한 칼로리
			isSelected = new boolean[N];
			sb.append("#"+(tc+1)+" ");
			
			ingredients = new int[N][2];
			for (int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				ingredients[n][0] = Integer.parseInt(st.nextToken());	//음식 점수 
				ingredients[n][1] = Integer.parseInt(st.nextToken());	//음식 칼로리
			
			}
			
			
			for (int c = 0; c < N; c++) {
				subset(c);
			}
			
			sb.append(answer+" \n");
		
		
		}
		
		System.out.println(sb.toString());
		
	}
	private static void subset(int cnt) {

		if (cnt == N) {
			int totalscore = 0;
			int calorie = 0;
			for (int i = 0; i < N; i++) {
				if(isSelected[i]) {
					calorie += ingredients[i][1];
					totalscore += ingredients[i][0];
				}
			}
			
			if (calorie <= L && totalscore > answer) {		//칼로리가 제한 칼로리보다 낮고, 계산된 점수가 칼로리보다 낮을때. 
				answer = totalscore;
			}
			
			return;
		}
		
		//현재 원소를 부분집합에 넣기
		isSelected[cnt]= true;
		subset(cnt+1);
		
		//현재 원소를 부분집합에 넣지 않기
		isSelected[cnt] = false;
		subset(cnt+1);
		
		
	}
}
