import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
//		����ڰ� �ð��� ���� ������� �Է��Ѵ�. 				o
//		9�� 10�� �����̶�� "����"��, 9�� 10�� ���Ķ�� "����"��, ���� 3�� ���Ķ�� "�Ἦ"�� ����Ѵ�.
//		���������� ���� �ð� �Ǵ� ���� �Էµȴٸ� "����"�� ����Ѵ�. o
//		(��, �ð��� 24�ð����� �Է¹޴´�)					o
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ð��Է�");
		System.out.print("�ð� : ");
		int hour = sc.nextInt();
		System.out.print("�� : ");
		int min = sc.nextInt();
		
		
		if((hour < 0 || hour >= 24) || (min < 0 || min >= 60))
			System.err.println("���� �߻�");
		
		else if(hour >= 15)
			System.out.println("�Ἦ");
		
		else if((hour < 9 && min > 0) || (hour == 9 && min < 10)) {
			System.out.println("����");
		}
		else if((hour >= 9 && min >= 10) || (hour > 9 && min >= 0))
			System.out.println("����");
		
		
	}
}
