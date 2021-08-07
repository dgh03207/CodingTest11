package Algo_04_0805;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1158 {
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String buffer = br.readLine();
    	int N = Integer.parseInt(buffer.split(" ")[0]);
    	int K = Integer.parseInt(buffer.split(" ")[1]);
    	
	
    	ArrayList arr = new ArrayList();
    	for (int i = 1; i <= N; i++) {
			arr.add(i);
		}
    	
    	int i = 0;
    	K=K-1;
    	System.out.print("<");
    	
    	while(arr.size() > 0) {
    		i = (i+K)%arr.size();
    		if (arr.size()==1) 
    			System.out.print(arr.get(i));
    		else
    			System.out.print(arr.get(i)+", ");
    		arr.remove(i);
    	}
    	System.out.println(">");
    }
    
}