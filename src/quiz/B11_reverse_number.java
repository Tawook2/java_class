package quiz;

import java.util.Scanner;

public class B11_reverse_number {

	// ����ڷκ��� ������ �ϳ� �Է¹ް�
	// �� ������ ���� �ڸ����� ���ڸ��� ����غ�����
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� >");
	
		int num1 = sc.nextInt();
		int reversed = 0;
		
		while(true) {
			
			
			//System.out.print(num1 % 10);
			
			reversed += num1 % 10;
			
			num1 /= 10;
			
			
			if(num1 <= 0) {	
				break;
			}
			reversed *= 10;
		}
		System.out.println(reversed);
	}
}
