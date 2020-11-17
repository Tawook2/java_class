//package myobj.machine;
//
//public class Air_conditional extends Econsumption implements Electronics{
//	
//	String name = "에어컨";
//	int electric_consumption = 0;	// 사용량
//	int electric_power = 0;			// 공급량
//	int powerConsumption = 0;		// 동작
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
//		System.out.printf("%s 기계의 사용 전력량은 %d(W) 입니다\n", name, this.electric_consumption);
//		
//	}
//	
//	@Override
//	public void supply_electricPower(int electric_power) {
//		this.electric_power = electric_power;
//		System.out.printf("%d만큼 %s에 전력이 공급되었습니다.\n", this.electric_power, this.name);
//	}
//
//	@Override
//	public void consume_powerConsumption() {
//		
//	}
//	
//	@Override
//	public void operate_ownFunction() {
//		System.out.println("쾌적한을 위해 냉방을 시작합니다.");
//	}
//
//	
//	
//}
