package quiz;

import java.util.Scanner;

public class B10_GCD {

	// �� ���ڸ� �Է¹����� �� ������ �ִ������� ���غ�����
	// �� �ִ����� : �� ������ ����� �� ���� ū �����
	
	public static void main(String[] args) {
		
		System.out.println("ù��° ���� �Է�");
		System.out.println("�ι�° ���� �Է�");
		Scanner sc = new Scanner(System.in);
		
		/*
		 1. ������ �� �ڿ��� a, b�� �־�������, ���� ū ���� a��� �����غ��ڽ��ϴ�.
		 
		 2. a�� b�� ���� �������� n �̶�� �ϸ� (a%b = n)
		 n�� 0�϶�, b�� �ִ� �����(GCD)�Դϴ�.
		 
		 3. ���� n�� 0�� �ƴ϶��, a�� b���� �ٽ� �ְ� b�� n�� ���� �� �� �ٽ� 2.�� ������ �ݺ�
		 
		 */
		
		int a = 70;
		int b = 50;
		
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		
		int n = -1;
		for(; n != 0;) {
			n = a % b;
			a = b;
			b = n;
			// 20 = 70 % 50 = 20;
			// 50 = 50
			// 20 = 20
			//---------
			// 10 = 50 % 20 = 10;
			// 20 = 20
			// 10 = 10
			//---------
			// 0 = 20 % 10 = 0;
			// 10 = 10
			// 0 = 0
			// for�� Ż��
		}
		System.out.println("�ִ� ������� " + a + "�Դϴ�.");
		
//		// num1�� �� ũ�� ���� �ٲ۴�
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		
//		if(num1 > num2) {
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//		
//		int gcd =1;
//		for(int i = num1; i > 0; --i) {
//			
//			if(num1 % i == 0 && num2 % i == 0) {
//				gcd = i;
//				break;
//			}
//				
//		}
//		System.out.printf("'%d'�� '%d'�� �ִ� ������� '%d'�Դϴ�\n", num1, num2, gcd);
	}
	
}
