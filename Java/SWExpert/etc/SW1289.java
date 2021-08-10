

import java.io.FileInputStream;
import java.util.Scanner;

public class SW1289 {
	public static void main(String[] args) throws Exception{
//		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			char memory = '0';
			String origin = sc.next();
			
			 for (char c : origin.toCharArray()) {
	                if (c != memory) {
	                    cnt ++; 
	                    memory = c;
	                }
	            }
			System.out.println("#"+(i+1)+" "+cnt);
			
		}
		
		//������ Ǯ��
//		for (int i = 0; i < n; i++) {
//			String s = sc.next();
//			int cnt = 0;
//			if (s.startsWith("1")) cnt ++;
//			
//			for (int j = 0; j < s.length()-1; j++) {
//				if(s.charAt(j)!=s.charAt(j+1)) {
//					cnt++;
//				}
//			}
//			System.out.println("#"+(i+1)+" "+cnt);
//			
//		}
		
	}
	
}
