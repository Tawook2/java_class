package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_31game {

	// # 31������ ��������
	
	// 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����Ѵ� (1, 2, 3)
	
	// 2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
	
	// 3. �������� 31�� �θ��� ��� Ȥ�� ��ǻ�Ͱ� �й��Ѵ�
	
	// boolean  computer_turn = ran.nextBoolean();
	// if(computer_turn)
	// computer_turn = !computer_turn;
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int first = ran.nextInt(2);
		int computer = 0;
		int human = 0;
		int currentNum = 0;
		
		
		System.out.println("������ �����մϴ� !");
		//int first = sc.nextInt(); ���� �İ� ���ϱ�
		switch(first) {
		case 0:
			System.out.println("��ǻ���� ���� ����");
			System.out.println();
			while(currentNum != 31) {
				
				System.out.println("��ǻ�� ���� : ");
				
				
				// ��ǻ�Ͱ� currentNum�� �� ��
				// 2, 6, 10, 14, 18, 22, 26, 30�� ����� ������ �̱�
				if(currentNum % 4 == 0 ) {
					computer =2;
				}else if(currentNum % 4 == 3) {
					computer =3;
				}else if(currentNum % 4 == 1) {
					computer = 1;
				}else {
					computer = ran.nextInt(3) + 1;
				}
				
				System.out.println("��ǻ�� > " + computer);
				currentNum += computer;
				System.out.println("\t���� ���� : " + currentNum);
				if(currentNum >= 31) {
					System.out.println("��ǻ�� �й�");
					System.exit(0);
				}
				System.out.println();
				System.out.println("�� ���� : �����Է�( ? )");
				
				
				
				while(true) {
					human = sc.nextInt();
					if(human > 0 && human < 4) {
						System.out.println("��� > " + human);
						currentNum += human;
						System.out.println("\t���� ���� : " + currentNum);
						if(currentNum >= 31) {
							System.out.println("��� �й�");
							System.exit(0);
						}
						break;
					}
					else {
						System.out.println("'1' �� '3' ���̿� ���ڸ� �Է����ּ���");
						System.out.println("�� ���� : �����Է�( ? )");
					}
				}
				System.out.println();
			
			}
			
			break;
			
		case 1:
			
			System.out.println("���� ���� ����");
			System.out.println();
			while(currentNum != 31) {
				
				
				System.out.println("�� ���� : �����Է�( ? )");
				
				while(true) {
					human = sc.nextInt();
					if(human > 0 && human < 4) {
						System.out.println("��� > " + human);
						currentNum += human;
						System.out.println("\t���� ���� : " + currentNum);
						if(currentNum >= 31) {
							System.out.println("��� �й�");
							System.exit(0);
						}
						break;
					}
					else {
						System.out.println("'1' �� '3' ���̿� ���ڸ� �Է����ּ���");
						System.out.println("�� ���� : �����Է�( ? )");
					}
				}
				
				System.out.println();
				
				System.out.println("��ǻ�� ���� : ");
				computer = ran.nextInt(3) + 1;
				System.out.println("��ǻ�� > " + computer);
				currentNum += computer;
				System.out.println("\t���� ���� : " + currentNum);
				if(currentNum >= 31) {
					System.out.println("��ǻ�� �й�");
					System.exit(0);
				}
				System.out.println();
			
			}
			
			break;
		
		}
	}
}
