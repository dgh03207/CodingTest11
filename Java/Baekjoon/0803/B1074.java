package com.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//z
public class B1074 {
	
	int [][] origin = {{0,1,4,5},{2,3,6,7},{8,9,12,13},{10,11,14,15}};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	//2^N을 가로 세로 크기로 가지는 배열을 위한 N값 
		int r = Integer.parseInt(st.nextToken());	//찾고자 하는 행값을 받음
		int c = Integer.parseInt(st.nextToken());	//찾고자 하는 열의 값을 받음
		
		//4로 나누어서 기본형이라고 했을때, 어느 위치에 값이 있는지 확인함.
		int origin_r = r%4;
		int origin_c = c%4;
		
		//
		
		
	
	}
}
