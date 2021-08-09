package com.day6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SW9229 {

	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int TC = Integer.parseInt(br.readLine()); 	// 테스트 케이스의 갯수
		
		for (int t = 0; t < TC; t++) {			
			
			sb.append("#"+(t+1));
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());	//총 과자 봉지 갯수
			int M = Integer.parseInt(st.nextToken());	//맥시멈 무게
			
			int [] snacks = new int [N];				//각 무게를 담을 N개의 과자 봉지 배열
			
			st = new StringTokenizer(br.readLine());
			for (int n = 0; n < N; n++) {				//각봉지에 과자 무게를 담아줌
				snacks[n] = Integer.parseInt(st.nextToken());	
			}
			
			Arrays.sort(snacks);						//정렬해준다.
			
			int one,two = 0;
			int max_weight = 0;
			
			for (int i = snacks.length-1; i >=0 ; i--) {
				one = snacks[i];
				for (int j = i-1; j >=0; j--) {
					two = snacks[j];
					if (one+two <= M && max_weight < one+two) {
						max_weight = one+two;
						break;
					}
				}
			
			}
			if (max_weight==0) {
				max_weight = -1;
			}
			sb.append(" "+max_weight+"\n");
			
		}
		System.out.println(sb.toString());
		
	}

}
