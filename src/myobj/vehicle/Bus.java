package myobj.vehicle;

public class Bus {
	
	
	public String bus_number;
	public int numberOfSeat;
	public int speed;
	public String bus_name;
	public String destination;
	
	public Bus() {
		this(30, 80, "��ȭ���Ա�");
	}
	
	public Bus(int numberOfSeat, int speed, String destination) {
		this.numberOfSeat = numberOfSeat;
		this.speed = speed;
		this.destination = destination;
	}

	public void getOn() {
		
		System.out.println("�°��� �Ѹ� ž���߽��ϴ�.\n");
		numberOfSeat -= 1;
		if(speed > 50) {
			speed -= 10;
			System.err.println("�ӵ�����\n");
		}else {
			speed = 50;
			System.err.println("�ӵ� ������\n");
		}
		
		System.out.printf("���� �¼� �� : %d, ������ �ӵ� : %d\n", this.numberOfSeat, this.speed);
		
		
		if(numberOfSeat == 0) {
			System.err.println("�ڸ��� �����ϴ�, ���� ������ �̿����ּ���\n");
		}
		
	}
	
	public void getOff() {
		System.out.println("�°��� �Ѹ� ���� �߽��ϴ�.\n");
		numberOfSeat += 1;
		speed += 10;
		System.out.printf("���� �¼� �� : %d, ������ �ӵ� %d\n", numberOfSeat, speed);
	}
	
}
