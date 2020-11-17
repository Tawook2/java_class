import myobj.fruit.Grape;
import myobj.vehicle.Bus;

public class C03_constructor {

	// # Ŭ������ ������ (Constructor)
	
	//	- Ŭ������ �̸��� �Ȱ��� �̸��� �Լ�
	//	- new�� �Բ� �����ڸ� ȣ���ϸ� Ŭ������ ���ǵȴ�� �ν��Ͻ��� �����Ѵ�
	//	- �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ� ��ȯ�ȴ�
	//	- �����ڸ� ���� �������� ������ �ƹ��͵� ���ǵ��� ����
	//	  �⺻ �����ڰ� �ڵ����� �����ȴ�
	
	//	�� �⺻ ������ - �Ű� ������ ���� ������
	public static void main(String[] args) {
		Orange o1 = new Orange();
		
		System.out.println(o1.color);
		System.out.println(o1.size);
		System.out.println(o1.sweet);
		
		Strawberry s1 = new Strawberry();
		
//		Grape g1 = new Grape(30);
//		Grape g2 = new Grape(25);
//		Grape g3 = new Grape();
//		
//		for(int i = 0; i < 31; i++) {
//			g1.eat();
//		}
		
		// �Ʊ� ������ Ŭ������ �����ڸ� 2���� �߰��غ�����
		// myobj.fruit, myobj.vehicle
		
		Grape grape01 = new Grape();
		Grape grape02 = new Grape(20, 10, 1000, "white");
		System.out.println(grape02.size);
		System.out.println(grape02.sweet);
		System.out.println(grape02.calorie);
		System.out.println(grape02.color);
		
		grape02.taste();
		
		
		Bus bus01 = new Bus(30, 100, "������б�");
		
		System.out.println(bus01.numberOfSeat);
		System.out.println(bus01.speed);
		System.out.println(bus01.destination);
		
		for(int i = 0; i < 30; i++) {
			bus01.getOn();
		}
		
		
		Bus bus02 = new Bus();
		
		System.out.println(bus02.numberOfSeat);
		System.out.println(bus02.speed);
		System.out.println(bus02.destination);
		
		bus02.getOn();
		bus02.getOff();
		
		
	
	}
	
}

// ���ǵ� �����ڰ� �ִٸ� �⺻ �����ڰ� �ڵ����� �������� �ʴ´�
//class Grape{
//	int podo;
//	int skin;
//	
//	public Grape(int podo) {
//		this.podo = podo;
//		this.skin = 0;
//	}
//	
//	// �ڵ����� �������� �����Ƿ�, �⺻ �����ڸ� ����ϰ� �ʹٸ� ���� �����ؾ� �Ѵ�
//	public Grape() {
//		this(20); 
//		System.out.println("�⺻ �����ڷ� ���ƿԽ��ϴ�.");
//		
//		// �����ڿ��� this()�� ���� �ٸ� �����ڸ� ȣ���� �� �ִ�
//		// �ٸ� �����ڴ� �ݵ�� ������ �� ���ٿ��� ȣ���ؾ� �Ѵ�
//		
//	}
//	
//	public Grape(int i, int j, int k, String string) {
//		// TODO Auto-generated constructor stub
//	}
//
//	public void eat() {
//		if (podo == 0) {
//			System.err.println("�� ������ �� �Ծ����ϴ�.");
//			System.out.printf("���� ���� ������ %d��, ���ش� %d�� �Դϴ�.\n",podo, skin);
//			return;
//		}
//		podo--;
//		skin++;
//		System.out.printf("���� ���� ������ %d��, ���ش� %d�� �Դϴ�.\n",this.podo, this.skin);
//	}
//}

// �����ڸ� �������� ���ٸ� ������ �⺻ �����ڰ� �����Ѵ�
class Strawberry {
	int seed;
	String color;
}

class Orange {
	
	int sweet;
	int size;
	String color;
	
	
	// # �������� Ư¡
	//	- ���� Ÿ���� ���� Ŭ�������� ���� �̸��� ������
	//	- �ν��Ͻ� �����ÿ� ���� ���� ȣ��ȴ�
	//	- �ַ� �ν��Ͻ� ������ ���� �ʱ�ȭ�ϴ� �뵵�� ����Ѵ�
	public Orange() {
		// ���ÿ��� Ŭ���� ���ο��� this�� �����ص� �ʵ忡 ������ �� �ִ�
		sweet = 10;
		size = 5;
		color = "orange";
	}
	
	// # �����ڵ� �Լ�ó�� �����ε��� �����ϴ�
	//	- �ϳ��� Ŭ������ �پ��� ������ �����ڸ� ������ ���� �� �ִ�
	public Orange(int sweet, int size, String color) {
		
		// # this
		//	- Ŭ���� ���ο��� ���� �ν��Ͻ��� ������ �� ����ϴ� Ű����
		
		// �ʵ尪�� ������������ ��ġ�� ���
		// this�� ���� ����� �������� ��Ȯ�ϰ� ������ �� �ִ�
		
		// �� this�� ���� ���� �ν��Ͻ� ������ �ȴ�
		
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}
}

























