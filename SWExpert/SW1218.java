package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SW1218 {
		static String[] storage;
		static String open = "(<{[";
		static String close = ")>}]";
		
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 0; t < 10; t++) {
			
			int N = Integer.parseInt(br.readLine());	//테스트 케이스의  길이
			storage= br.readLine().split("");			//테스트 케이스 배열
			System.out.println("#"+(t+1)+" "+checker());
			
		}
		
	}
	
	private static int checker() {
		ArrayList<String> temp = new ArrayList<>();
		
		for (String s : storage) {
		
			if (open.contains(s)) {
				temp.add(s);
			}
			else if(close.contains(s)){
				
				if( temp.size()==0|| open.indexOf(temp.get(temp.size()-1))!=close.indexOf(s) ) {//유효하지 않은 경우
					return 0;
				}else if (open.indexOf(temp.get(temp.size()-1))==close.indexOf(s)){
					temp.remove(temp.size()-1);
				}
			}
		}
		return 1;
	}
}
