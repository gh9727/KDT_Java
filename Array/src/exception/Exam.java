package exception;
import java.util.*;
import java.lang.*;
public class Exam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		try {			
			int size = scan.nextInt(); // 사용자로부터 입력받은 배열크기
			// 배열 크기를 음수로 입력했을 경우 catch문으로 강제 이동
			int[] arr = new int[size];
			if(size < 0) {
				throw new NegativeArraySizeException("오류 발생 : 음수 작성 불가");
			}
			int sum = 0;
			try {
				for(int i = 0; i < arr.length; i++) {
					arr[i] = scan.nextInt();
					sum += arr[i];
				}
				System.out.println("평균 계산값 " + (double)sum/arr.length);
			} catch(InputMismatchException e) {
				System.out.println("타입 에러 : 숫자를 입력하셔야 합니다.");
			} catch(ArithmeticException e) {
				System.out.println("오류 발생 : 배열 크기는 0이 될 수 없습니다.");
			} 
		}
		catch(InputMismatchException e) {
			System.out.println("타입 에러 : 숫자를 입력하셔야 합니다.");
		} 
		catch(NegativeArraySizeException e) {
			System.out.println("1" + e.getMessage());
		}
		finally {
			scan.close();
		}
	}
}