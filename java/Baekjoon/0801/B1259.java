package algo_0801;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1259 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String input = br.readLine();
			
			String answer = "yes";
			if (input.equals("0")) {
				System.out.println(sb.toString());
				return;
			}
			
			if (input.charAt(input.length() - 1) != '0') {
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
						answer = "no";
						break;
					}
				}
			}
			else answer = "no";
			sb.append(answer + "\n");

		}
		
		// 인덱스를 i=0부터 읽는 것과 끝에서 부터 읽는 값을 비교하여 다르면 answer에 "no"를 넣고, 반복문의 끝에서 이것을 StringBuider에 추가하였다.

	}
}
