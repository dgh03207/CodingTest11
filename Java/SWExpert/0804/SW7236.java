package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW7236 {
	static int[] dr = {-1,1,0,0,-1,-1,1,1};		//y축 움직임 상하좌우,우측상단,좌측상단,좌측하단,우측하단 순서 탐색
	static int[] dc = {0,0,-1,1,1,-1,-1,1};	//x축 움직임
	static int N;
	static int deepest;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			
			N = Integer.parseInt(br.readLine());
			deepest = 0;
			
			String[][] tank = new String[N][N];			//저수지의 W,G정보를 저장하는 배열 생성
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					tank[i][j] = st.nextToken();
				}
			}//입력 for문
			
			for (int i = 1; i < N-1; i++) {
				for (int j = 1; j < N-1; j++) {
					
					if(tank[i][j].equals("W")) {
						int[] current = new int[] {j,i};	//(1,1)에서부터 탐색을 한다.
						getDepth(current,tank);
					}
				}
			}
			sb.append(deepest+"\n");
		
		}//테스트 케이스 for문
		
		System.out.println(sb.toString());
	}
	
	private static boolean isRange(int x,int y) {
		return x>=0&&x<N&&y>=0&&y<N;
	}
	
	private static void getDepth(int[]current,String[][] tank) {		//탱크의 정보 값으로 깊이를 구해준다.
		int x = current[0];
		int y = current[1];
		int depth = 0;

		for (int c = 0; c < 8; c++) {					//8방면에서 탐색을 한다.
			int nx = x+dc[c];				
			int ny = y+dr[c];
			
			if(isRange(nx,ny)) {
				if(tank[ny][nx].equals("W"))
					depth += 1;
			}
		}
		if(depth == 0) {
			depth = 1;
		}
		
		if(deepest <depth) deepest = depth;
		
	}
	
}
