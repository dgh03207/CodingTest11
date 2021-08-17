package com.day11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class J2440 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int answer = 0;                 //정답을 저장하는 변수
        int box5 = 0;                   //5키로짜리 박스 갯수를 저장하는 변수
        int box3 = 0;                   //3키로짜리 박스 갯수를 저장하는 변수
                                         
        box5 = N/5;                     //N이 5kg박스로 몇개 만들 수 있는지 check
        
        while(true) {
        	if (box5>0 && (N-box5*5)%3==0) {
        		answer += box5;
        		answer += (N-box5*5)/3;
        		break;
        	}
        	else if (box5==0 && N%3==0) {
        		answer = N/3;
        		break;
        	}
        	else if(box5==0 && N%3!=0) {
        		answer = -1;
        		break;
        	}
        	box5--;
        }

        System.out.println(answer);
      
    }
    
//	//교수님의 풀이  
//	int answer = 0;
//	int bag3 = 0;
//	
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	
//	while(n%5 != 0 && n>=0) {
//		bag3++;
//		n-= 3;
//	}
//	
//	//n이 5kg봉지로 해결이 되는 경우, or n이 음수로 나오는 경우
//	answer = (n<0)?-1 : bag3 + n/5;
//	System.out.println(answer);
//	
}