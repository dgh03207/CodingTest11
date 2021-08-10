package algo_0801;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1085 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x= Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		System.out.println(Math.min(Math.min(w-x,h-y),Math.min(x,y)));
		//w-x,h-y,x,y 중 최솟값이 정답.
		
		
	
	}
}
