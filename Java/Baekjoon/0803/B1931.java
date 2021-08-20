package Algo_0803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//회의실 배정
public class B1931 {
	static int prev_meeting,cnt;
	static class Meeting implements Comparable<Meeting>{
		int start;
		int end;
		public Meeting(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		@Override
		public int compareTo(Meeting o) {
			int value = this.end-o.end;
			if(value!=0) {return value;}
			else {
				return this.start-o.start;
			}
		}
		
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Meeting[] meetings = new Meeting[N];
		
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			meetings[n] = new Meeting(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));			
		}
		getScheduled(meetings);
		System.out.println(cnt);
		
		
	}
	
	private static void getScheduled(Meeting[] meetings) {
		
		Arrays.sort(meetings);			//meetings배열을 정렬해준다.
		
		
		for (int i = 0; i < meetings.length; i++) {
			if(prev_meeting <= meetings[i].start) { //이전 미팅의 종료일정이 현재 미팅의 시작일정보다 작거나 같은 겨우.
				prev_meeting = meetings[i].end;
				cnt++;
			}
		}
		
	}
	
}
