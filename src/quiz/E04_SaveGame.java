package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

import quiz.E03_joinMemberA.Member;

public class E04_SaveGame {

	// ��ǻ�Ϳ� �����ϴ� ������ ���������� ������ ���� ��
	// ���α׷� ����� �ڵ����� �÷��̾��� ������ ���Ͽ� �����غ�����
	
	// ���α׷� ����� ������ �ҷ������� ��������
	
	static class User{
		String name;
		int round = 0;
		int victory = 0;
		int lose = 0;
		int draw = 0;
		
		public User() {}
		
		public User(String name, int round, int victory, int lose, int draw) {
			this.name = name;
			this.round = round;
			this.victory = victory;
			this.lose = lose;
			this.draw = draw;
		}
		
		public User update(User to_update) {
			
			return new User(
				to_update.name == null ? this.name : to_update.name,
				to_update.round == -1? this.round : to_update.round,
				to_update.victory == -1? this.victory : to_update.victory,
				to_update.lose == -1? this.lose : to_update.lose,
				to_update.draw == -1? this.draw : to_update.draw
				
				
			);
		}
		
		@Override
		public String toString() {
			
			return String.format("%s/%d/%d/%d/%d\n",name, round, victory, lose, draw);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
//		// ���丮 ���� �޼���
//		File dir = new File("D:\\java_io\\game");
//		
//		// ���丮�� �������� �������� ���� �����ϱ�
//		if(!dir.exists()) {
//			dir.mkdir();
//		}
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int round = 0;
		int victory = 0;
		int lose = 0;
		int draw = 0;
		
		String[] computer = new String[] {"����", "����", "��"};
		
		System.out.println("�÷��̾� �̸� �Է� >");
		String name = sc.nextLine();
		checkUser(name);
		
		
		
		
		
		while(true) {
			File dir = new File("D:\\java_io\\game");
			
			// ���丮�� �������� �������� ���� �����ϱ�
			if(!dir.exists()) {
				dir.mkdir();
			}
			
			
			round++;
			System.out.println("����! ����! ��!");
			System.out.println("=============");
			String h_choice = sc.nextLine();
			
			String c_choice = computer[ran.nextInt(3)];

			switch(h_choice) {
			
			case "����":
				if(c_choice.equals("����")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("���º�");
					System.out.println("=============");
					draw++;
				}
				else if(c_choice.equals("����")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.err.println("�й�");
					System.out.println("=============");
					lose++;
				}
				else if(c_choice.equals("��")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("�¸�");
					System.out.println("=============");
					victory++;
				}
				System.out.printf("��� : %d �� - %d �� - %d ��\n", victory, lose, draw);
				System.out.println("-------------------");
				break;
				
			case "����":
				
				if(c_choice.equals("����")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("���º�");
					System.out.println("=============");
					draw++;
				}
				else if(c_choice.equals("��")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.err.println("�й�");
					System.out.println("=============");
					lose++;
				}
				else if(c_choice.equals("����")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("�¸�");
					System.out.println("=============");
					victory++;
				}
				System.out.printf("��� : %d �� - %d �� - %d ��\n", victory, lose, draw);
				break;
				
			case "��" :
				
				if(c_choice.equals("��")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("���º�");
					System.out.println("=============");
					draw++;
				}
				else if(c_choice.equals("����")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.err.println("�й�");
					System.out.println("=============");
					lose++;
				}
				else if(c_choice.equals("����")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("�¸�");
					System.out.println("=============");
					victory++;
				}
				System.out.printf("��� : %d �� - %d �� - %d ��\n", victory, lose, draw);
				break;
			default:
				System.out.println("'����' '����' '��' �� �Է����ּ���");
				break;
			}
			if(round == 10) {
				System.out.printf("���� : %s - ���: %d ���� - %d�� - %d�� -%d��\n",name,round,victory,lose,draw);
				save(new User(name, round, victory, lose, draw));
				
				break;
			}	
		}
	}
	public static void save(User user) throws IOException {
		
		String dir = "D:\\java_io\\game\\";
		String filename = user.name + ".txt";
		
	
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter(
								dir + filename,
								Charset.forName("UTF-8")
								)
						)
				); 
		
		pw.print(user);
		
		pw.close();
	}
	
	public static boolean checkUser(String name) throws IOException {
		String dir = "D:\\java_io\\game\\";
		String filename = name + ".txt";
		
		BufferedReader br = null;
		try {
			br =new BufferedReader(
					new FileReader(
							dir + filename,
							Charset.forName("UTF-8")
							)
					);
			
			String[] data = br.readLine().split("/");
			System.out.printf("<< '%s'���� ����>>\n", data[0]);
			System.out.println("�̸� 	: " 	+ data[0]);
			System.out.println("���� 	: " 	+ data[1]);
			System.out.println("��	: " 	+ data[2]);
			System.out.println("�� 	: " 	+ data[3]);
			System.out.println("�� 	: " 	+ data[4]);
			
			return false;
		} catch (FileNotFoundException e) {
			System.out.println("[System] - ���ο� ������ �����մϴ�");
			return true;

		} finally {
			if(br != null) br.close();
		}

	}
	
	public static void modify(User user) throws IOException {
		
		// to_update�� �̸��� �������� ���� �������� �����ǰ� �������� �����ǵ��� �����
		String dir = "D:\\java_io\\game\\";
		String filename = user.name + ".txt";
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// ���� �����͸� �о���δ�
		try {
			br = new BufferedReader(new FileReader(
					dir + filename,Charset.forName("UTF-8")));
			String[] data = br.readLine().split("/");
			
			User before = new User(
					data[0],
					Integer.parseInt(data[1]),
					Integer.parseInt(data[2]),
					Integer.parseInt(data[3]),
					Integer.parseInt(data[4])
			);
			
			// �⺻�����͸� ���ο� �����ͷ� �����
			User after = before.update(user);
			
			// �ϼ��� �����͸� ���Ͽ� �����
			pw = new PrintWriter(
					new BufferedWriter(
							new FileWriter(dir + filename,Charset.forName("UTF-8")
									)
							)
					);
			
		
			pw.print(after);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) br.close();
			if(pw != null) pw.close();
		}
		
	}
}
