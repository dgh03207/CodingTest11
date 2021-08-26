package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B18429 {

	static int N,K,answer;
	static int[] tools;
	static int[] combi;
	static boolean[] isSelected;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer (br.readLine());
	
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		tools = new int[N];
		combi = new int[N];
		answer = 0;
		isSelected = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for (int n = 0; n < N; n++) {
			tools[n] = Integer.parseInt(st.nextToken());
		}
		
		Permutation(0);
		System.out.println(answer);
	}
	private static void Permutation(int cnt) {
		if(cnt == N) {
			if(isAvailable(combi)) {
				answer += 1;
			}
			return;
		}
		
		for (int i = 0; i < N; i++) {
			
			if(isSelected[i]) continue;
			
			combi[cnt] = tools[i];
			isSelected[i] = true;
			Permutation(cnt+1);
			isSelected[i] = false;
		}
	}
	
	private static boolean isAvailable(int[] combi) {
		int weight = 500;
		
		for (int i : combi) {
			weight += -K+i;
			if(weight<500) return false;
		}
		return true;
	}
}
