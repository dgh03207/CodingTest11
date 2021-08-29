package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class SW2805 {
	static int N,farm_value;
	
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			N = Integer.parseInt(br.readLine());
			int[][] farm = new int[N][N];
			farm_value = 0;
			
			for (int i = 0; i < N; i++) {
				String[] temp = br.readLine().split("");
				for (int j = 0; j < N; j++) {
					farm[i][j] = Integer.parseInt(temp[j]);
				}
			}//입력 for문 종료문
			
			if(N>1) {
				getValue(farm);
			}else farm_value = farm[0][0];
			
			sb.append(farm_value+"\n");
		
		}//테스트 케이스 for문 종료문
		
		System.out.println(sb.toString());
	}//main종료문
	
	
	private static boolean isRange(int x,int y) {
		return x>=0&&x<N&&y>=0&&y<N;
	}
	
	
	private static void getValue(int[][] farm) {
		int middle = N/2;				//중간 인덱스 값
		int y = 0;
		int x = middle;
		
		for (int i = 1; i < N/2+1; i++) {
			for (int j = 0; j < i; j++) {
				
				int x1 = x-j;
				int x2 = x+j;
				
				if(x1==x2) {
					farm_value += farm[y][x1];
					continue;
				}
				farm_value += farm[y][x1];
				farm_value += farm[y][x2];
			}
			y++;
		}
		
		farm_value += Arrays.stream(farm[y]).sum();
		y++;
		
		for (int i = N/2; i > 0; i--) {
			for (int j = i-1; j >=0; j--) {
				
				int x1 = x-j;
				int x2 = x+j;
				
				if(x1==x2) {
					farm_value += farm[y][x1];
					continue;
				}
				farm_value += farm[y][x1];
				farm_value += farm[y][x2];
			}
			y++;
		}
		
		
	}
	
	
	
	
}//class종료문
