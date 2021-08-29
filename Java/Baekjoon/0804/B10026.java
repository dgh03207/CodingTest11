package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//적록색약
public class B10026 {
	
	static int N,answer;
	static String[][] paint,paint_RG;
	static int[] dr = {-1,1,0,0};	//상하좌우 탐색
	static int[] dc = {0,0,-1,1};
	static boolean[][] isChecked;
	static StringBuilder sb = new StringBuilder();
	static String[] colors = {"R","G","B"};
	static Queue<int[]> queue = new LinkedList<>();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		paint = new String[N][N];			//그림 RGB정보를 담는 배열
		paint_RG = new String[N][N];		//RG를 하나로 만든 정보를 담는 배열
		isChecked = new boolean[N][N];		//이미 지나온 경로를 체크하는 배열
		
		for (int i = 0; i < N; i++) {		//for문으로 그림 정보를 paint에 담는다. 
			String line = br.readLine();
			paint[i] = line.split("");		//일반 그림 정보를 담는다.
			line = line.replace("R","G");	//R을 G로 변화한다.
			paint_RG[i] = line.split("");	//R을 G로 만든 그림 정보를 받는다.
		}
		
		
 
		isChecked = new boolean[N][N];
		queue.add(new int[] {0,0});			//큐에 (0.0)을 넣는다.
		while(!queue.isEmpty()) {			//큐가 비어있지 않으면 while문을 계속 돈다.
			int[] dir = queue.poll();		//큐에서 정보를 빼낸다.
			int x = dir[0];					//x를 받아온다. 
			int y = dir[1];					//y를 받아온다.
			
			if(!isChecked[y][x]) {			//isChecked에 체크가 되어 있지 않으면
				search(paint[y][x],x,y);	//search()문을 돌린다. 
				answer ++;					//answer을 증가시킨다.
			}
			
		}
		System.out.print(answer+" ");
		
		queue.add(new int[] {0,0});			//큐에 (0.0)을 넣는다.
		paint = paint_RG.clone();			//paint에 적록을 추가한다. 
		isChecked = new boolean[N][N];
		answer = 0;
		
		while(!queue.isEmpty()) {
			int[] dir = queue.poll();
			int x = dir[0];
			int y = dir[1];
			
			if(!isChecked[y][x]) {
				search(paint[y][x],x,y);
				answer ++;
			}
			
		}
		System.out.println(answer);
	}//main
	
	private static boolean isRange(int x,int y) {
		return x<0||x>=N||y<0||y>=N;
	}
	
	
	
	private static void search(String target,int x,int y) {
		
		if(!isChecked[y][x]) {
			isChecked[y][x] = true;
			for (int n = 0; n < 4; n++) {	//4방탐색
				int nx = dc[n]+x;
				int ny = dr[n]+y;
				
				if(!isRange(nx,ny) && !isChecked[ny][nx]) {	//이미 탐색했던 구간이 아니어야함.
					if(target.equals(paint[ny][nx])) {
						search(target,nx,ny);
					}else {
						queue.add(new int[] {nx,ny});
					}				
					
				}
			}
		}
		
	}//search
	
	
	private static void showMatrix(String[][] target) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(target[i][j]);
			}
			System.out.println();
		}
		
	}
	private static void showMatrix(boolean[][] target) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(target[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
	}
		
}//class
