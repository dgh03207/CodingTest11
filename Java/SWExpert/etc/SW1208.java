

import java.util.Arrays;
import java.util.Scanner;

public class SW1208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 10개
		for (int T = 0; T < 10; T++) {
			
			int [] boxes = new int[100];
			int dump = sc.nextInt();//덤프 횟수
			
			for (int i = 0; i < 100; i++) {
				boxes[i] = sc.nextInt();
			}
			int answer = 100;
			//정렬해서 
			while (dump>0) {
				
				--dump;
				Arrays.sort(boxes);
				if (boxes[99]==boxes[0]) {
					System.out.println(0);
					answer = 0;
					break;
					
				}
				else if(boxes[98]==boxes[0]) {
					System.out.println(1);
					answer = 1;
					break;
				}
				
				
				--boxes[99];
				++boxes[0];
			}
			
			Arrays.sort(boxes);
			if (answer == 100) {
				answer = boxes[99]-boxes[0];
			}
			
			System.out.println("#"+(T+1)+" "+answer);
			
			
			
		}
		
		
		
	}
}
