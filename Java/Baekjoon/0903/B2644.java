package Algo_0903;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2644 {
	
	static boolean[][] family;
	static int[] depth;
	static int N,M;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		N = Integer.parseInt(br.readLine());
		family = new boolean[N+1][N+1];
		depth = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		int f1 = Integer.parseInt(st.nextToken());
		int f2 = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			family[n1][n2] = true;
			family[n2][n1] = true;
		
		}
		
		bfs(f1,f2);
		if(depth[f2]==0) System.out.println(-1);
		else System.out.println(depth[f2]);

	}
	
	private static void bfs(int f1, int f2) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(f1);
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			if(current == f2) { break;}
			for (int i = 1; i <= N; i++) {
				
				if(family[current][i] && depth[i]==0) {
					queue.add(i);
					depth[i] = depth[current]+1;
				}
			}
		}
		
	}
}
