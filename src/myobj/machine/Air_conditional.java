//package myobj.machine;
//
//public class Air_conditional extends Econsumption implements Electronics{
//	
//	String name = "������";
//	int electric_consumption = 0;	// ��뷮
//	int electric_power = 0;			// ���޷�
//	int powerConsumption = 0;		// ����
//	
//	
//	
//	public Air_conditional() {}
//	
//	public Air_conditional(String name, int electric_consumption) {
//		this.name = name;
//		this.electric_consumption = electric_consumption;
//	}
//	
//	@Override
//	void show_Econsumption() {
//		System.out.printf("%s ����� ��� ���·��� %d(W) �Դϴ�\n", name, this.electric_consumption);
//		
//	}
//	
//	@Override
//	public void supply_electricPower(int electric_power) {
//		this.electric_power = electric_power;
//		System.out.printf("%d��ŭ %s�� ������ ���޵Ǿ����ϴ�.\n", this.electric_power, this.name);
//	}
//
//	@Override
//	public void consume_powerConsumption() {
//		
//	}
//	
//	@Override
//	public void operate_ownFunction() {
//		System.out.println("�������� ���� �ù��� �����մϴ�.");
//	}
//
//	
//	
//}
