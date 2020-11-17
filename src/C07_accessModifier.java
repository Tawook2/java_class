import myobj.C07_diffPackage;

public class C07_accessModifier extends C07_diffPackage {
	
	// ��� - �θ� - ���� �ν��Ͻ� ����  - �ν��Ͻ� ����Ÿ�� �θ� ã�ư��� ���� ã�´�
	
	// # ���������� (Access Modifier)
	//	- �ٸ� Ŭ������ �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
	//	  �ش� ��ü���� �Ÿ��� ���� ��� ���θ� �����Ѵ�
	
	// # ������ �� �ִ� �Ÿ��� ����
	//	- ���� Ŭ���� ������ �ٸ� �ڿ�(���� ����� �Ÿ�)
	//	- ���� ��Ű�� ������ �ٸ� �ڿ�
	//	- �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	//	- �ٸ� ��Ű���� �ڿ� (���� �հŸ�)
	
	// # ���� �������� ����]
	//	- private		: ���� Ŭ���� ���ο����� ����� �� �ִ� �ڿ��� �ȴ�
	//	- �ƹ��͵� �Ⱦ� 	: default. ���� ��Ű�� ���ο����� ����� �� �ִ� �ڿ��� �ȴ�
	//	- protected 	: �ٸ� ��Ű�������� ����� ������ �� �� �ִ� �ڿ��� �ȴ�
	//					  (���� ��Ű�������� �����Ӱ� ����� �����ϴ�)
	//	- public 		: ���� �� �Ÿ������� �����Ӱ� �� �� �ִ� �ڿ��� �ȴ�
	//					  (���� ��Ű�������� �����Ӱ� ����� �����ϴ�)
	
	// # ��ü ���⿡���� ĸ��ȭ (Encapsulation)
	//	- ���� �����ڸ� Ȱ���� �ٸ� Ŭ�������Դ� ������ �ʿ���� �ڿ�(����/�޼���)��
	//	  �����ϴ� ���� ���Ѵ�
	
	
	public static void main(String[] args) {
		
		// # ���� ��Ű�� ������ �ڿ��� private�� �����ϰ� ��� ����� �� �ִ�
		
		System.out.println(C07_samePackage.package_sInt);
		System.out.println(C07_samePackage.protected_sInt);
		System.out.println(C07_samePackage.public_sInt);
		
		C07_samePackage same_package_instance = new C07_samePackage();
		
		System.out.println(same_package_instance.package_int);
		System.out.println(same_package_instance.protected_int);
		System.out.println(same_package_instance.public_int);
		
		// # �ٸ� ��Ű���� �ڿ��� ����� ������ protected���� ���δ� (visible)
		System.out.println(C07_diffPackage.protected_sInt);
		System.out.println(C07_diffPackage.public_sInt);
		
		C07_diffPackage diff_package_instance = new C07_diffPackage();
		
		System.out.println(diff_package_instance.public_int);
		
		System.out.println(new C07_accessModifier().protected_int);
		
		// # ��ӹ��� ��ü�� �ν��Ͻ��� protected �ڿ��� ������ �� �ִ�
		C07_accessModifier child = new C07_accessModifier();
		
		System.out.println(child.protected_int);
		System.out.println(child.public_int);
		
		
	}
}



















