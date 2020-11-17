//package myobj.machine;
//
//import java.util.Scanner;
//
//public class Microwave extends Econsumption implements Electronics{
//
//	String name = "전자렌지";
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
//		time_set();
//		
//		for(int i = this.time; i > 0; i--) {
//			this.electric_power -= 20;
////			System.out.println("전력" + this.electric_power);
//			this.electric_consumption += 20;
////			System.out.println("사용전력" + this.electric_consumption);
//			System.out.printf("시간 : %d\n", i);
//		
//			
//			
//		}
//		System.out.printf("작동완료 - 감소한 전력 %d - 사용한 전력 %d\n",this.electric_power,this.electric_consumption);
//		
//	}
//
//	@Override
//	public void operate_ownFunction() {
//		System.out.println("음식을 데우기 시작합니다.");
//	}
//	
//	public int time_set() {
//		System.out.println("시간을 입력 > ");
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
