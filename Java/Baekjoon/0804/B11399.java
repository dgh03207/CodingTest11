package Algo_0804;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//ATM
public class B11399 {
	static int N;
	static int[] times;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		times = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			times[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(times);
		
		getWaitingtime();
		System.out.println(Arrays.stream(times).sum());
	}
	
	private static void getWaitingtime() {
		int prev = times[0];
		for (int i = 1; i < times.length; i++) {
			times[i] += prev;
			prev = times[i];
		}
	}
}
