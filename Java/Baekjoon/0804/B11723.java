package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11723 {
	static ArrayList<Integer> S = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();;
	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		
		for (int m = 0; m < M; m++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			int n = 0;
			if(cmd.equals("empty")||cmd.equals("all"));
			else {
				n = Integer.parseInt(st.nextToken());
			}
			work(cmd,n);
		}
		System.out.println(sb.toString());
	}
	
	private static void work(String cmd, int n) {
		if(cmd.equals("add")) {
			S.add(n);
			return;
		}
		if(cmd.equals("check")){
			if(S.contains(n)) sb.append("1\n");
			else sb.append("0\n");
			return;
		}
		if(cmd.equals("remove")) {
			if(S.contains(n)) {
				S.remove(S.indexOf(n));
			}
			return;
		}
		if(cmd.equals("all")) {
			S.clear();
			for (int i = 0; i < 20; i++) {
				S.add(i+1);
			}
			return;
		}
		if(cmd.equals("toggle")) {
			if(S.contains(n)) {
				S.remove(S.indexOf(n));
			}else {
				S.add(n);
			}
			return;
		}
		if(cmd.equals("empty")) {
			S.clear();
			return;
		}
	}
}
