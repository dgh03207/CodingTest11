
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1018 {
	static String [][] board;
	static int answer,cnt = 0;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] size = br.readLine().split(" ");
		int M = Integer.parseInt(size[0]);
		int N = Integer.parseInt(size[1]);
		board = new String[M][N];

		
		for (int i = 0; i < M; i++) {
			board[i] = br.readLine().split("");
		}
		for (int m = 0; m < (M-7); m++) {
			for (int n = 0; n < (N-7); n++) {	
				answer = M*N;
				search(m,n);
				cnt = 0;
			}
		}
		System.out.println(answer);
		
		
		
	}
	
	private static void search(int m, int n) {
		String  prev = "";
		System.out.printf("start from (%d,%d)\n",m,n);
		for (int i = 0; i < 8; i++) {
			int j = 0;
			while(j<8) {	
				System.out.printf("prev = %s, board[%d][%d] = %s%n",prev,(m+i),(n+j),board[m+i][n+j]);
				if (prev.equals("W")) {
					if(board[m+i][n+j].equals(prev)) {
						System.out.printf("W --> %d , %d cnt : %d\n",(m+i),(n+j),cnt+1);
						cnt++;
					}
					prev = "B";
				}else if(prev.equals("B")) {
					if(board[m+i][n+j].equals(prev)) {
						System.out.printf("B -->%d , %d cnt : %d\n",(m+i),(n+j),cnt+1);
						cnt++;
					}
					prev = "W";
				}else {
					prev = board[m+i][n+j];
				}
				j++;
			}
			
		}cnt = (cnt < 64-cnt)? cnt:64- cnt;
		System.out.println(cnt);
		if (answer > cnt) answer = cnt;
	}
}
