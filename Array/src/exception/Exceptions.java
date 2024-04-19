package exception;
import java.util.*;
public class Exceptions {

	public static void main(String[] args) {
		
		//숫자를 0으로 나눈 경우 예외 처리
		try {
			int num1 = 4;
			int num2 = 0;
			System.out.printf("num1 / num2 = %f", num1/num2);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누어 예외 발생");
			System.out.println(e);
		}
		
		// 배열 인덱스 오버 예외 처리
		try {
			int[] intArray = {1,2,3,4};
			for(int i = 0; i< 5; i++) {
				System.out.println(intArray[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 넘어가 예외 발생");
		}
		
		// 입력 오류 발생 시 예외 처리
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		try {
			int num = scan.nextInt();
			System.out.println("입력된 정수는 " +num);
		}
		catch(InputMismatchException e) {
			System.out.println("입력 오류 : 숫자를 입력하셔야 합니다.");
		}
		//null에 접근하는 경우
		try {			
			String text = null;
			System.out.println(text.length());
		} catch(NullPointerException e) {
			System.out.println("null 예외 : null 값에 접근할 수 없습니다.");
		}
	}
}
