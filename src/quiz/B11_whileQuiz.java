package quiz;

public class B11_whileQuiz {

	// while���� �̿��Ͽ�
	
	// 1. 1���� 100 ������ 3�� ����� ������ ���غ�����
	
	// 2. 200���� 1���� ����غ�����
	
	// 3. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ������ ���غ�����
	public static void main(String[] args) {
		
		// 1.
		int num1 = 1;
		int sum = 0;
		while(num1 <= 100) {
			if(num1 % 3 == 0)
				sum += num1;
			num1++;
			
		}
		System.out.println(sum);
		System.out.println();
		
		// 2.
		num1 = 200;
		while(num1 > 0) {
			System.out.print(num1 + " ");
			num1--;
			if(num1 % 10 == 0)
				System.out.println();
		}
		System.out.println();
		
		// 3.
		num1 = 1;
		sum = 0;
		while(num1 <= 200) {
			if(!(num1 % 2 == 0 || num1 % 3 == 0)){
				sum += num1;	
			}
			num1++;
					
		}
		System.out.println(sum);
	}
}
