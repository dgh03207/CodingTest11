package com.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SW1861 {
	static int[]dx = {-1,1,0,0};				
	static int[]dy = {0,0,-1,1};
	static int[][] rooms;
	static int cnt=0;
	static int[][]dp;
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int [] answer = {0,0};
			int N = Integer.parseInt(br.readLine());
			rooms = new int [N][N];
			dp = new int[N][N];
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			for (int nx = 0; nx < N; nx++) {	//rooms에 값 입력
				for (int ny = 0; ny < N; ny++) {
					rooms[nx][ny] = Integer.parseInt(st.nextToken());
					
				}
			}
			
			
			// 배열을 모두 돈다.
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					cnt = 1;
					search(i,j);
					dp[i][j] = cnt;
//					System.out.println();
					if (answer[1] < cnt) {
						answer[0] = rooms[i][j];
						answer[1] = cnt;
//						System.out.printf("%d 에서 시작하면 %d 개의 방 찾음\n",answer[0],answer[1]);
					}else if(answer[1] == cnt) {
						if (answer[0] >rooms[i][j]) {
							answer[0] = rooms[i][j];
						}
					}
					
				}	
			}
			
			sb.append("#"+(t+1)+" "+answer[0]+" "+answer[1]+"\n");
			
		}
		System.out.println(sb.toString());
		
	}
	
	private static void search(int x, int y) {
		int start = rooms[x][y];
		if (dp[x][y]>=1 && cnt != 1) {
//			System.out.printf("dp에서 찾음 dp[%d][%d] : %s\n",x,y,dp[x][y]);
			cnt += dp[x][y]-1;
			return;
		}
//		System.out.printf("start : %d,cnt : %d\n",start,cnt);
		for (int d = 0; d < 4; d++) {
			int x1 = dx[d]+x;
			int y1 = dy[d]+y;
//			System.out.println(d);
			if ( (x1 >= 0 && x1 < rooms.length ) && ( y1 >= 0 && y1 < rooms.length )) {	//room을 넘어가는 길이
//				System.out.printf("move to %d\n",rooms[x1][y1]);
				if( (rooms[x1][y1]-start) == 1 ) {
//					System.out.printf("rooms : %d%n",rooms[x1][y1]);	
					cnt ++;
//					System.out.println("cnt : "+cnt);
					search(x1,y1);
				}
			}
		}return ;
	}
}
