package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//연구소
public class B14502 {
	static int N, M;
	static int[][] maps;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			for (int m = 0; m < M; m++) {
				maps[n][m] = Integer.parseInt(st.nextToken());
			}
		}

	}
}
