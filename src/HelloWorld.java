
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println("�ݰ����ϴ�");
		System.out.println("����");
		
		System.out.print("�ٹٲ� ���� ����Ʈ!");
		System.out.print("��¥�� ���� �ȹٲߴϴ�.");
		
		System.out.println();
		System.out.print("�ȳ��ϼ���");
		System.out.print("     ");
		System.out.print("�ݰ����ϴ�");
		
		System.out.println("������ �� ��̳���?");
	}

}
/*
 ���� ������ (public, protected, private, default)
 public: ��� ������ ���� ����
 protected: ���� ��Ű�� �ȿ��� ���� + ��� Ŭ���������� ���� ����
 default: Ŭ���� �������� ���� ����
 private: ���� ��Ű�� �ȿ��� ����
 
 public�� ���� ����: main �� ���α׷����� �⺻�̱� ������ public �� ���
 ��� Ŭ�������� ���� ������ �޼ҵ����� �����ϰ� �����ϴ� ��.
 
 �żҵ��(method) � Ư�� �۾��� �����ϱ� ���� ��ɹ��� ����
 
 static �� heap: ������ �޼ҵ带 �޸𸮿� �Ҵ��� �� ����Ǵ� ����
 	static: ���α׷��� ���� �� �� ���� - garbage collector (GC) �� �������� ����
 	heap: �޼ҵ忡�� ���� �� �� ���� �� - garbage collector(GC) �� ���� ����
 	
 	main ���� static�� ����ϴ� ������ ���α׷��� �⺻�� �Ǿ���ϴ� �Լ��� �����Ǹ� �ȵǱ� ������
 	static ������ �޸� �Ҵ��� �����ִ� ��. 
 	
 	void: ��ȯ�� ���ٴ� �ǹ� (return�� ����) main �� ������ ���� �ܰ谡 ���� ���α׷� ��ü�� �����
 	return �� ���� �� ����.
 	
 	main: �ڹٰ� �����ϴ� ���� ��Ģ class�� ������ ��Ÿ��
 	
 	String[] args : String ���ڿ�, [] �迭�� ���ϰ�, args ��� �̸��� ���ڿ� �迭�� ����Ѵ�.
 	���� �Լ����� String[] args �� ������ �� ���� ������ ���α׷��� ���۵Ǵ� �κ��̱� ������ �ܺο��� ���� ���� �� �־�� �Ѵ�.
 	
 	System.out.print(""); - ��ȣ �� ������ �ܼ��� ���
 	System.out.println(""); - ��ȣ �� ������ ��� �� �ٹٲ�
 	 	
 	*/
