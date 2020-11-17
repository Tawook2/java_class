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

	// 컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	// 프로그램 종료시 자동으로 플레이어의 전적을 파일에 저장해보세요
	
	// 프로그램 실행시 전적을 불러오도록 만들어보세요
	
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
		
//		// 디렉토리 생성 메서드
//		File dir = new File("D:\\java_io\\game");
//		
//		// 디렉토리가 존재하지 않을때만 새로 생성하기
//		if(!dir.exists()) {
//			dir.mkdir();
//		}
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int round = 0;
		int victory = 0;
		int lose = 0;
		int draw = 0;
		
		String[] computer = new String[] {"가위", "바위", "보"};
		
		System.out.println("플레이어 이름 입력 >");
		String name = sc.nextLine();
		checkUser(name);
		
		
		
		
		
		while(true) {
			File dir = new File("D:\\java_io\\game");
			
			// 디렉토리가 존재하지 않을때만 새로 생성하기
			if(!dir.exists()) {
				dir.mkdir();
			}
			
			
			round++;
			System.out.println("가위! 바위! 보!");
			System.out.println("=============");
			String h_choice = sc.nextLine();
			
			String c_choice = computer[ran.nextInt(3)];

			switch(h_choice) {
			
			case "가위":
				if(c_choice.equals("가위")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("무승부");
					System.out.println("=============");
					draw++;
				}
				else if(c_choice.equals("바위")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.err.println("패배");
					System.out.println("=============");
					lose++;
				}
				else if(c_choice.equals("보")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("승리");
					System.out.println("=============");
					victory++;
				}
				System.out.printf("결과 : %d 승 - %d 패 - %d 무\n", victory, lose, draw);
				System.out.println("-------------------");
				break;
				
			case "바위":
				
				if(c_choice.equals("바위")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("무승부");
					System.out.println("=============");
					draw++;
				}
				else if(c_choice.equals("보")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.err.println("패배");
					System.out.println("=============");
					lose++;
				}
				else if(c_choice.equals("가위")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("승리");
					System.out.println("=============");
					victory++;
				}
				System.out.printf("결과 : %d 승 - %d 패 - %d 무\n", victory, lose, draw);
				break;
				
			case "보" :
				
				if(c_choice.equals("보")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("무승부");
					System.out.println("=============");
					draw++;
				}
				else if(c_choice.equals("가위")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.err.println("패배");
					System.out.println("=============");
					lose++;
				}
				else if(c_choice.equals("바위")) {
					System.out.println("vs");
					System.out.println(c_choice);
					System.out.println("승리");
					System.out.println("=============");
					victory++;
				}
				System.out.printf("결과 : %d 승 - %d 패 - %d 무\n", victory, lose, draw);
				break;
			default:
				System.out.println("'가위' '바위' '보' 만 입력해주세요");
				break;
			}
			if(round == 10) {
				System.out.printf("유저 : %s - 결과: %d 라운드 - %d승 - %d패 -%d무\n",name,round,victory,lose,draw);
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
			System.out.printf("<< '%s'님의 정보>>\n", data[0]);
			System.out.println("이름 	: " 	+ data[0]);
			System.out.println("라운드 	: " 	+ data[1]);
			System.out.println("승	: " 	+ data[2]);
			System.out.println("패 	: " 	+ data[3]);
			System.out.println("무 	: " 	+ data[4]);
			
			return false;
		} catch (FileNotFoundException e) {
			System.out.println("[System] - 새로운 게임을 진행합니다");
			return true;

		} finally {
			if(br != null) br.close();
		}

	}
	
	public static void modify(User user) throws IOException {
		
		// to_update에 이름과 혈액형만 오면 나머지는 유지되고 혈액형만 수정되도록 만들기
		String dir = "D:\\java_io\\game\\";
		String filename = user.name + ".txt";
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 기존 데이터를 읽어들인다
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
			
			// 기본데이터를 새로운 데이터로 덮어쓴다
			User after = before.update(user);
			
			// 완성된 데이터를 파일에 덮어쓴다
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
