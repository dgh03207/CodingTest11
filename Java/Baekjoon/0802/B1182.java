package Algo_test_0816;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1182 {
	static int N,S;					//입력 값의 크기와 부분집합의 합
	static int[] inputs;			//입력 값을 저장하는 배열
	static boolean[] isSelected;	//값이 선택되었는지 확인하는 배열
	static int passed  = 0;				//조건에 부합하는 배열 갯수를 세는 변수
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		N = Integer.parseInt(st.nextToken());	//입력 값의 크기
		S = Integer.parseInt(st.nextToken());	//부분집합의 합
		inputs = new int[N];
		isSelected = new boolean[N];
		
		st = new StringTokenizer(br.readLine());//StringTokenizer로 입력 값을 띄어쓰기 간격으로 저장할 수 있게함
								
		for (int n = 0; n < N; n++) {			//for문으로inputs[]배열에 입력값을 저장함.
			inputs[n] = Integer.parseInt(st.nextToken());
		}
		
		Subset(0);
		System.out.println(passed);
	}
	
	private static void Subset(int cnt) {
		if(cnt==N) {
			int totalSum = 0;		//부분집합의 합을 저장할 변수
			int size = 0;			//부분집합의 갯수를 세는 변수
			
			for (int i = 0; i < N; i++) {
				if(isSelected[i]) {
					   totalSum += inputs[i];
					   size ++;
				}
				
			}
			
			if (totalSum==S&& size!=0) {
				passed++;
			}
			return;
		}
		
		isSelected[cnt] = true;
		Subset(cnt+1);
		isSelected[cnt] = false;
		Subset(cnt+1);
		
		
		
	}
}
