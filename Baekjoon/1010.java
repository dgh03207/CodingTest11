import java.util.Scanner;

public class 1010 {
	static int[][] dp = new int[30][30];
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = Math.max(a,b);
			int r = Math.min(a,b);
			dp[n][r] = combination(n,r);
			System.out.println(dp[n][r]);
			
		}
		sc.close();
	}
	
	
	public static int combination(int n,int r) {
		if(n==r || r==0) return 1;
		else if(dp[n][r] != 0) return  dp[n][r];
		
		else return (combination(n-1,r-1)+combination(n-1,r));
		
	}
}
