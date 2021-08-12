package Algo_0802;

import java.util.Scanner;

public class B1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String key = "666";
		int num = 666;
		
		while(N>0) {
			if (Integer.toString(num).contains(key)) {
				N--;
			}
			num++;
		}
		System.out.println(--num);
		
	}
	
}
