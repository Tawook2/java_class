package crypto;



public class CaesarHacker {

	

	// ��ȣ���� charset�� �˰����� ������ȣ ������� �˰��ִٰ� ������ ���·�
	// ��ȣ���� �̿��Ͽ� ���� �����غ�����
	
	//static char[] charset = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	//		+ "!@#$,abcdefghijklmnopqrstuvwxyz").toCharArray();
	
	// �� ��ȣ�� �������� ���� �� ���� 3������ ��� �����ڰ� �˰��ִٰ� �����Ѵ�
	
	static String hijacked = "Mjqqt Btwqi&";
	
	public static void main(String[] args) {
		for(int key = 0; key < hijacked.length(); key++) {
			CaesarCipher cipher = new CaesarCipher(key);
			System.out.println(cipher.decryption(hijacked));
		}
	}
	

}
