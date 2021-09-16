package Algo_0903;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1463 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] d = new int[N+1];

		//초기값
		d[1] = 0;
		
		//3~N까지 값을 채움
		for (int i = 2; i <= N; i++) {
			//1.i-1
			d[i] = d[i-1] + 1;
			
			//2. i/2
			if(i%2 == 0 && d[i/2]+1<d[i]) {
				d[i] = d[i/2] +1;
			}
			
			//3. i/3
			if(i%3==0 && d[i/3]+1 <d[i]) {
				d[i] = d[i/3] +1;
			}
			
			
		}
		
		
		System.out.println(d[N]);
//		d[1] = 1;
//		d[2] = 1;
//		d[3] = 1;
//		
//		int target = N;
//		while(target != 1) {
//			if(d[target]==0) {
//				target 
//			}
//		}
		
	
	}
}
