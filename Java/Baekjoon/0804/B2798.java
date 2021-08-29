package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//블랙잭
public class B2798 {
	
	static int N,M,answer;
	static int[] cards,chosen;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		chosen = new int[3];
		cards = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int n = 0; n < N; n++) {
			cards[n] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(cards);
		Combinations(0,0);
		System.out.println(answer);
	}
	
	
	private static void Combinations(int start, int cnt) {
		if(cnt == 3) {
			int chosen_sum = Arrays.stream(chosen).sum();
			if(chosen_sum<=M) {
				if(chosen_sum>answer) {
					answer = chosen_sum;
				}
			}
			return;
		}
		
		for (int i = start; i < N; i++) {
			chosen[cnt] = cards[i];
			Combinations(i+1,cnt+1);
			
		}
	}
}
