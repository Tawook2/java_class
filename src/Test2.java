import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
//		사용자가 시간과 분을 순서대로 입력한다. 				o
//		9시 10분 이전이라면 "정상"을, 9시 10분 이후라면 "지각"을, 오후 3시 이후라면 "결석"을 출력한다.
//		정상적이지 않은 시간 또는 분이 입력된다면 "에러"를 출력한다. o
//		(단, 시간은 24시간제로 입력받는다)					o
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간입력");
		System.out.print("시간 : ");
		int hour = sc.nextInt();
		System.out.print("분 : ");
		int min = sc.nextInt();
		
		
		if((hour < 0 || hour >= 24) || (min < 0 || min >= 60))
			System.err.println("에러 발생");
		
		else if(hour >= 15)
			System.out.println("결석");
		
		else if((hour < 9 && min > 0) || (hour == 9 && min < 10)) {
			System.out.println("정상");
		}
		else if((hour >= 9 && min >= 10) || (hour > 9 && min >= 0))
			System.out.println("지각");
		
		
	}
}
