package quiz;

import java.util.Scanner;

public class B10_NextPrime {

	// ����ڷκ��� ���ڸ� �Է¹�����
	// �Է¹��� ������ �� ũ�ų� ���� ���� �Ҽ��� ã�Ƽ� ����غ�����
	
	// 3 5
	public static void main(String[] args) {
		
		System.out.println("���� �Է� >");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prime = 0;
		int count = 0;
		// i : �Ҽ����� �׽�Ʈ �غ� ����
		for(int i = num; i >= num; i++) {
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
				count++;
			}
		if(count == 2)
			break;
		}
	}
}
