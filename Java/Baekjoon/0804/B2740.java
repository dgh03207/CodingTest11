package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2740 {
	static int N, M, K;
	static int[][] a_list, b_list, answer_list;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		a_list = new int[N][M];					
		for (int n = 0; n < N; n++) {			
			st = new StringTokenizer(br.readLine());
			for (int m = 0; m < M; m++) {
				a_list[n][m] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		b_list = new int[M][K];
		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());
			for (int k = 0; k < K; k++) {
				b_list[m][k] = Integer.parseInt(st.nextToken());
			}
		}

		answer_list = new int[N][K];

		multiply(N, M, K);
		System.out.println(sb.toString());

	}

	private static void multiply(int N, int M, int K) {

		for (int n = 0; n < N; n++) {
			for (int k = 0; k < K; k++) {
				int answer = 0;
				for (int m = 0; m < M; m++) {
					answer += a_list[n][m] * b_list[m][k];
				}
				sb.append(answer + " ");
			}
			sb.append("\n");

		}

	}
}
