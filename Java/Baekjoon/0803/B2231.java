package Algo_0803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//분해합
public class B2231 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = 0;
		int size = 1;
		int answer = 0;
				
		while(M<N) {
			
			int[] temp = Arrays.stream(Integer.toString(M).split("")).mapToInt(Integer::parseInt).toArray();
			int origin = M;
			for (int t : temp) {
				origin += t;
			}
			
			if(origin == N) {
				answer = M;
				break;
			}
			else M++;
		}
		
		System.out.println(answer);
		
		
	}
}
