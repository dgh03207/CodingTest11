import java.util.Scanner;

public class 2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cnt = new int[n];
		String[] words = new String[n];

		for (int i = 0; i < n; i++) {
			cnt[i] = sc.nextInt();
			words[i] = sc.next();
		}

		for (int a = 0; a < n; a++) {
			for (int c = 0; c < words[a].length(); c++) {
				String[] word = words[a].split("");
				for (int b = 0; b < cnt[a]; b++) {
					System.out.print(word[c]);
				}
				
			}
			System.out.println();
			
		}

	}

}
