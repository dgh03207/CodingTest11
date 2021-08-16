package Algo_test_0816;

import java.util.Arrays;
import java.util.Scanner;

public class B10974 {
	static int N;							//입력받을 숫자의 크기 
	
	static boolean[] isSelected; 			//Permutation에서 선택된 수를 표시하기위한 배열
	static int[] input;						//입력받은 N개의 숫자를 저장할 배열
	static StringBuilder sb = new StringBuilder();	//출력을 위한 stringbuilder형 변수 sb선언.
	static int[] numbers;						//Permutation과정을 거친 배열을 저장할 변수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();					//입력받을 숫자의 크기
		input = new int[N];					//N크기 만큼의 input배열 생성
		numbers = new int[N];				
		isSelected = new boolean[N];		//N크기 만큼의 isSelected배열 생성
		
		for (int i = 0; i < N; i++) {	//1~N의 숫자를 input배열에 저장함
			input[i] = i+1;
		}
		
		Permutation(0);
		
		
		
	}
	
	
	private static void Permutation(int cnt) {
		
		if(cnt == N) {
			for (int num : numbers) {
				System.out.print(num+" ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(isSelected[i]) continue;
			
			numbers[cnt] = input[i];
			isSelected[i] = true;
			
			Permutation(cnt+1);
			isSelected[i] = false;
		}
		
		
		
	}
}
