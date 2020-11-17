package quiz;

public class B10_Gugudan {

	public static void main(String[] args) {
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.printf("%d´Ü : ", dan);
			for(int gop =1; gop <= 9; gop++) {
				
				System.out.printf("%d x %d = %-2d ", dan, gop, dan* gop);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i <= 9; i++) {
			
	
			for(int j =2; j <=9; j++) {
				
				if(i == 0)
					System.out.printf("%d´Ü\t",j);
				else 
					System.out.printf("%dx%d =%2d ", j , i, j * i);
			}
			System.out.println();
		}
	}
}
