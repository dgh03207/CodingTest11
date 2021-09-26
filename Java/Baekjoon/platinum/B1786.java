package com.algo2.day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1786 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		char[] text = br.readLine().toCharArray();
		char[] pattern = br.readLine().toCharArray();
		
		int plen = pattern.length;
		int tlen = text.length;
		
		int[] pi = new int[plen];
		
		for (int i = 1,j = 0; i < plen; i++) {
			
			while(j>0 && pattern[j]!=pattern[i])
				j = pi[j-1];
			
			if( pattern[j] == pattern[i] ) {
				pi[i] = ++j;
			}
		}
		
		
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0,j=0; i < tlen; i++) {
			while(j>0&&text[i]!=pattern[j]) {
				j = pi[j-1];
			}
			
			if(text[i]==pattern[j]) {
				if(j==plen-1) {
					cnt++;
					list.add((i+1)-plen+1);
					j=pi[j];
				}else {
					j++;
				}
			}
		}
		
		System.out.println(cnt);
	
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
