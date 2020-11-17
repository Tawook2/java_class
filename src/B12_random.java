import java.util.Random;

public class B12_random {

	public static void main(String[] args) {
		
		// # JAVA���� ������ ���� �����ϱ�
		
		// 1. Math.random() : 
		//	- doubleŸ���� 0 <= x < 1�� ���� �Ҽ��� �����Ѵ�
		//	- �� �Ҽ��� �̿��Ͽ� ���ϴ� ���ڸ� ���� ����� �� �ִ�
		
		// # ���ϴ� ���ڸ� ����� ���� (ex : 80 ~ 100)
		//	 (1) ���ϴ� ������ ������ ���Ѵ�
		//			0 <= x < 21
		//	 (2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�
		//			80<= x < 101
		//	 (3) �Ҽ��� �Ʒ��� �����Ѵ�
		
		for(int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 21 + 80));
		}
		
		// 2. Random Ŭ������ �̿�
		//	- ������ �� ���ϴ� �õ��ȣ�� ������ �� �ִ�
		//	- ���� �õ� ��ȣ�� �����ϸ� ���� ���� ���´�
		//	- �õ��ȣ�� �������� ������ �������� �õ尡 ���õȴ�
		
		// # ���ο� ���� �õ� ����
		Random ran = new Random(10);
		Random ran2 = new Random(10);
		
		// # Random.nextInt(bound)
		//	- 0 ~ bound�̸��� ������ ��ȯ�Ѵ�
		//	- bound�� �������� ������ int���� ��ü���� ���� ������ ���õȴ�
		System.out.println(ran.nextInt(30)); //0 ~ 29 �� ����
		System.out.println(ran.nextInt());	// int��ü ������ ����
		System.out.println(ran.nextInt(21) + 80); // 80 ~ 100 �� ����
		
		
		
		// ���� : 
		int max = 3000;
		int min = 5000;
		int num1 = 0;
		
		for(int i = 0; i < 100; i++) {
			System.out.println((int)(Math.random() * 2001 + 3000));
			num1 = (int)(Math.random() * 2001 + 3000);
			
			// max = Math.max(max,num);
			// min = Math.min(min,num);
			
			if(num1 > max)
				max = num1;
			if(num1 < min)
				min = num1;
		}
		System.out.printf("���� ū ��: %d , ���� ���� ��: %d ",max, min);
	}
}
