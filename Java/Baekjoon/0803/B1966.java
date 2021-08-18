package Algo_0803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1966 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());						// 테스트 케이스 개수
		for (int tc = 0; tc < T; tc++) {
			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());					// 문서의 개수
			int M = Integer.parseInt(st.nextToken());					// 궁금한 요소의 인덱스
			Integer[] sorted = new Integer[N];
			Queue<int[]> print = new LinkedList<int[]>();
			st = new StringTokenizer(br.readLine());
			for (int n = 0; n < N; n++) {								// 배열에 요소들을 모두 넣어줌
				sorted[n] = Integer.parseInt(st.nextToken());
				print.add(new int[] {n,sorted[n]});
			}
			
			Arrays.sort(sorted,Collections.reverseOrder());				// waiting의 value값으로 구성된 배열을 sort해줌
			
			printing : for (Integer num : sorted) {								//정렬된 배열로부터 하나씩 요소를 받아옴
				while(true) {											//print배열에서 값을 얻기 전까지 반복
					int[] temp = print.poll();							//print큐에서 최상단 값을 빼옴
					if(temp[1]==num) {									//최상단의 value가 타겟값과 같으면
						cnt++;											//카운트를 올려주고
						if(temp[0] == M) {								//인덱스 값이 N과 같은지 확인했는데, 같으면
							sb.append(cnt+"\n");
							break printing;								//해당 값을 출력해주고 printing배열에서 나온다.
						}else break;
					}else {												//최상단의 value가 타겟값과 다르면, 다시 print에 넣어준다.
						print.add(temp);
					}
				}
			}
			
		
		}
		System.out.println(sb.toString());
		
	
	}
}
