//package myobj.machine;
//
//public class Refrigerator extends Econsumption implements Electronics{
//
//	String name = "냉장고";
//	int electric_consumption = 0;
//	int electric_power = 0;
//	int powerConsumption = 0;
//	
//	public Refrigerator() {}
//	
//	public Refrigerator(String name, int electric_consumption) {
//		this.name = name;
//		this.electric_consumption = electric_consumption;
//	}
//	
//	@Override
//	void show_Econsumption() {
//		System.out.printf("%s 기계의 사용 전력량은 %d(W) 입니다\n", name, this.electric_consumption);
//	}
//	
//	@Override
//	public void supply_electricPower(int electric_power) {
//		this.electric_power = electric_power;
//		System.out.printf("%d만큼 %s에 전력이 공급되었습니다.\n", this.electric_power, this.name);
//		
//	}
//
//	@Override
//	public void consume_powerConsumption() {
//		
//		
//	}
//	
//	@Override
//	public void operate_ownFunction() {
//		System.out.println("식자재의 신선도를 유지합니다");
//	}
//
//	
//	
//	
//
//}
