package com.day12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1992 {
	static String answer = ""; // 쿼드트리 함수의 결과를 저장하는 변수
	static int[][] tree; // 데이터가 담기는 배열

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken()); // tree사이즈를 받아옴
		tree = new int[N][N]; // 가로세로 N사이즈인 tree생성

		for (int i = 0; i < N; i++) { // N사이즈 만큼 트리에 값을 받아옴
			tree[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		}
		quadTree(0, N, 0, N);
		System.out.println(answer);

	}// main 종료

	private static void quadTree(int h_start, int h_end, int w_start, int w_end) { // 순서대로 (높이의 start,높이의 end,너비의 start,너비의 end)
		int sum = 0;

		for (int i = h_start; i < h_end; i++) {
			sum += Arrays.stream(Arrays.copyOfRange(tree[i], w_start, w_end)).sum();// tree[i]의 배열의 w_start부터 w_end까지의 요소들을 뽑아서 합을 구한다.
		}
		if (sum == (h_end - h_start) * (h_end - h_start)) { // 합이 가로세로 길이의 곱과 같으면 안의 내용이 1로만 구성되어 있다는 것.
			answer += "1";
			return;
		} else if (sum == 0) {
			answer += "0";
			return;
		} else {
			// 4칸짜리이면서, 1또는0으로만 이루어지지 않았다면,재귀를 돌리지 않고, 개별적으로 값을 넣는다.
			if (h_end - h_start == 2) {
				answer += "(";
				answer += Integer.toString(tree[h_start][w_start]); // 1사분면
				answer += Integer.toString(tree[h_start][w_start + 1]); // 2사분면
				answer += Integer.toString(tree[h_start + 1][w_start]); // 3사분면
				answer += Integer.toString(tree[h_start + 1][w_start + 1]); // 4사분면
				answer += ")";
				return;
			}
			else {
				answer += "(";
				quadTree(h_start,(h_end+h_start )/ 2, w_start, (w_start+w_end)/2); // 1사분면
				quadTree(h_start, (h_end+h_start )/ 2, (w_start+w_end)/2, w_end); // 2사분면
				quadTree((h_end+h_start )/ 2, h_end, w_start, (w_start+w_end)/2); // 3사분면
				quadTree((h_end+h_start )/ 2, h_end, (w_start+w_end)/2, w_end); // 4사분면
				answer += ")";
			}
		}
	}

}// class종료
