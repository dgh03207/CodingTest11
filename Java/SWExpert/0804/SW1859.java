package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//백만 장자 프로젝트
public class SW1859 {
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int T = Integer.parseInt(br.readLine());
			
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			int answer = 0;
			
			int N = Integer.parseInt(br.readLine());			//매매가를 예측하는 일 수
			int prices[] = new int[N];							//매매가를 저장할 배열
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int n = 0; n < N; n++) {						//매매가를 받아오는 부분
				prices[n] = Integer.parseInt(st.nextToken());
			}
			
			sb.append(Buying(prices)+"\n");
			
		}
		System.out.println(sb.toString());
	
	}
	
	private static long Buying(int[] prices) {
		long answer = 0;
		int top = 0;
		
		for (int i = prices.length-1; i>=0; i--) {
			if (top < prices[i]) {				//top가격보다 prices가 더 크면, top값을 갱신해줌
				top = prices[i];
			}else if(top-prices[i]>=0){								//top가격보다 prices가 더 작으면, 그 차이만큼 판매하여, answer을 갱신함
				answer += top-prices[i];
			}
		}
		
		return answer;
		
	}
	
	
}
