package Algo_0804;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * B17413
 */
public class B17414 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	String line = br.readLine();
	
    	upsidedown(line);
    	
    	System.out.println(sb.toString());
	}
	
	private static void upsidedown(String line){
		Stack<Character> stack = new Stack<>();
		boolean flag = false;
		
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			
			if(c=='<') {
				while(!stack.isEmpty()) sb.append(stack.pop());
				sb.append(c);
				flag = true;
			}else if(c=='>'){
				sb.append(c);
				flag = false;
			}
			
			else if(flag==true) {					//태그 처리해줌
				sb.append(c);
			}else if(flag == false) {			//단어가 나오면 처리해줌
				if(c==' ') {					//공백 문자가 나오면 stack을 처리해줌
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(c);
				}else {							//문자가 공백이 아니면
					stack.add(c);				//뒤집어 출력하기 위해 스택에 문자를 입력한다.
				}
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
	}
	
}