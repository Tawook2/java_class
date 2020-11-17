package myobj;

import java.util.Random;

public class Student implements Comparable<Student>{
	// 외부 클래스에서 필드의 직접 접근을 허용하지 않는것이 좀 더 객체지향적이다
	private int kor, eng, math;
	public int total;
	private double avg;
	private String name = "테스트학생";
	
	
	
	
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
		this.name = String.format("테스트학생%04d", stu_count++);
		
	}
	
	public int getTotal() {
		return kor + eng + math;
	}	
	
	public double getAvg() {
		return kor + eng + math / (double) NUM_OF_SUBJECT;
	
	}
	
	public void show_score() {
		System.out.println(this.name);
		System.out.printf("국어 : %-2d - 영어 : %-2d - 수학 : %-2d - (총점 : %-3d - 평균 : %.2f)\n", kor, eng, math, total, avg);
	}
	
	// ※ toString()은 Object 클래스의 메서드이기 때문에
	//	 모든 객체가 가지고 있다
	@Override
	public String toString() {
		// 이 객체를 문자열로 표현한다면 무엇일까? 에 대한 정의를 하는 메서드
		
		// # String.format()
		// printf처럼 서식을 이용하여 원하는 문자열을 생성하는 메서드
		//return "[" + name + "/" + total +  "/" + avg + "]";
		
		//String str = new String("abc");
		//String str2 = "abc";
		
		// 인스턴스 메서드
		//str.charAt(0);
		//str.charAt(2);
		
		// 클래스명 뒤에 .찍고 사용하는 메서드 static메서드
		return String.format("\n{%s/%d/%d/%d/%.2f}\n", name, kor, eng, math, getAvg());
		
	}
	
	@Override
	public int compareTo(Student next_student) {
		
		// "이 클래스는 크기 비교를 이런식으로 하겠다"를 정의하는 곳
		//	- 양수를 리턴 : 현재 객체가 다음 객체보다 더 큼 (뒤로 가야함)
		//	- 음수를 리턴 : 현재 객체가 다음 객체보다 작음	(앞으로 가야함)
		//	- 0을 리턴 : 현재 객체와 다음 객체의 크기가 같음
		
		// 영어점수가 높은 사람이 맨 앞에 나오도록 정렬하고 밥을 먹고 오세요
		
		if(this.eng > next_student.eng) {
			// 수학 점수가 더 큰 학생이 정렬 시 뒤에 나왔으면 좋겠다는 뜻
			return -1;
		}
		else if(this.eng < next_student.eng) {
			// 수학 점수가 더 작은 학생은 정렬시 앞으로 나왔으면 좋겠다는 뜻
			return 1;
		}else {
			// 수학 점수가 같을땐 그냥 내버려두겠다는 뜻
			return 0;
		}
		
		
	}
}

