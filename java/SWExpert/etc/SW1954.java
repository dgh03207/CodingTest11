

import java.util.Arrays;
import java.util.Scanner;

public class SW1954 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		for (int t = 0; t < T; t++) {
			
			int size = sc.nextInt();
			int [][] snail = new int[size][size];
			int x=0;
			int y=0;
			int num = 1;
			int i = 0;
			int flag = 0;
			int cnt = 0;
			while (num <= size*size) {
				if (snail[x][y] == 0) {
					snail[x][y] = num++;
					
				}
				else {
					x -= dx[i%4];
					y -= dy[i%4];
					i++;
				}
				
				x += dx[i%4];
				y += dy[i%4];
				
				if (y==size) {
					i++;
					y--;
					x += dx[i%4];
					y += dy[i%4];
				}
				if (y==-1) {
					i++;
					y++;
					x += dx[i%4];
					y += dy[i%4];
				}
				if (x==size) {
					i++;
					x--;
					x += dx[i%4];
					y += dy[i%4];
				}
				if (x==-1) {
					i++;
					x++;
					x += dx[i%4];
					y += dy[i%4];
				}
				System.out.println();
				for (int[] sn : snail) {
					for (int s = 0; s < size; s++) {
						System.out.print(sn[s]+" ");
					}
					System.out.println();
					
				}
				
			}
			
			System.out.println("#"+(t+1));
			for (int[] sn : snail) {
				for (int s = 0; s < size; s++) {
					System.out.print(sn[s]+" ");
				}
				System.out.println();
				
			}
		}
	}
}
