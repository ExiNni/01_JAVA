/*
 변수를 선언 할 때 하나의 변수명의 하나의 자료형만 가능하다.
 변수명은 재사용 가능하다.

 int = 정수를 나타냄;
 string = 문자를 나타냄;
 
변수란 메모리 (RAM)에 값을 기록하기 위한 공간
변수의 선언 : 메모리 공간에 데이터를 저장할 수 있는 공간을 할당하는 것

변수 선언 방법: 1. 자료형 변수명;
 			2. 자료형 변수명 = 값;
*/
public class Variable {
	public static void main(String[] args) {
		int age = 28;
		System.out.println("나이 : " + age);
		int month = 8;
		int day = 28;
		int year = 2023;
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");
		
		String month2 = "월";
		String day2 = "일";
		String year2 = "년";
		
		System.out.println("오늘은 " + year + year2 + " " + month + month2 + " " + day + day2 + " 입니다" );
		
		String name = "송의재";
		int month3 = 8;
		int day3 = 23;
		System.out.println(name + " " + month3 + day3);
		
		/*
		 자료형 변수명;
		 자료형 변수명 = 변수값;
		*/
		int number1;
	 	number1 = 100;
	 	System.out.println("number1 :" + number1);
	 	number1 = 200; // 변수명은 재사용 가능하다.
		System.out.println("number1(재사용) :" + number1);
		
		int number2 = 300;
		System.out.println("number2: " + number2);
		number2 = 500;
		
		String name1 = "JAVA";
		System.out.println("name1 = " + name1);
		name1 = "Hi JAVA";
		System.out.println("name1(재사용) = " + name1);
		
		
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a * b);
		
		// 변수명 안에 숫자를 넣고 더하기 빼기 곱하기 나누기 넣기
		int number5 = 8;
		int number6 = 9;
		
		System.out.println("number5 + number6 = " + (number5 + number6));
		System.out.println("number5 * number6 = " + (number5 * number6));
		System.out.println("number5 - number6 = " + (number5 - number6));
		System.out.println("number6 / number5 = " + (number6 / number5));
		System.out.println("number6 % number5 = " + (number6 % number5));
		}

}


/*
1. 우클릭
2. run on server
*/

/*
 cd eclipse-workspace
 cd 00_testProject
 git status
 git add .
 git status
 git commit -m "Variable int, String"
 git push
*/