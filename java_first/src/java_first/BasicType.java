package java_first;

public class BasicType {

	public static void main(String[] args) {
		int number = 10; //정수형 변수
		double pi = 3.14159; //실수형 변수
		boolean isActive = true; //논리형 변수
		char initial = 'S'; // Java 문자 규칙 : ''따음표 사용
		System.out.print("gdㅎㅇ");
		System.out.println("Number " + number);
		System.out.println("Double " + pi);
		System.out.println("Boolean " + isActive);
		System.out.println("Char " + initial);
		
		//////////////////////////////////////////
		//형식지정자를 이용한 출력
		System.out.printf("%d * %d = %d",10,2,10*2);
		/*
		 * %d : 정수
		 * %f : 실수 ( %.숫자f : 숫자까지 소수점 출력 )
		 * %s : 문자열
		 * %c : 문자
		 * %b : 논리형
		 */
	}

}
