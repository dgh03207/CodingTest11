package com.day9;

import java.util.Arrays;
import java.util.Scanner;

public class B3040 {
	static int[] numbers;			//일곱난쟁이가 들어갈 배열
	static int[] input;				//아홉 난쟁이들의 번호
	static StringBuilder sb;		//스트링 빌더 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();
		input = new int[9];
		numbers = new int[7];
		
		for (int n = 0; n < 9; n++) {
			input[n] = sc.nextInt();
		}
		Combination(0,0);
		System.out.println(sb.toString());
	}
	
	private static void Combination(int cnt, int start) {
		if (cnt == 7) {
			if (Arrays.stream(numbers).sum()==100) {
				for (int i : numbers) {
					sb.append(i+"\n");
				}
			}
			return;
		}
		
		for (int i = start; i < 9; i++) {
			numbers[cnt] = input[i];
			Combination(cnt+1,i+1);
		}
	}
	
	
}
