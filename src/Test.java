public class Test {

	public static void main(String[] args) {
		int a = 3;
		char ch = '1';
		boolean complete = false;
		String str = "yes";
		String command = "abcdefgh";
		String command2 = "12queen";
		// 1.
		System.out.println(a % 2 == 1);
		
		// 2.
		System.out.println(!(ch >= 'a' && ch <= 'z') &&
				!(ch >= 'A' && ch <= 'Z'));
		//3.
		System.out.println(!complete);
		
		//4.
		System.out.println(str.equals("yes"));
		
		//5.
		System.out.println(command.length() == 8);
		
		//6.
		System.out.println(command2.charAt(2) == 'q' ||
				command2.charAt(2) == 'Q');
	}
}
