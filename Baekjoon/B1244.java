

import java.util.Scanner;


public class B1244 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] switches = sc.nextLine().split(" ");
		int num = Integer.parseInt(sc.nextLine());
		
		
		for (int i = 0; i < num; i++) {
			int[] buffer = new int[2];
			buffer[0] = sc.nextInt();
			buffer[1] = sc.nextInt();
		
			if (buffer[0] == 1) {
				for (int j = 0; j < switches.length; j++) {
					if ((j+1)%buffer[1]==0) {
						if (switches[j].equals("0")) switches[j] = "1";
						else switches[j] = "0";
					}
				}
			
				
			}
			
			else if (buffer[0] == 2) {
				int a = buffer[1]-1;
				int b = buffer[1]-1;
				while (a>=0&&b<N) {
					if(a==b){
						if (switches[a].equals("0")) switches[a] = "1";
						else switches[a] = "0";

					}else if(switches[a].equals(switches[b])){
						if (switches[a].equals("0")) switches[a] = "1";
						else switches[a] = "0";
						
						if (switches[b].equals("0")) switches[b] = "1";
						else switches[b] = "0";

					}else {break;}
					--a;
					++b;
				

				}      
			}	
		}
		int cnt = 0;
		
		for (String s : switches) {
			
			if (cnt != 0&&cnt %20 == 0) {
				System.out.println();
			}
			System.out.print(s+" ");
			cnt++;
		}
		
		
	
	}
}


