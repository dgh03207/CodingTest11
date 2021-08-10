

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class B10828 {

	
	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		ArrayList arr = new ArrayList();
		int posi = 0;
		for (int c = 0; c < cnt; c++) {
			
			String cmd = br.readLine();
			if (cmd.startsWith("push")) {
				arr.add(posi++,Integer.parseInt(cmd.split(" ")[1]));
			}
			else if (cmd.equals("pop")) {
				if (posi == 0)
					System.out.println(-1);
				else {
					System.out.println(arr.get(posi-1));
					posi--;
				}
			}
			else if (cmd.equals("size")) {
				System.out.println(posi);
			}
			else if (cmd.equals("empty")) {
				if (posi == 0)
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if (cmd.equals("top")) {
				if (posi == 0)
					System.out.println(-1);
				else
					System.out.println(arr.get(posi-1));
			}
		}

	}
}


