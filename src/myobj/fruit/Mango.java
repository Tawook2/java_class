package myobj.fruit;

import java.util.Random;

public class Mango implements Comparable<Mango>{
	public int calorie;
	//String color = "��������";
	public int sweet;
	//private String name = "����";
	public int id;
	
	
	private static int fru_count = 0;
	private static int mango_id = 0;
	
	/**
	 * 
	 * �� ��� ���� �����ϴ� ������
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
		//this.name = String.format("����%02d", fru_count++);
		
		// �ش� �ν��Ͻ��� �����ϰ� �������� �� �ִ� ��
		id = mango_id++; 
		System.out.printf("%d�� ���� �����Ǿ����ϴ�.\n",id);
		
	}
	
	@Override
	public int hashCode() {
		// �� ��ü�� �����ϰ� �����Ϸ��� ��� �ؾ��ұ��? �� �����ϴ°�
		// (�⺻ ������ �� �ν��Ͻ��� �ּҰ��� ���)
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
		
		// ���� ���
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
