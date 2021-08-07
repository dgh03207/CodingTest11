package Algo_04_0805;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int[] sorted = arr.clone();
		Arrays.sort(sorted);
		
		for (int a : arr) {
			for (int j = 0; j < sorted.length ; j++) {
				
				if (a==sorted[j]&&sorted[j]!=-1) {
					System.out.print(j+" "); 
					sorted[j] = -1;
					break;
				}
				
			}
		}

	}

}