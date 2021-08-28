package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//배수 스위치
public class B12927 {

	static int[] switches; // switches의 정보를 저장하는 int배열
	static int N; // switches의 사이즈를 저장하는 배열

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String switch_info = br.readLine();
		int i = 1;
		N = switch_info.length();
		switches = new int[N + 1];

		for (String sw : switch_info.split("")) {
			if (sw.equals("Y"))
				switches[i++] = 1;
			else if (sw.equals("N"))
				switches[i++] = 0;

		}
		System.out.println(work());
	}

	private static int work() {
		int cnt = 0;
		for (int j = 1; j < N + 1; j++) {
			if (Arrays.stream(switches).sum() == 0)
				return cnt;
			System.out.println(j);
			reverse(j);
			cnt += 1;
		}
		return -1;
	}

	private static void reverse(int idx) {
		
		for (int i = idx; i < N + 1; i += idx) {
			if (switches[i] == 1)
				switches[i] = 0;
			else if (switches[i] == 0)
				switches[i] = 1;
			System.out.println(Arrays.toString(switches));
		}
	}

}
