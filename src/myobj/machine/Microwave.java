//package myobj.machine;
//
//import java.util.Scanner;
//
//public class Microwave extends Econsumption implements Electronics{
//
//	String name = "���ڷ���";
//	int electric_consumption = 0;
//	int electric_power = 0;
//	int powerConsumption = 0;
//	int time = 0;
//	
//	public Microwave() {}
//	
//	public Microwave(String name, int electric_consumption) {
//		this.name = name;
//		this.electric_consumption = electric_consumption;
//	}
//	
//	@Override
//	void show_Econsumption() {
//		System.out.printf("%s ����� ��� ���·��� %d(W) �Դϴ�\n", name, this.electric_consumption);
//	}
//	
//	@Override
//	public void supply_electricPower(int electric_power) {
//		this.electric_power = electric_power;
//		System.out.printf("%d��ŭ %s�� ������ ���޵Ǿ����ϴ�.\n", this.electric_power, this.name);
//		
//	}
//
//	@Override
//	public void consume_powerConsumption() {
//		
//		time_set();
//		
//		for(int i = this.time; i > 0; i--) {
//			this.electric_power -= 20;
////			System.out.println("����" + this.electric_power);
//			this.electric_consumption += 20;
////			System.out.println("�������" + this.electric_consumption);
//			System.out.printf("�ð� : %d\n", i);
//		
//			
//			
//		}
//		System.out.printf("�۵��Ϸ� - ������ ���� %d - ����� ���� %d\n",this.electric_power,this.electric_consumption);
//		
//	}
//
//	@Override
//	public void operate_ownFunction() {
//		System.out.println("������ ����� �����մϴ�.");
//	}
//	
//	public int time_set() {
//		System.out.println("�ð��� �Է� > ");
//		Scanner sc = new Scanner(System.in);
//		int time = sc.nextInt();
//		this.time = time;
//		return this.time;
//	}
//
//	
//	
//
//}
