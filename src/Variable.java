/*
 ������ ���� �� �� �ϳ��� �������� �ϳ��� �ڷ����� �����ϴ�.
 �������� ���� �����ϴ�.

 int = ������ ��Ÿ��;
 string = ���ڸ� ��Ÿ��;
 
������ �޸� (RAM)�� ���� ����ϱ� ���� ����
������ ���� : �޸� ������ �����͸� ������ �� �ִ� ������ �Ҵ��ϴ� ��

���� ���� ���: 1. �ڷ��� ������;
 			2. �ڷ��� ������ = ��;
*/
public class Variable {
	public static void main(String[] args) {
		int age = 28;
		System.out.println("���� : " + age);
		int month = 8;
		int day = 28;
		int year = 2023;
		
		System.out.println("������ " + year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		
		String month2 = "��";
		String day2 = "��";
		String year2 = "��";
		
		System.out.println("������ " + year + year2 + " " + month + month2 + " " + day + day2 + " �Դϴ�" );
		
		String name = "������";
		int month3 = 8;
		int day3 = 23;
		System.out.println(name + " " + month3 + day3);
		
		/*
		 �ڷ��� ������;
		 �ڷ��� ������ = ������;
		*/
		int number1;
	 	number1 = 100;
	 	System.out.println("number1 :" + number1);
	 	number1 = 200; // �������� ���� �����ϴ�.
		System.out.println("number1(����) :" + number1);
		
		int number2 = 300;
		System.out.println("number2: " + number2);
		number2 = 500;
		
		String name1 = "JAVA";
		System.out.println("name1 = " + name1);
		name1 = "Hi JAVA";
		System.out.println("name1(����) = " + name1);
		
	}

}


/*
1. ��Ŭ��
2. run on server
*/