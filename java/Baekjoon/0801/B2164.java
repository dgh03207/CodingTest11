package algo_0801;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue queue = new LinkedList();
		
		for (int n = 1; n <= N; n++) {
			queue.add(n);
		}
		
		int cnt = 0;
		while(true) {
			if (queue.size()==1) {
				System.out.println(queue.poll());
				return;
			}
			queue.poll();
			queue.add(queue.poll());
			
		}
		
		
		//Queue스택으로 한번 뽑고, 다시 넣고 를 하다가 큐 사이즈가 1이되면 해당 값 출력하고 프로그램 종료함.
		
	}
}
