package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class E03_JoinMember {

	// 1. ����ڰ� �ڽ��� �������� ������ �Է��ϸ�
	// 	  �� ������ ������� �̸����� �� ���Ͽ� �����غ�����							o
	
	// 2. ������� �̸��� ���޹����� �ش� ����ڰ�
	//	  ���Ե� ȸ���̶�� ���Ͽ��� ������ �о� ������ְ�
	//	  ���� ���Ե��� ���� ����̶�� ���Ե��� �ʾҴٰ� ����ϴ� �޼��帣 �ۼ��غ�����		o
	
	// 3. ������ ������� ������ ������ �� �ִ� �޼��带 �����غ�����					��
	
	// �� D:\\java_io\\member\\ ���丮�� ������ ��								o
		
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		E03_JoinMember JB = new E03_JoinMember();
	
		JB.readFunc(JB);		
	}
	
	public void writeFunc() {
		System.out.println("�̸� �Է� :");
		String name = sc.nextLine();
		System.out.println("���� �Է� :");
		int age = sc.nextInt();
		
		try {
			FileWriter fw = new FileWriter("D:\\java_io\\member\\"+name+".txt",Charset.forName("UTF-8"));
			
			BufferedWriter bw = new BufferedWriter(fw, 4096);
			
			PrintWriter pw = new PrintWriter(bw);
			
			pw.print(name + " : " + age);
			
			pw.close();
			bw.close();
			fw.close();
			
			System.out.println("��� �Ϸ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFunc(E03_JoinMember JB) {
		System.out.println("����� �̸� �Է� >");
		String check_list = sc.nextLine();
		
		try {
			FileReader fr = new FileReader("D:\\java_io\\member\\"+check_list+".txt",Charset.forName("UTF-8"));
			
			BufferedReader br = new BufferedReader(fr, 2048);
			
			int ch;
			while((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
			
			System.out.println("�бⰡ ��� �������ϴ� -");
			
			JB.update(JB);
			
			br.close();
			fr.close();
			
		} catch(FileNotFoundException e) {
			System.err.println("���Ե������� ȸ���Դϴ�");
			JB.writeFunc();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(E03_JoinMember JB) {
		String check = "no";
		System.out.println("�����Ͻðڽ��ϱ�?");
		String answer = sc.nextLine().toLowerCase();
		if(check.equals(answer)) {
			return;
		}
		else {
			JB.writeFunc();
		}
	}
}
