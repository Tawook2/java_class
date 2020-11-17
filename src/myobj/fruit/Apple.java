package myobj.fruit;

// ※ 클래스 하나당 파일 하나가 바람직하다
public class Apple {
	int calorie;
	String color;
	
	public Apple(String color) {
		calorie = 300;
		
		if(!color.equals("red")) {
			throw new InvalidColorException();
		}
	}
	
	public Apple eat() throws NoMoreCalorieException {
		//try {
			if(calorie <= 0) {
				throw new NoMoreCalorieException();
			}
		//} catch(NoMoreCalorieException e){
		//	System.out.println(e.getMessage());
		//	return this;
		//}
		
		System.out.println("맛있게 잘 먹었습니다.");
		calorie -= 100;
		return this;
	}
	
	public static void main(String[] args) {
		try {
		new Apple("red").eat().eat().eat().eat();
		} catch(NoMoreCalorieException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
