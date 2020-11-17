package crypto;

import java.util.Scanner;



public class CaesarCipher extends Cipher{
	
	// # 암호란?
	//	- 비밀 메세지를 주고받기 위한 것
	//	- 암호화(Encryption)
	//		평문(일반 메세지)를 암호문(비밀 메세지)로 바꾸는 것
	//	- 복호화(Decryption)
	//		암호문을 평문으로 되돌리는 것
	//	- 키(Key)
	//		암호화와 복호화에 사용되는 비밀 값
	
	// # 시저(카이사르) 암호
	//	- 알파벳을 키(Key)값 만큼 오른쪽으로 이동시키는 암호 방식		o
	//	- 암호화 : 평문을 키 값 만큼 오른쪽으로 이동시킨다
	//	- 복호화 : 암호문을 키 값 만큼 왼쪽으로 이동시킨다
	
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$ abcdefghijklmnopqrstuvwxyz...
	// * Key값이 3인 경우 암호화 (+3)
	// "Hello, World!"		=>		"Khoorc#Zruog$";	o
	// * Key값이 3인 경우 복호화 (-3)	
	// "Khoorc#Zruog$"		=>		"Hello, World!";	o
	
	// (1) char[] charset = "";
	// (2) this.key =  key % charset.length;
	// (3)
	
	
	public static void main(String[] args) {
		
		System.out.println("키 값 입력 > ");
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		CaesarCipher CC = new CaesarCipher(key);
		
		sc.nextLine();
		
		System.out.println("평문 입력 > ");
		
		String words = sc.nextLine();
		
		String plain  = CC.encryption(words);
		System.out.printf("평문 '%s' 의 암호화된 암호문 '%s'\n",words, plain);
		
		String crypto = CC.decryption(plain);
		System.out.printf("암호문 '%s' 의 복호화된 평문 '%s'\n",plain, crypto);
		
	}
	
	int key;
	
	public CaesarCipher(int key) {
		this.key = key;
	}
	
	public String encryption(String plain_text) {
		char ch;
		StringBuilder str = new StringBuilder("");
		// 매개변수로 받은 평문을 암호화 하여 리턴하는 함수를 구현해보세요
		for(int i = 0; i < plain_text.length(); i++) {
			
			ch = plain_text.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
				ch =  (char)(ch + this.key) > 'z' ? (char)(ch + this.key - 26) : (char)(ch + this.key);
			else if(ch >= 'A' && ch <= 'Z')
				ch =  (char)(ch + this.key) > 'Z' ? (char)(ch + this.key - 26) : (char)(ch + this.key);
			else if(ch >= '!' && ch <= '/')
				ch =  (char)(ch + this.key) > '/' ? (char)(ch + this.key - 15) :(char)(ch + this.key);
		
			str.append((char)(ch));
			
		}
		
		return str.toString();
	}
	
	public String decryption(String crypto_text) {
		// 매개변수로 받은 암호문을 복호화 하여 리턴하는 함수를 구현해보세요
		char ch;
		StringBuilder str2 = new StringBuilder("");
		for(int i = 0; i < crypto_text.length(); i++) {
			
			ch = crypto_text.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
				ch =  (char)(ch - this.key) < 'a' ? (char)(ch - this.key + 26) : (char)(ch - this.key);
			else if(ch >= 'A' && ch <= 'Z')
				ch =  (char)(ch - this.key) < 'A' ? (char)(ch - this.key + 26) : (char)(ch - this.key);
			else if(ch >= '!' && ch <= '/')
				ch =  (char)(ch - this.key)  < '!' ? (char)(ch - this.key + 15) :(char)(ch - this.key);
			
			str2.append((char)(ch));
		}
		return str2.toString();
	}
}

































































