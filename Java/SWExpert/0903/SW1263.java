package Algo_0903;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW1263 {
	
	static boolean[][] network;
	static int N,cnt = 0;
	static int[] depth;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			network = new boolean[N+1][N+1];
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					int temp = Integer.parseInt(st.nextToken());
					if(temp==1) network[i][j] = true;
					else network[i][j] = false;
				}
			}
			
			int min_cnt = Integer.MAX_VALUE;
			for (int i = 1; i <= N; i++) {
				depth = new int[N+1];
				bfs(i);
				if(min_cnt > cnt) {
					min_cnt = cnt;
				}
			}
			
			sb.append(min_cnt+"\n");
		}
		System.out.println(sb.toString());
		
		
	}
	
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] selected = new boolean[N+1];
		queue.add(start);
		selected[start] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			for (int i = 1; i <= N; i++) {
				if(!selected[i] && network[current][i]) {
					queue.add(i);
					selected[i] = true;
					depth[i] = depth[current]+1;
				}
			}
		}
		cnt = Arrays.stream(depth).sum();
		
	}
}
