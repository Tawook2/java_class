package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12_inputRightThing {

	public static void main(String[] args) {
		
		// ����ڷκ��� intŸ���� �����͸� �Է¹޾ƺ�����
		// �߸��� Ÿ���� �����Ͱ� �������� ���α׷��� ������� �ʾƾ� �մϴ�.
		// (�ùٸ��� int�� �Էµ� ��� ���α׷��� ����˴ϴ�
		
		// �� �Լ� �̿��ؼ� ������
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		
			
		while(true) {
			System.out.println("������ �Է� > ");
			
			try {
				num = sc.nextInt();	
				System.out.println(num);
				return;
			} catch(InputMismatchException e) {
				sc.nextLine();
				System.err.println("�߸��Է��ϼ̽��ϴ�");
				
				
			}
		}
	}
}
