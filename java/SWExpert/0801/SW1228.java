package com.day6;

import java.util.ArrayList;
import java.util.Scanner;

public class SW1228 {
//	
//	class Node {
//		public Node front;
//		public Node back;
//		public String content;
//		public Node(Node front, Node back, String content) {
//			super();
//			this.front = front;
//			this.back = back;
//			this.content = content;
//		}
//		
//	}
//	
	public static void main(String[] args) throws Exception{
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int t = 1; t < 11; t++) {
			
			ArrayList<String> queue = new ArrayList();
			StringBuilder st = new StringBuilder();
			
			st.append("#"+(t));
			int L = sc.nextInt();
			
			for (int l = 0; l < L; l++) {
				queue.add(sc.next());
			}
			
			int N = sc.nextInt();
			
			for (int n = 0; n < N; n++) {
				ArrayList temp = new ArrayList();
				if (sc.next().equals("I")) {
					int start = sc.nextInt();
					int nums = sc.nextInt();

					for (int num = 0; num < nums; num++) {
						temp.add(sc.next());
						
					}
					queue.addAll(start, temp);
				}
				
			}
			for (int i = 0; i < 10; i++) {
				st.append(" "+queue.get(i));
			}
			
			System.out.println(st.toString());
		}
	
	}
}
