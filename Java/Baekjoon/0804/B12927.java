package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//배수 스위치
public class B12927 {

	static String[] switches; // switches의 정보를 저장하는 int배열
	static int N,val; // switches의 사이즈를 저장하는 배열

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String switch_info = br.readLine();			//문자열로 switch정보를 받아옴
		int i = 1;
		N = switch_info.length();					//스위치의 길이를 얻음
		switches = new String[N];					//스위치의 정보를 저장할 배열을 생성함
		switches = switch_info.split("");
		
		System.out.println(work());
		
	}
	
	private static int work() {
		int cnt = 0;
		for (int i = 0; i < switches.length; i++) {
			if(switches[i].equals("Y")) {
				turnoff(i);
				cnt +=1; 
			}
		}
		
		if(check(switches)) return cnt;
		else return -1;
	}
	
	private static void turnoff(int i) {
		int start = i;
		while(start<switches.length) {
			if(switches[start].equals("N"))switches[start] = "Y";
			else if(switches[start].equals("Y"))switches[start] = "N";
			
			start+=(i+1);
		}
	
	}
	
	private static boolean check(String[] switches) {
		
		for (int i = 0; i < switches.length; i++) {
			if(switches[i].equals("Y")) return false;
		}
		
		return true;
	}

}
