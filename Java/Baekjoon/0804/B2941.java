package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//크로아티아 알파벳
public class B2941 {
	static String[] C_alpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int answer = 0;
		
		for (int i = 0; i < C_alpha.length; i++) {
			String target= C_alpha[i];
			
			while(word.contains(target)) {
				word = word.replace(target, " ");
				answer ++;
			}
			
			
		}
		System.out.println(word.length());
		
	}
}
