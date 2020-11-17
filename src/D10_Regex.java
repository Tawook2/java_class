import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D10_Regex {

	
	// # ���� ǥ���� (Regular Expression)
	//	- ���ڿ��� ������ ǥ���ϴ� ǥ����
	//	- �ش� ���ϰ� ��ġ�ϴ� ���ڿ��� �˻��� �� �ִ�
	
	// # Pattern Ŭ����
	//	- ����ǥ������ �ٷ�� Ŭ����
	
	// # Matcher Ŭ����
	//	- ������ �̿��Ͽ� ��� ���ڿ��� �˻��� �� ����ϴ� Ŭ����
	
	public static void main(String[] args) {

		
		// ��ȯ�� true of false
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����Ѵ�
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		
		//[] ���ο� ������ �� �ִ� �͵�
		// 1. abc: abc�� ���
		// 2. ^abc : abc�� ������ ��θ� ���
		// 3. a-z : a���� z���� ���
		// 4. && : ������ 
		System.out.println(Pattern.matches("s[^1-9]eep", "s#eep"));
		System.out.println(Pattern.matches("s[a-zA-Z]eep", "sHeep"));
		System.out.println(Pattern.matches("s[aeiou]eep", "sHeep"));
		System.out.println(Pattern.matches("s[a-dm-z]eep", "sleep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sdeep"));
		
		// # ���� ���ڸ� �����ϰ� ǥ���ϴ� �͵�
		// 1. .  : �ش� �ڸ��� ��� ���ڸ� ��� - �� []�ۿ� ��� ��
		// 2. \d : �ش� �ڸ��� ���ڵ��� ���
		// 3. \D : �ش� �ڸ��� ���ڸ� ������ ������ ���
		// 4. \s : �ش� �ڸ��� ������ ��� [\t\n\r.. ���� ��� �����]
		// 5. \S : �ش� �ڸ��� ������ ������ ������ ���
		// 6. \w : �Ϲ����� ���ڵ��� ���[a-zA-Z_0-9]
		// 7. \W : �Ϲ����� ���ڵ��� ������ ������ ���
		System.out.println(Pattern.matches("s.eep", "sbeep"));
		System.out.println(Pattern.matches("s\\deep", "s1eep"));
		System.out.println(Pattern.matches("s\\Deep", "s��eep"));
		System.out.println(Pattern.matches("s\\seep", "s\reep"));
		System.out.println(Pattern.matches("s\\Seep", "s\neep"));
		System.out.println(Pattern.matches("..[\\d]..","ab.de"));
		
		// # �ش� ������ ����� ������ ������ �����ϴ� ��� - �� ������ �������
		// 1. Ex{n} : �տ� �ִ� ������ n���� ��ġ�ؾ� �Ѵ�
		// 2. Ex{n,m} : �տ� �ִ� ������ �ּ� n���� �̻� �ִ� m���� ��ġ�ؾ� �Ѵ�
		// 3. Ex{n,} : �տ� �ִ� ������ �ּ� n���� �̻� ��ġ�ؾ� ��
		// 4. Ex? : �ѹ� Ȥ�� ����� �Ѵ�
		// 5. Ex+ : �ּ� �ѹ� �̻�
		// 6. Ex* : 0�� Ȥ�� ������
		System.out.println(Pattern.matches("....[\\d]{4}","abfd1234"));
		System.out.println("��ȿ�� ���̵� : " 
				+ Pattern.matches("[\\w��-��]{2,12}","IlIllIlII"));
		
		// ?
		System.out.println(Pattern.matches("[@]?.+", "@abc"));
		
		
		String email = "abc@guniv.ac.kr";
		System.out.println("�̸��� ���� : " 
				+ Pattern.matches("[\\w]+@[a-zA-Z0-9]+[.][a-zA-Z.]+", email) );
		
		// # Pattern.matches(regex, str)
		//	- ������ ���ڿ��� ����ǥ���İ� ��ġ�ϸ� true
		
		// # Pattern.complile(regex)
		//	- ������ ����ǥ������ �̿��� ������ �ν��Ͻ��� ��ȯ�Ѵ�
		Pattern split_regex = Pattern.compile("/");
		
		String[] fruits = split_regex.split("apple/banana/orange/kiwi");
		System.out.println(Arrays.toString(fruits));
		
		// # ������ Pattern �ν��Ͻ��� matcher�����ϱ�
		
		// # java.util.regex.Matcher
		//	- ���ڿ��� ó������ ������ �˻��ϸ鼭
		//	  �ش� ����ǥ���İ� ��ġ�ϴ� �ε����� ã�� ���
		//Matcher matcher = split_regex.matcher("apple/banana/orange/kiwi");
		
		Pattern fruit_regex = Pattern.compile("[a-zA-Z[^/]]+");
		
		Matcher matcher = fruit_regex.matcher("apple/banana/orange/kiwi");
		
		// find : ����ǥ������ ���� ã�� ���� ������ true
		while(matcher.find()) {
			System.out.println("ã����" +  matcher.group());
			System.out.println(matcher.start() +  "to" + matcher.end());

		}
		
		
//		String str = "abc@naver.com";
//		
//		//CharSequence �� �䱸�ϴ°����� String �� ������ �ȴ�
//		
//		if(str.contains("@") && str.contains(".")) {
//			System.out.println("�̸����Դϴ�.");
//		}else {
//			System.out.println("�̸����� �ƴմϴ�. ������ �����ּ���");
//		}
		
		
		
	}
}


















































