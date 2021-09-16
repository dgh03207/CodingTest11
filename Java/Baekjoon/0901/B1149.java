package Algo_0901;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int N = sc.nextInt();		//집의 수
		
		
		// 각 집을 칠할 비용
		int[][] cost = new int[N+1][3];
		
		// 1번 집부터 N번 집까지 칠하는데 필요한 최소비용
		int [][] d = new int[N+1][3];
		
		// 각 집을 칠할 비용 입력 받기
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < 3; j++) {
				cost[i][j] = sc.nextInt();
			}
		}
		int red = 0, green = 1, blue = 2;
		
		//초기값
		d[1][red] = cost[1][red];
		d[1][green] = cost[1][green];
		d[1][blue] = cost[1][blue];
		
		
		// i번째 집을 칠하는데 드는 최소 비용 = 자기집 칠하는 비용  +(i-1)번째 집까지 칠하는 비용 중 최소 값
		for (int i = 2; i <= N; i++) {
			d[i][red] = cost[i][red] + Math.min(d[i-1][blue],d[i-1][green]); 
			d[i][blue] = cost[i][blue] + Math.min(d[i-1][red],d[i-1][green]); 
			d[i][green] = cost[i][green] + Math.min(d[i-1][blue],d[i-1][red]); 
		}
		//1-N번집까지 칠하는데 드는 최소 비용
		System.out.println(Math.min(d[N][red],Math.min(d[N][blue], d[N][green])));
	
	}
}
