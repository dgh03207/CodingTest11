package com.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class SW1223 {
	static int N;
	static String[] calculation;
	static Stack<String> stack;
	static Stack<Integer> nums;
	static int answer;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int tc = 0; tc < 10; tc++) {
			sb.append("#"+(tc+1)+" ");
			answer = 0;
			N = Integer.parseInt(br.readLine());
			stack = new Stack<String>();
			nums = new Stack<Integer>();
			calculation = br.readLine().split("");
		
			profix();
			sb.append(answer+"\n");
		}
		System.out.println(sb.toString());
			
	}
			

	private static void profix() {
		int n = 0;	
		boolean flag = false;
		while(n<N) {
			if(flag) {
				nums.add(Integer.parseInt(calculation[n])*nums.pop());
				flag = false;
			}else {
				nums.add(Integer.parseInt(calculation[n]));
			}
			n++;
			if(n<N&&calculation[n].equals("*")) {flag = true;}
			n++;
		}
		
		for (int num : nums) {
			answer += num;
		}
	}
}
