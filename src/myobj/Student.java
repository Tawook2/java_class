package myobj;

import java.util.Random;

public class Student implements Comparable<Student>{
	// �ܺ� Ŭ�������� �ʵ��� ���� ������ ������� �ʴ°��� �� �� ��ü�������̴�
	private int kor, eng, math;
	public int total;
	private double avg;
	private String name = "�׽�Ʈ�л�";
	
	
	
	
	final static int NUM_OF_SUBJECT = 3;
	static int stu_count = 0;
	
	public Student() {
		
		Random ran = new Random();
		int kor = ran.nextInt(51) + 50;
		int eng = ran.nextInt(51) + 50;
		int math = ran.nextInt(51) + 50;
		
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		//this.name += num;
		this.name = String.format("�׽�Ʈ�л�%04d", stu_count++);
		
	}
	
	public int getTotal() {
		return kor + eng + math;
	}	
	
	public double getAvg() {
		return kor + eng + math / (double) NUM_OF_SUBJECT;
	
	}
	
	public void show_score() {
		System.out.println(this.name);
		System.out.printf("���� : %-2d - ���� : %-2d - ���� : %-2d - (���� : %-3d - ��� : %.2f)\n", kor, eng, math, total, avg);
	}
	
	// �� toString()�� Object Ŭ������ �޼����̱� ������
	//	 ��� ��ü�� ������ �ִ�
	@Override
	public String toString() {
		// �� ��ü�� ���ڿ��� ǥ���Ѵٸ� �����ϱ�? �� ���� ���Ǹ� �ϴ� �޼���
		
		// # String.format()
		// printfó�� ������ �̿��Ͽ� ���ϴ� ���ڿ��� �����ϴ� �޼���
		//return "[" + name + "/" + total +  "/" + avg + "]";
		
		//String str = new String("abc");
		//String str2 = "abc";
		
		// �ν��Ͻ� �޼���
		//str.charAt(0);
		//str.charAt(2);
		
		// Ŭ������ �ڿ� .��� ����ϴ� �޼��� static�޼���
		return String.format("\n{%s/%d/%d/%d/%.2f}\n", name, kor, eng, math, getAvg());
		
	}
	
	@Override
	public int compareTo(Student next_student) {
		
		// "�� Ŭ������ ũ�� �񱳸� �̷������� �ϰڴ�"�� �����ϴ� ��
		//	- ����� ���� : ���� ��ü�� ���� ��ü���� �� ŭ (�ڷ� ������)
		//	- ������ ���� : ���� ��ü�� ���� ��ü���� ����	(������ ������)
		//	- 0�� ���� : ���� ��ü�� ���� ��ü�� ũ�Ⱑ ����
		
		// ���������� ���� ����� �� �տ� �������� �����ϰ� ���� �԰� ������
		
		if(this.eng > next_student.eng) {
			// ���� ������ �� ū �л��� ���� �� �ڿ� �������� ���ڴٴ� ��
			return -1;
		}
		else if(this.eng < next_student.eng) {
			// ���� ������ �� ���� �л��� ���Ľ� ������ �������� ���ڴٴ� ��
			return 1;
		}else {
			// ���� ������ ������ �׳� �������ΰڴٴ� ��
			return 0;
		}
		
		
	}
}

