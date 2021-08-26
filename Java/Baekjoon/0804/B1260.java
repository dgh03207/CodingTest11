package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260 {
	static int N,M,V;
	static boolean[][] adjList;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());					//정점의 개수
		M = Integer.parseInt(st.nextToken());					//간선의 개수
		V = Integer.parseInt(st.nextToken())-1;					//시작할 정점의 번호
		adjList = new boolean[N+1][N+1];
		
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());
			int to = Integer.parseInt(st.nextToken())-1;
			int from = Integer.parseInt(st.nextToken())-1;
			adjList[to][from] = true;
			adjList[from][to] = true;
			
		}

		boolean[] visited = new boolean[N];
		
		dfs(V,visited);
		sb.append("\n");
		bfs();
		System.out.println(sb.toString());
		
	}//main
	
	private static void bfs() {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[N];
		
		queue.offer(V);
		visited[V] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			sb.append(current+1+" ");
			for (int i = 0; i < visited.length; i++) {
				if(!visited[i] && adjList[current][i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}//bfs
	
	private static void dfs(int current,boolean[] visited){
		visited[current] = true;
		sb.append(current+1+" ");
		
		for (int i = 0; i < visited.length; i++) {
			if(!visited[i] && adjList[current][i]) {
				dfs(i,visited);
			}
		}
		
	}
	
	
	
}//class
