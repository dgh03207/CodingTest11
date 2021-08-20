package Algo_0803;

import java.util.Scanner;
//N-Queen
public class B9664 {

	static int N,cnt;
	static int col[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		col = new int[N+1];
		cnt = 0;
		
		setQueens(1);
		System.out.println(cnt);
	}
	
	private static void setQueens(int rowNo) {
											//기저조건 - 더이상 퀸을 놓을 수 없는 상태
		if(rowNo>N) {						//1행부터 시도하기 때문에 N까지 시도가 되어야 한다.(마지막행까지다 둔경우 체크)
			cnt ++;							//경우의 수를 늘려줌
			return;
		}
											//현재 퀸 1열부터 N열까지 놓기
											//놓았으면 다음 퀸 놓으러 가기
		for (int i = 1; i <= N; i++) {
			col[rowNo] = i;					//i열에 퀸 놓기.
			if(isAvailable(rowNo)) {		//유망여부 체크 : rowNo행까지 유망한지 체크
				setQueens(rowNo+1);
			}					
			
		} 
		
	}
	
	private static boolean isAvailable(int rowNo) {
		
		for (int k = 1; k <rowNo; k++) {	//이전 퀸이 같은 열에 있거나, 대각선 상에 있으면 불가
			if(col[rowNo]==col[k] || Math.abs(col[rowNo]-col[k])==(rowNo-k)) return false;	
			
		}
		return true;						//그외의 경우는 return true
	}
}
