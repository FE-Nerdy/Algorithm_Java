import java.util.Scanner;

public class What_Is_Recursion {
	
	static String s = new String ("��� �亯�Ͽ���.");

	private static String recursive(int n ,String dash) {
		System.out.println(dash + "\"����Լ��� ������?\"");
		
		if(n == 0) {
			System.out.println(dash + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			return dash + s;
		}
		
		System.out.println(dash + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(dash + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(dash + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		System.out.println(recursive(n-1, dash + "____"));
		return dash + s;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		System.out.println(recursive(n, ""));
		
		sc.close();
	}
}