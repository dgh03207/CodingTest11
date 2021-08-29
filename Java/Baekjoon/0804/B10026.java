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
		paint = new String[N][N];
		paint_RG = new String[N][N];
		isChecked = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			paint[i] = line.split("");
			line = line.replace("R","G");
			paint_RG[i] = line.split("");
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(paint_RG[i][j]);
			}
			System.out.println();
		}
		queue.add(new int[] {0,0});
		while(!queue.isEmpty()) {
			int[] dir = queue.poll();
			int x = dir[0];
			int y = dir[1];
			
			if(!isChecked[y][x]) {
				search(paint[y][x],x,y);
				answer ++;
			}
			
		}
		System.out.print(answer+" ");
		
		paint = paint_RG.clone();
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
	
	
	
		
}//class
