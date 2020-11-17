package quiz;

import java.util.ArrayList;
import java.util.Random;
import myobj.Student;

public class D01_StudentList {

	// 학생 클래스를 요소로 갖는 ArrayList를(group) 생성하고
	// 학생을 30명 추가해보세요
	
	// 1. 30명의 점수가 자동으로 설정되도록 만들어 보세요
	
	// 2. 모든 학생의 총 점수와 평균 점수를 구해보세요
	
	// 3. 반 평균을 구해보세요
	
	// 4. 이름 생성 규칙
	// 		테스트학생 0000
	//		테스트학생 0001
	//		테스트학생 0002
	
	public static void main(String[] args) {
		
		ArrayList<Student> group = new ArrayList<>();
		double avgInClass = 0.0;
		double avgClass = 0.0;
		
		for(int i = 0; i < 30; i++) {
			
			group.add(new Student());
			group.get(i).getTotal();
			//group.get(i).show_score();
			
			avgInClass += group.get(i).getAvg(); 
			
			// println 함수는 사실 해당 객체의 toString() 메서드를 호출한다	
		}
		System.out.println(group);
		avgClass =  avgInClass / (double) group.size();
		System.out.printf("반 평균 : %.2f\n",avgClass);
	}
}








































































