package myobj.fruit;

import java.util.Random;

public class Mango implements Comparable<Mango>{
	public int calorie;
	//String color = "오렌지색";
	public int sweet;
	//private String name = "망고";
	public int id;
	
	
	private static int fru_count = 0;
	private static int mango_id = 0;
	
	/**
	 * 
	 * 비교 대상 망고를 생성하는 생성자
	 */
	public Mango(int calorie, int sweet, int id) {
		this.calorie = calorie;
		this.sweet = sweet;
		this.id = id;
	}
	
	public Mango() {
		Random ran = new Random();
		this.calorie = ran.nextInt(1000) + 1;
		this.sweet = ran.nextInt(10) + 1;
		//this.name = String.format("망고%02d", fru_count++);
		
		// 해당 인스턴스를 유일하게 구분해줄 수 있는 값
		id = mango_id++; 
		System.out.printf("%d번 망고가 생성되었습니다.\n",id);
		
	}
	
	@Override
	public int hashCode() {
		// 이 객체를 유일하게 구분하려면 어떻게 해야할까요? 를 정의하는곳
		// (기본 동작은 이 인스턴스의 주소값을 사용)
		return id;
	}

	@Override
	public int compareTo(Mango next_mango) {
//		if(this.calorie < next_mango.calorie ) {
//			return -1;
//		}
//		else if(this.calorie > next_mango.calorie) {
//			return 1;
//		}
//		else {
//			return 0;	
//		}
		
		// 비교할 방법
		int calorie_result = this.calorie - next_mango.calorie;
		
		return calorie_result == 0 ? this.sweet - next_mango.sweet : calorie_result;
		
	}
	
	public int calorie() {
		return this.calorie;
	}
	
	public int sweet() {
		return this.sweet;
	}
	
	@Override
	public String toString() {

		
		return String.format("\n{%04X: %d/%d}\n",id, calorie, sweet);
	}
}
