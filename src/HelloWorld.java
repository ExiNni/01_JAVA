
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println("반갑습니다");
		System.out.println("ㅎㅎ");
		
		System.out.print("줄바꿈 없는 프린트!");
		System.out.print("진짜로 줄을 안바꿉니다.");
		
		System.out.println();
		System.out.print("안녕하세요");
		System.out.print("     ");
		System.out.print("반갑습니다");
		
		System.out.println("점심은 뭐 드셨나요?");
	}

}
/*
 접근 제한자 (public, protected, private, default)
 public: 모든 곳에서 접근 가능
 protected: 같은 패키지 안에서 가능 + 상속 클래스에서만 접근 가능
 default: 클래스 내에서만 접근 가능
 private: 같은 패키지 안에서 가능
 
 public을 쓰는 이유: main 은 프로그램에서 기본이기 때문에 public 을 사용
 모든 클래스에서 접근 가능한 메소드임을 선언하고 시작하는 것.
 
 매소드란(method) 어떤 특정 작업을 수행하기 위한 명령문의 집합
 
 static 과 heap: 변수와 메소드를 메모리에 할당할 떄 저장되는 영역
 	static: 프로그램이 실행 될 때 저장 - garbage collector (GC) 가 정리하지 못함
 	heap: 메소드에서 실행 될 때 저장 됨 - garbage collector(GC) 가 정리 가능
 	
 	main 에서 static을 사용하는 이유는 프로그램의 기본이 되어야하는 함수가 정리되면 안되기 때문에
 	static 영역에 메모리 할당을 시켜주는 것. 
 	
 	void: 반환이 없다는 의미 (return이 없음) main 이 죽으면 다음 단계가 없이 프로그램 전체가 종료됨
 	return 을 가질 수 없음.
 	
 	main: 자바가 시작하는 문법 규칙 class의 메인을 나타냄
 	
 	String[] args : String 문자열, [] 배열을 뜻하고, args 라는 이름의 문자열 배열을 사용한다.
 	메인 함수에서 String[] args 를 생략할 수 없는 이유는 프로그램이 시작되는 부분이기 때문에 외부에서 값을 받을 수 있어야 한다.
 	
 	System.out.print(""); - 괄호 안 내용을 단순히 출력
 	System.out.println(""); - 괄호 안 내용을 출력 후 줄바꿈
 	 	
 	*/
