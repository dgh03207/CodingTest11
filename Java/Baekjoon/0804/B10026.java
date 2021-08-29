package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//�쟻濡앹깋�빟
public class B10026 {
	
	static int N,answer;
	static String[][] paint,paint_RG;
	static int[] dr = {-1,1,0,0};	//�긽�븯醫뚯슦 �깘�깋
	static int[] dc = {0,0,-1,1};
	static boolean[][] isChecked;
	static StringBuilder sb = new StringBuilder();
	static String[] colors = {"R","G","B"};
	static Queue<int[]> queue = new LinkedList<>();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		paint = new String[N][N];			//洹몃┝ RGB�젙蹂대�� �떞�뒗 諛곗뿴
		paint_RG = new String[N][N];		//RG瑜� �븯�굹濡� 留뚮뱺 �젙蹂대�� �떞�뒗 諛곗뿴
		isChecked = new boolean[N][N];		//�씠誘� 吏��굹�삩 寃쎈줈瑜� 泥댄겕�븯�뒗 諛곗뿴
		
		for (int i = 0; i < N; i++) {		//for臾몄쑝濡� 洹몃┝ �젙蹂대�� paint�뿉 �떞�뒗�떎. 
			String line = br.readLine();
			paint[i] = line.split("");		//�씪諛� 洹몃┝ �젙蹂대�� �떞�뒗�떎.
			line = line.replace("R","G");	//R�쓣 G濡� 蹂��솕�븳�떎.
			paint_RG[i] = line.split("");	//R�쓣 G濡� 留뚮뱺 洹몃┝ �젙蹂대�� 諛쏅뒗�떎.
		}
		
		
 
		isChecked = new boolean[N][N];
		queue.add(new int[] {0,0});			//�걧�뿉 (0.0)�쓣 �꽔�뒗�떎.
		while(!queue.isEmpty()) {			//�걧媛� 鍮꾩뼱�엳吏� �븡�쑝硫� while臾몄쓣 怨꾩냽 �룉�떎.
			int[] dir = queue.poll();		//�걧�뿉�꽌 �젙蹂대�� 鍮쇰궦�떎.
			int x = dir[0];					//x瑜� 諛쏆븘�삩�떎. 
			int y = dir[1];					//y瑜� 諛쏆븘�삩�떎.
			
			if(!isChecked[y][x]) {			//isChecked�뿉 泥댄겕媛� �릺�뼱 �엳吏� �븡�쑝硫�
				search(paint[y][x],x,y);	//search()臾몄쓣 �룎由곕떎. 
				answer ++;					//answer�쓣 利앷��떆�궓�떎.
			}
			
		}
		System.out.print(answer+" ");
		
		queue.add(new int[] {0,0});			//�걧�뿉 (0.0)�쓣 �꽔�뒗�떎.
		paint = paint_RG.clone();			//paint�뿉 �쟻濡앹쓣 異붽��븳�떎. 
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
			for (int n = 0; n < 4; n++) {	//4諛⑺깘�깋
				int nx = dc[n]+x;
				int ny = dr[n]+y;
				
				if(!isRange(nx,ny) && !isChecked[ny][nx]) {	//�씠誘� �깘�깋�뻽�뜕 援ш컙�씠 �븘�땲�뼱�빞�븿.
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
