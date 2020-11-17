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
		System.out.println("������ ���� ���ϴ�.\n");
		this.size -= 3;
		this.calorie -= 5;
		System.out.printf("������ �絵 %d ��ŭ ����� ���ϴ�.\n", this.sweet);
		System.out.printf("������ ������ : %d, ������ Į�θ� : %d\n", this.size, this.calorie);
	}
}
