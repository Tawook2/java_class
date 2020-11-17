package myobj.fruit;

public class Grape {
	public int size;
	public int sweet;
	public int calorie;
	public String color;
	
	public Grape() {}
	
	public Grape(int size, int sweet, int calorie, String color) {
		this.size = size;
		this.sweet = sweet;
		this.calorie = calorie;
		this.color = color;
	}
	
	public void taste() {
		System.out.println("포도의 맛을 봅니다.\n");
		this.size -= 3;
		this.calorie -= 5;
		System.out.printf("포도의 당도 %d 만큼 기운이 납니다.\n", this.sweet);
		System.out.printf("포도의 사이즈 : %d, 포도의 칼로리 : %d\n", this.size, this.calorie);
	}
}
