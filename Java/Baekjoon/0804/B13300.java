package Algo_0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//브론즈
//방배정
public class B13300 {
	
	static int N,K;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());				//학생 수
		K = Integer.parseInt(st.nextToken());				//한방에 배정할 수 있는 최대 학생 수
		
		int[] grade_boy = new int[6];							//6학년까지 배열이 있음 (인덱스는 0~5)	
		int[] grade_girl = new int[6];							
		
		
		
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			
			if (gender==0) {									//여학생
				grade_girl[grade-1]++;
			}else if(gender==1) {								//남학생
				grade_boy[grade-1]++;
			}
			
			
		}
		int answer = 0;
		answer += get_Room(grade_girl);
		answer += get_Room(grade_boy);
		
		System.out.println(answer);
		
		
	}
	private static int get_Room(int[] students) {
		int room = 0;
		
		for (int g = 0; g < 6; g++) {
			
			if(students[g]!=0) {
				room += students[g]/K;
				if(students[g]%K!=0) {
					room += 1;
				}
			}
			
		}
		return room;
	}
}
