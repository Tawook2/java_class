package myobj.machine;

public interface Electronics {

	// ���� ��� �������̽�
	
	// 1. ��� ���ڱ��� ���� ������ ���� �� �ִ�
	//void supply_electricPower(int electric_power);				//	o
	
	// 2. ��� ���ڱ��� �ֿܼ� �ѹ� ����Ҷ����� ���� �Һ� ��ŭ�� ������ �Һ��Ѵ�
	//void consume_powerConsumption();								//  o
		
	// 3. ��� ���ڱ��� �����ϰ� �ִ� ������ �ֿܼ� ����Ѵ�						//	o
	
	// �� ���߿� ������ �� �� �ʿ��� �޼������ �����Ѵ�
	
	void setConnect(ElectricSource src);
	
	//Generator getConnectedGenerator();
	
	String execute();
	
	
	
	
//	default void operate_ownFunction() {
//		System.out.println("�۵� ����");
//	}
//	
//	public static void turnOn(Electronics e) {
//		e.operate_ownFunction();
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		Air_conditional AC = new Air_conditional();
//		Microwave MC = new Microwave();
//		
//		turnOn(MC);
//		MC.supply_electricPower(5000);
//		MC.consume_powerConsumption();
//		MC.show_Econsumption();
		
		
		
//	}
}
