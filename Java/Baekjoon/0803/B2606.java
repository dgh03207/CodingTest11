package Algo_0803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

//바이러스
public class B2606 {
	static int cnt=0;												//감염된 컴퓨터 수
	static int N;
	static Computer[] computers;
	static class Computer{
		ArrayList<Integer> connected = new ArrayList<>();
		boolean infected=false;
	
		
		public void connect(int n) {
			connected.add(n);
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());							//컴퓨터 개수
		computers = new Computer[N];
		for (int n = 0; n < N; n++) {
			computers[n] = new Computer();
		}
		int C = Integer.parseInt(br.readLine());						//연결되어 있는 컴퓨터 쌍

		for (int c = 0; c < C; c++) {									//C번 연결
			StringTokenizer st = new StringTokenizer(br.readLine());	
			 				//컴퓨터 번호를 받아서 인덱스번호로 만들어줌
			int num = Integer.parseInt(st.nextToken())-1;
			int connectednum = Integer.parseInt(st.nextToken())-1;
			computers[num].connect(connectednum);						//연결관계를 쌍방으로 이어준다.
			computers[connectednum].connect(num);
		
		}
	
	
		
		virusTracker(computers[0]);
		System.out.println(cnt);
		
	}
	
	private static void virusTracker(Computer computer) {
		if(computer.infected) return;
		
		computer.infected=true;
	
		for (int i = 0; i < computer.connected.size(); i++) {
			int idx = computer.connected.get(i);
			if(computers[idx].infected==false) {
				cnt++;
				virusTracker(computers[idx]);
			}
			
		}
	}
	
}
