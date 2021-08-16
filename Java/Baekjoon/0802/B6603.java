package Algo_test_0816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	1-49까지의 수중에 6개를 고른다.
	49가지의 수중 K개의 수를 골라 집합 S를 만든다음 그 수로 번호를 선택한다.
	

*/public class B6603 {
	static int K; // 집합 S의 크기인 K변수
	static int[] S; // 1-49중에서 K개를 뽑아만든 집합 S
	static int[] numbers;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while (true) {								// K에 0이 들어올 때까지 테스트를 반복함
			st = new StringTokenizer(br.readLine());
			K = Integer.parseInt(st.nextToken()); 	// K개의 숫자가 주어짐
			if (K == 0)	break;						// 0이 들어오면 테스트 종료함.
			numbers = new int[6];
			S = new int[K];
			
			for (int k = 0; k < K; k++) { 			// K개의 집합 S의 요소를 입력받음
				S[k] = Integer.parseInt(st.nextToken());
			}

			Combination(0,0);
			sb.append("\n");
		}//while문 종료
		
		System.out.println(sb.toString());
		
	}//main문
	
	private static void Combination(int cnt,int start) {
		if(cnt == 6) {
			for (int num :numbers) {
				sb.append(num+" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = start; i < K; i++) {
			numbers[cnt] = S[i];
			Combination(cnt+1,i+1);
		}
	}
	
	
}//B6603클래스
