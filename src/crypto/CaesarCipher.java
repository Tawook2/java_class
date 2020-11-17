package crypto;

import java.util.Scanner;



public class CaesarCipher extends Cipher{
	
	// # ��ȣ��?
	//	- ��� �޼����� �ְ�ޱ� ���� ��
	//	- ��ȣȭ(Encryption)
	//		��(�Ϲ� �޼���)�� ��ȣ��(��� �޼���)�� �ٲٴ� ��
	//	- ��ȣȭ(Decryption)
	//		��ȣ���� ������ �ǵ����� ��
	//	- Ű(Key)
	//		��ȣȭ�� ��ȣȭ�� ���Ǵ� ��� ��
	
	// # ����(ī�̻縣) ��ȣ
	//	- ���ĺ��� Ű(Key)�� ��ŭ ���������� �̵���Ű�� ��ȣ ���		o
	//	- ��ȣȭ : ���� Ű �� ��ŭ ���������� �̵���Ų��
	//	- ��ȣȭ : ��ȣ���� Ű �� ��ŭ �������� �̵���Ų��
	
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ !@#$ abcdefghijklmnopqrstuvwxyz...
	// * Key���� 3�� ��� ��ȣȭ (+3)
	// "Hello, World!"		=>		"Khoorc#Zruog$";	o
	// * Key���� 3�� ��� ��ȣȭ (-3)	
	// "Khoorc#Zruog$"		=>		"Hello, World!";	o
	
	// (1) char[] charset = "";
	// (2) this.key =  key % charset.length;
	// (3)
	
	
	public static void main(String[] args) {
		
		System.out.println("Ű �� �Է� > ");
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		CaesarCipher CC = new CaesarCipher(key);
		
		sc.nextLine();
		
		System.out.println("�� �Է� > ");
		
		String words = sc.nextLine();
		
		String plain  = CC.encryption(words);
		System.out.printf("�� '%s' �� ��ȣȭ�� ��ȣ�� '%s'\n",words, plain);
		
		String crypto = CC.decryption(plain);
		System.out.printf("��ȣ�� '%s' �� ��ȣȭ�� �� '%s'\n",plain, crypto);
		
	}
	
	int key;
	
	public CaesarCipher(int key) {
		this.key = key;
	}
	
	public String encryption(String plain_text) {
		char ch;
		StringBuilder str = new StringBuilder("");
		// �Ű������� ���� ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ�����
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
		// �Ű������� ���� ��ȣ���� ��ȣȭ �Ͽ� �����ϴ� �Լ��� �����غ�����
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

































































