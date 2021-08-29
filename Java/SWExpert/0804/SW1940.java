package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//가랏 RC카
//D2
public class SW1940 {
	
	static int distance,v;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			
			v = 0;											//속도
			distance = 0;
			int N = Integer.parseInt(br.readLine());			//명령어의 개수
			
			for (int n = 0; n < N; n++) {						//명령어 실행
				st = new StringTokenizer(br.readLine());		
				int cmd = Integer.parseInt(st.nextToken());		//0,1,2  명령어
				int a = 0;
				if(cmd!=0) {
					a = Integer.parseInt(st.nextToken());	//1,2일경우, 가속도
				}
				
				distance += work(cmd,a);
			}
			sb.append(distance+"\n");
		}
		System.out.println(sb.toString());
	}
	
	
	private static int work(int cmd, int a) {
		int d = 0;
		
		if (cmd==1) {
			v+= a;
			
		}else if (cmd==2) {
			if(v > a) {			//속도가 가속도보다 큰 경우, 속도에서 감속하는 가속도 값을 빼준다.
				v-=a;
			}else {				//속도보다 가속도가 작거나, 같은 경우, 속도는 0이 된다.
				v=0;
			}
		}
		d+= v;
		return d;
	}
	
}
