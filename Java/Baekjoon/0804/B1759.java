package com.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1759 {
		static int L,C;
		static boolean[] isSelected;
		static String[] candidate;
		static StringBuilder sb = new StringBuilder();
		static String[] answer;
		static String key = "aeiou";
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());						//L개의 알파벳 소문자들로 구성
		C = Integer.parseInt(st.nextToken());						//C개의 알파벳이 있음.
		candidate = new String[C];
		isSelected = new boolean[C];
		answer = new String[L];
		st = new StringTokenizer(br.readLine());
		for (int c = 0; c < C; c++) {
			candidate[c] = st.nextToken();
		}
		
		Arrays.sort(candidate);
		combination(0,0);
		System.out.println(sb.toString());
	}
	
	
	
	private static void combination(int cnt, int start) {
		if(cnt==L) {
			if(checked(answer)) {
				for (int c = 0; c < L; c++) {
					sb.append(answer[c]);
				}
				
				sb.append("\n");
			}
			return;
		}
		
		for (int i = start; i < C; i++) {
			answer[cnt] = candidate[i];
			combination(cnt+1,i+1);
		}
	}
	
	private static boolean checked(String[] answer) {
		int cnt =0;
		for (String ans : answer) {
			if(key.contains(ans)) {
				cnt++;
			}
		}
		if(cnt>=1&&answer.length-cnt>=2) return true;
		return false;
	}
}
