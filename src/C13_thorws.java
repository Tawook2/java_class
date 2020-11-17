
public class C13_thorws {

	// myobj.fruit.Apple 과 이어져있음
	
	// # throws
	//	- 현재 메서드에서 발생하는 예외의 처리를 메서드를 호출한 곳으로 미룬다
	//	- 메서드 뒤에 발생할 위험이 있는 예외를 함께 정의한다
	//	- 해당 메서드를 호출하는 곳에 경고를 해줄 수 있다
	
	// # throw
	//	- 원하는 예외를 발생시킨다
	
	// # Exception 클래스를 상속받으면
	//	 "반드시 처리해야 하는 예외 객체"가 된다
	
	// # RuntimeException을 상속받는 객체는
	//	 반드시 처리하지 않아도 되는 예외 객체가 된다
	
	public static void stupid_method1() throws ArrayIndexOutOfBoundsException  {
		throw new ArrayIndexOutOfBoundsException("그냥 발생");
		
//		int[] a = new int[10];
//		System.out.println(a[999]);
	}
	
	public static void main(String[] args) {
		int a = 1;
		
		if(a == 1) {
			throw new ArithmeticException("그냥 발생함 1");
		}else if(a == 2) {
			throw new java.util.EmptyStackException();
		}
		
		stupid_method1();
		
	}
	
}
