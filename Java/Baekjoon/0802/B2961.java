package com.day9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2961 {
	static int N = 0;								//음식의 갯수 저장
	static int R = 0;								//뽑히는 정수 갯수가 저장되는 값
	static int [][] ingre_info;						//재료들의 맛 정보 저장하는 배열(신맛,쓴맛)
	static int [] flavors;							//재료들의 조합의 맛정보 (재료들의 신맛, 재료들의 쓴맛)
	static int answer= 1000000000;							// 신맛과 쓴맛의 차이를 저장하는 변수
	static boolean [] isSelected;
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine()); 		
		ingre_info = new int[N][2];					//음식 갯수만큼의 배열  생성
		flavors = new int[2];						//0번째는 음식들의 신맛 정보 1번째는 쓴맛 정보 저장
		isSelected = new boolean[N];				//Subset을 위한 Selected정보 저장하는 배열.
		
		for (int i = 0; i < N; i++) {									//음식의 갯수만큼 음식정보를 받는다.
			StringTokenizer st = new StringTokenizer(br.readLine());	//음식정보(신맛,쓴맛)
			ingre_info[i][0] = Integer.parseInt(st.nextToken());		//신맛 정보 배열에 저장
			ingre_info[i][1] = Integer.parseInt(st.nextToken());		//쓴맛 정보 배열에 저장
		}

		Subset(0);

		System.out.println(answer);
	}
	
	public static void Subset(int cnt) {
		

		if (cnt == N) {
			flavors[0] = 1;
			flavors[1] = 0;
			for (int i = 0; i < N; i++) {
				if ( isSelected[i]) {
					flavors[0] *= ingre_info[i][0];
					flavors[1] += ingre_info[i][1];
					int flavor = Math.abs(flavors[0]-flavors[1]);
					if (answer > flavor) {
						answer = flavor;
					}
				}
				
			}
			return;
		}
		
		isSelected[cnt] = true;
		Subset(cnt+1);
		isSelected[cnt] = false;
		Subset(cnt+1);
		
	}
}
