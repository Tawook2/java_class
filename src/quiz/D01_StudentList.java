package quiz;

import java.util.ArrayList;
import java.util.Random;
import myobj.Student;

public class D01_StudentList {

	// �л� Ŭ������ ��ҷ� ���� ArrayList��(group) �����ϰ�
	// �л��� 30�� �߰��غ�����
	
	// 1. 30���� ������ �ڵ����� �����ǵ��� ����� ������
	
	// 2. ��� �л��� �� ������ ��� ������ ���غ�����
	
	// 3. �� ����� ���غ�����
	
	// 4. �̸� ���� ��Ģ
	// 		�׽�Ʈ�л� 0000
	//		�׽�Ʈ�л� 0001
	//		�׽�Ʈ�л� 0002
	
	public static void main(String[] args) {
		
		ArrayList<Student> group = new ArrayList<>();
		double avgInClass = 0.0;
		double avgClass = 0.0;
		
		for(int i = 0; i < 30; i++) {
			
			group.add(new Student());
			group.get(i).getTotal();
			//group.get(i).show_score();
			
			avgInClass += group.get(i).getAvg(); 
			
			// println �Լ��� ��� �ش� ��ü�� toString() �޼��带 ȣ���Ѵ�	
		}
		System.out.println(group);
		avgClass =  avgInClass / (double) group.size();
		System.out.printf("�� ��� : %.2f\n",avgClass);
	}
}








































































