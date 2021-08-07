package Algo_04_0805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B2493 {
	static String tops[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<int[]> stack = new Stack<>();
		
		tops = br.readLine().split(" ");
		
		for (int n = 1; n < N+1; n++) {
			int target = Integer.parseInt(tops[n-1]);
			while(stack.size()!=0) {
				if(stack.peek()[1] > target) {
					System.out.print(stack.peek()[0]+" ");
					break;
				}
				stack.pop();
			}
			if (stack.size()==0) {
				System.out.print(0+" ");
			}
			stack.push(new int[] {n,target});
		}
		
		
	}

}
