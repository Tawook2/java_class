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

	// 1. 사용자가 자신의 여러가지 정보를 입력하면
	// 	  그 정보를 사용자의 이름으로 된 파일에 저장해보세요							o
	
	// 2. 사용자의 이름이 전달받으면 해당 사용자가
	//	  가입된 회원이라면 파일에서 정보를 읽어 출력해주고
	//	  아직 가입되지 않은 사람이라면 가입되지 않았다고 출력하는 메서드르 작성해보세요		o
	
	// 3. 지정된 사용자의 정보를 수정할 수 있는 메서드를 구현해보세요					△
	
	// ※ D:\\java_io\\member\\ 디렉토리에 저장할 것								o
		
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		E03_JoinMember JB = new E03_JoinMember();
	
		JB.readFunc(JB);		
	}
	
	public void writeFunc() {
		System.out.println("이름 입력 :");
		String name = sc.nextLine();
		System.out.println("나이 입력 :");
		int age = sc.nextInt();
		
		try {
			FileWriter fw = new FileWriter("D:\\java_io\\member\\"+name+".txt",Charset.forName("UTF-8"));
			
			BufferedWriter bw = new BufferedWriter(fw, 4096);
			
			PrintWriter pw = new PrintWriter(bw);
			
			pw.print(name + " : " + age);
			
			pw.close();
			bw.close();
			fw.close();
			
			System.out.println("출력 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readFunc(E03_JoinMember JB) {
		System.out.println("사용자 이름 입력 >");
		String check_list = sc.nextLine();
		
		try {
			FileReader fr = new FileReader("D:\\java_io\\member\\"+check_list+".txt",Charset.forName("UTF-8"));
			
			BufferedReader br = new BufferedReader(fr, 2048);
			
			int ch;
			while((ch = br.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println();
			
			System.out.println("읽기가 모두 끝났습니다 -");
			
			JB.update(JB);
			
			br.close();
			fr.close();
			
		} catch(FileNotFoundException e) {
			System.err.println("가입되지않은 회원입니다");
			JB.writeFunc();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(E03_JoinMember JB) {
		String check = "no";
		System.out.println("수정하시겠습니까?");
		String answer = sc.nextLine().toLowerCase();
		if(check.equals(answer)) {
			return;
		}
		else {
			JB.writeFunc();
		}
	}
}
