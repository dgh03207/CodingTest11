package Algo_04_0805;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1002 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			
			String pos = br.readLine();
			int x1 = Integer.parseInt(pos.split(" ")[0]);
			int y1 = Integer.parseInt(pos.split(" ")[1]);
			int r1 = Integer.parseInt(pos.split(" ")[2]);
			int x2 = Integer.parseInt(pos.split(" ")[3]);
			int y2 = Integer.parseInt(pos.split(" ")[4]);
			int r2 = Integer.parseInt(pos.split(" ")[5]);
			
			
			int d= (int)(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2));
			int minus_r = (int)Math.pow(r1-r2,2);
			int plus_r = (int)Math.pow(r1+r2,2);


			if (minus_r==0 && d==0) System.out.println(-1);
			else if(minus_r < d && d < plus_r ) {
				System.out.println(2);
			}
			else if( d==minus_r || d==plus_r) {
				System.out.println(1);
			}
			else if(minus_r > d || plus_r < d) {
				System.out.println(0);
			}
		}
		
	
	
	}
	

}
