package Algo_0901;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11660 {
	static int N,M;
	static int[][] matrix,fromTo,sumdp;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		 
		matrix = new int[N+1][N+1];
		sumdp = new int[N+1][N+1];
		
		for (int i = 1; i <= N; i++) {						//배열 정보와 구간합으로 이루어진 dp배열을 생성함
			
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			for (int j = 1; j <= N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
				sumdp[i][j] = sumdp[i-1][j] + sumdp[i][j-1]-sumdp[i-1][j-1]+matrix[i][j];
			}
			
		}

		
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int answer = sumdp[x2][y2] - sumdp[x2][y1-1] - sumdp[x1-1][y2] + sumdp[x1-1][y1-1]; 
			sb.append(answer+"\n");
		}
		
		System.out.println(sb.toString());
		
	}
	
}
