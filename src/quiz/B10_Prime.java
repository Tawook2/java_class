package quiz;

import java.util.Scanner;

public class B10_Prime {

	// ����ڷκ��� ���ڸ� �Է¹�����
	// 1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
	
	// �� �Ҽ� : ����� 1�� �ڱ� �ڽŹۿ� ���� ����
	
	public static void main(String[] args) {
		
		System.out.println("���� �Է� >");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prime = 0;
		
		// i : �Ҽ����� �׽�Ʈ �غ� ����
		for(int i = 2; i <= num; i++) {
			prime = 0;
			// j : i�� ������� �׽�Ʈ �غ� ����
			int sqrt = (int)Math.sqrt(i);
			for(int j = 2; j <= sqrt; j++) {
				
				if(i % j == 0) {
					prime++;
				}
			}
			if(prime == 0) {
				System.out.println(i);
			}
			
		}
		
	}
}
