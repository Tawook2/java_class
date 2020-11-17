package myobj.vehicle;

public class Bus {
	
	
	public String bus_number;
	public int numberOfSeat;
	public int speed;
	public String bus_name;
	public String destination;
	
	public Bus() {
		this(30, 80, "광화문입구");
	}
	
	public Bus(int numberOfSeat, int speed, String destination) {
		this.numberOfSeat = numberOfSeat;
		this.speed = speed;
		this.destination = destination;
	}

	public void getOn() {
		
		System.out.println("승객이 한명 탑승했습니다.\n");
		numberOfSeat -= 1;
		if(speed > 50) {
			speed -= 10;
			System.err.println("속도저하\n");
		}else {
			speed = 50;
			System.err.println("속도 유지중\n");
		}
		
		System.out.printf("남은 좌석 수 : %d, 버스의 속도 : %d\n", this.numberOfSeat, this.speed);
		
		
		if(numberOfSeat == 0) {
			System.err.println("자리가 없습니다, 다음 차량을 이용해주세요\n");
		}
		
	}
	
	public void getOff() {
		System.out.println("승객이 한명 하차 했습니다.\n");
		numberOfSeat += 1;
		speed += 10;
		System.out.printf("남은 좌석 수 : %d, 버스의 속도 %d\n", numberOfSeat, speed);
	}
	
}
