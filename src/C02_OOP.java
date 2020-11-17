import java.util.Scanner;

import myobj.fruit.Grape;
import myobj.vehicle.Bus;

public class C02_OOP {

	// # ��ü���� ���α׷��� (OOP: Object Oriented Programming)
	
	//	- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� ���
	//	- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ�
	//	  ���ǿ� �����ϴ� ��üó�� ���̵��� �Ͽ� �������� �ø���
	//	- ��ü(Object) : ���� �����ϴ� ��� ������ ���Ѵ�
	//					(�繰, ����, �˰����� ���)
	
	// ex: �л�
	//	- �л��� ���� : ����, ����, Ű, �г�, ����, ...
	//	- �л��� �޼���
	//		-> ������ ģ�� (�ֽ� �������� ������Ʈ)
	//		-> 1���� ������ (�г��� �ö�)
	//		-> �����Ѵ� (���̸� �԰� �г��� �״��)
	//		-> ������� ģ�� (���� ������ ���� ���� ���ΰ� �ٸ�)
	
	// ex: ���
	//	- ����� ���� : ũ��, ����, ��Ȯ ��¥, �絵, Į�θ�, ������....
	//	- ����� �޼���
	//		-> �Դ´� (ũ��, Į�θ� ��ȭ)
	//		-> ���� (����, �絵)
	//		-> ������ (������ �������� ���� �¾��� �� ���� ������ �޶�����)
	
	// �� �޼��� : ��ü�� ������ ������ ��ġ�ų� �޴� �Լ��� �޼����� �θ���.
	
	// # Ŭ���� (Class)
	
	//	- ��ü�� ���α׷��� ���� ǥ���� ��
	//	- Ŭ������ ��ü�� ���赵�̴� (���� ���������� ��ü�� ����)
	//	- Ŭ������ ���� �����ϴ� ���� ��ü�� '�ν��Ͻ�'��� �θ���
	//	- Ŭ������ ������ ���� Ÿ���̴�
	//	  (���� ��� Ŭ������ ����ٸ� ��� Ÿ���� ����� �� �ְ� �ȴ�)
	public static void main(String[] args) {
		
		// Scanner ���赵�� ��ü(Scanner �ν��Ͻ�)�� �����
		// �� ��ü�� �ּҸ� ���� sc�� ����
		Scanner sc = new Scanner(System.in);
		
		// Apple ���赵�� ��ü(Apple �ν��Ͻ�)�� �����
		// �� ��ü�� �ּҸ� ���� apple01�� ����
		Apple apple01 = new Apple();
		Apple apple02 = new Apple();
		Apple apple03 = new Apple();
		
		String[] fruits = new String[10];
		
		// Ŭ���� Ÿ�� �迭�� ���� ���������� �ν��Ͻ��� �������� �ʾҴ�
		// (�迭�� ��ü�� ������)
		Apple[] appleBox = new Apple[10];
	
		// ��� �迭�� ����� ��ü�� ����
		for(int i = 0; i < appleBox.length; i++) {
			appleBox[i] = new Apple();
		}
		
		
		
		apple02.sweet = 10;
		apple03.sweet = 8;
		
		// ��ü�� �������Ƿ� �̸� ������ ���赵��� ����� �� �ִ�
		apple01.birthday ="2020/10/29";
		apple01.size = 10;
		apple01.calorie = apple01.size * 10;
		apple01.color = "red";
		apple01.sweet = 7;
		
		for(int i = 0; i < 3; i++) {
			apple01.eat();
			apple02.eat();
			apple03.eat();
		}
		
		// 1. myobj.fruit ��Ű���� Ŭ������ �ϳ� �����ϰ� �ν��Ͻ��� �����غ�����
		
		Grape grape01 = new Grape();
		grape01.size = 20;
		grape01.calorie = grape01.size * 15;
		grape01.sweet = 10;
		grape01.color = "�����";
		
		grape01.taste();
		
		// 2. myobj.vehicle ��Ű���� Ŭ������ �ϳ� �����ϰ� �ν��Ͻ��� �����غ�����
		
		Bus bus01 = new Bus();
		bus01.bus_name = "5500-1";
		bus01.bus_number = "��-3703";
		bus01.destination = "��ȭ�� �Ա�";
		bus01.numberOfSeat = 30;
		bus01.speed = 70;
		
		bus01.getOn();
		
		
		// �� �� Ŭ������ ���� 3�� �̻� �޼��� 1�� �̻�
		
	}
}

// �鿩���⸦ �� ������ٸ� �߰�ȣ�� ������ Ŭ���� �ٱ��ΰ��� ������ �� �ִ�

//ex: ���
	//	- ����� ���� : ũ��, ����, ��Ȯ ��¥, �絵, Į�θ�, ������....
	//	- ����� �޼���
	//		-> �Դ´� (ũ��, Į�θ� ��ȭ)
	//		-> ���� (����, �絵)
	//		-> ������ (������ �������� ���� �¾��� �� ���� ������ �޶�����)

class Apple {
	
	// # �ν��Ͻ� ����
	//	- ��� �ν��Ͻ����� ���� �ٸ� ���� ������ �ִ� ����
	//	- �ʵ�, ��� ����, �ν��Ͻ� ����, ����
	
	int size;
	int sweet;
	int calorie;
	int damage;
	String color;
	String birthday;
	
	// # �ν��Ͻ� �޼���
	//	- �ν��Ͻ� ������ Ȱ���ϴ� �޼���
	//	- ���, �޼���, �Լ�
	void eat() {
		System.out.println("����� �Ծ����ϴ�.");
		System.out.println(this.sweet + "��ŭ ����� ���������ϴ�.");
		this.size -= 1;
		this.calorie -= 10;
		System.out.printf("ũ�� : %d, ���� Į�θ� : %d\n",
				this.size, this.calorie);
		
	}
	
}






































