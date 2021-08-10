package algo_0801;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B9012 {
	public static void main(String[] args) throws Exception {
		String[] pair = { "(", ")" };

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테케 갯수

		for (int t = 0; t < T; t++) {
			String answer = "YES";
			int stack_cnt = 0;
			String line = br.readLine();

			if (line.length() % 2 == 1 && line.length() == 0) {
				answer = "NO";
			} else {

				

				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == '(') {
						stack_cnt++;
					} else {
						if (stack_cnt == 0) {
							answer = "NO";
							break;
						} else {
							stack_cnt--;
						}
					}
				}

			}
			if (stack_cnt != 0)
				answer = "NO";

			sb.append(answer + "\n");
		}

		System.out.println(sb.toString());
		//'('이 모양이 들어오면 cnt를 새고, ')'이모양이 들어오면 cnt를 뺀다. 이때, cnt==0 이어서 뺄 수 없거나 모두 뺐는데도 cnt가 0이 되지 않으면
		//짝이 맞지 않는 것이므로, NO를 StringBuilder에 추가함.
	}
}
