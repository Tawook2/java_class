package myobj.machine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Main���� �������̽��� Ȱ���� �ڵ带 �ۼ��Ѵٸ�
		// ����ϴ� Ŭ������ �ٸ� Ŭ������ �����ϰ� ��ü�� �� �ִ�
		
		ElectricSource test_Battery = new ElectricSource() {

			@Override
			public void consume(int power) {
				System.out.printf("���͸����� %d��ŭ�� ������ �Һ��߽��ϴ�.\n", power);
				
			}
		
		};
		
		Scanner str_sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("<<����Ϸ��� ���ڱ�� ����>>\n");
			
			String selected = str_sc.nextLine();
			
			Electronics e = null;
			if(selected.toLowerCase().equals("cleaner")) {
				e = new Cleaner();
			}else {
				e = new MicroWave2("�Ｚ ���ڷ���", 70);
			}
			e.setConnect(test_Battery);
			e.execute();
			//System.out.println(e.execute());
		}
		
		
		
	}
}
