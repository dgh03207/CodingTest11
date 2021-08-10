package algo_0801;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class B1181 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());		//단어 갯수
		String[] words = new String[T];					//단어를 저장할 String타입 배열
		TreeSet<Integer> sizes = new TreeSet<>();		//단어의 사이즈를 저장해줄 TreeSet(자동 정렬/제거)
														
		for (int t = 0; t < T; t++) {					//단어와 단어의 사이즈를 배열에 저장해줌.
			words[t] = br.readLine();
			sizes.add(words[t].length());
			
		}
		
		Arrays.sort(words);								//단어를 알파벳 순서로 정렬
		
		int size = 0;
		String prev=null;
		while (sizes.size()!=0) {
			size = sizes.pollFirst();
			for (int j = 0; j < words.length; j++) {
				if (words[j].length() == size && !words[j].equals(prev)) 					 
						sb.append(words[j]+"\n");
				prev = words[j]; 				
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
 