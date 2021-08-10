import java.util.Scanner;

public class B10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		for(int i = 0;i <26;i++) {
			char alphabet = (char)(97+i);
			if (S.contains(Character.toString(alphabet)))
				System.out.print(S.indexOf(alphabet)+" ");
			else {
				System.out.print(-1+" ");
			}
			
		}
		
		
	}
}
