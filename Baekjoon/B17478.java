
import java.util.Scanner;

public class B17478 {
	
	static String[] scripts = { "\"����Լ��� ������?\"",
			"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���."  
			,"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���."
			,"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"",
			"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"",
			"��� �亯�Ͽ���."};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recur(N,"");
	}
	
	private static void recur(int n,String deco) {
		if (n==0) {
			System.out.println(deco+scripts[0]);
			System.out.println(deco+scripts[4]);
			System.out.println(deco+scripts[5]);
			}	
		
		else{
			System.out.println(deco+scripts[0]);
			System.out.println(deco+scripts[1]);
			System.out.println(deco+scripts[2]);
			System.out.println(deco+scripts[3]);
			recur(--n,deco+"____");
			System.out.println(deco+scripts[5]);
			
		}	
		
	}
}
