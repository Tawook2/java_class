package crypto;



public class CaesarHacker {

	

	// 암호문과 charset을 알고리즘이 시저암호 방식임을 알고있다고 가정한 상태로
	// 암호문을 이용하여 평문을 추출해보세요
	
	//static char[] charset = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	//		+ "!@#$,abcdefghijklmnopqrstuvwxyz").toCharArray();
	
	// ※ 암호의 강력함을 논할 때 위의 3가지는 모두 공격자가 알고있다고 가정한다
	
	static String hijacked = "Mjqqt Btwqi&";
	
	public static void main(String[] args) {
		for(int key = 0; key < hijacked.length(); key++) {
			CaesarCipher cipher = new CaesarCipher(key);
			System.out.println(cipher.decryption(hijacked));
		}
	}
	

}
