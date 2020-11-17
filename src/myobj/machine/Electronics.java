package myobj.machine;

public interface Electronics {

	// 전자 기기 인터페이스
	
	// 1. 모든 전자기기는 전력 공급을 받을 수 있다
	//void supply_electricPower(int electric_power);				//	o
	
	// 2. 모든 전자기기는 콘솔에 한번 출력할때마다 전력 소비량 만큼의 전력을 소비한다
	//void consume_powerConsumption();								//  o
		
	// 3. 모든 전자기기는 실행하고 있는 동작을 콘솔에 출력한다						//	o
	
	// ※ 나중에 가져다 쓸 때 필요한 메서드들을 정의한다
	
	void setConnect(ElectricSource src);
	
	//Generator getConnectedGenerator();
	
	String execute();
	
	
	
	
//	default void operate_ownFunction() {
//		System.out.println("작동 시작");
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
