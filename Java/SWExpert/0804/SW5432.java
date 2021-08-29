package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//쇠막대기 자르기
//D4

public class SW5432 {
	static int N,cnt;
	static int[] infos;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < T; tc++) {
			sb.append("#"+(tc+1)+" ");
			
			String line = br.readLine();
			line = line.replace("()", "O");
			cnt = 0;
			Cutter(line);
			
			sb.append(cnt+"\n");
		}
		
		System.out.println(sb.toString());
		
	}//main종료문
	
	private static void Cutter(String line) {
		Stack<Character>stack = new Stack<>();			//현재 스틱들의 갯수를 담고 있는 스택
		for (int i = 0; i < line.length(); i++) {
			char now = line.charAt(i);
			
			if(now=='(') {
				stack.add(now);
			}else if(now==')') {
				stack.pop();
				cnt +=1;
			}else if(now=='O') {
				cnt += stack.size();
			}
		}
		
		
		
		
	}
	
	
}//class종료문
