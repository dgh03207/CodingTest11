import java.util.Scanner;
public class B11720 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String line = sc.nextLine();
		int sum = 0;
		
		for (int i = 0; i < size; i++) {
			sum+=line.charAt(i)-'0';
		}
		System.out.println(sum);	
	}
}
