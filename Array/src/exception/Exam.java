package exception;
import java.util.*;
public class Exam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		try {			
			int size = scan.nextInt(); // 사용자로부터 입력받은 배열크기
			int[] arr = new int[size];
			int sum = 0;
			try {
				for(int i = 0; i < arr.length; i++) {
					arr[i] = scan.nextInt();
					sum += arr[i];
				}
			} catch(InputMismatchException e) {
				System.out.println("배열 인덱스 오류 : 인덱스를 초과하였습니다.");
			}
			System.out.println("평균 계산값 " + (double)sum/arr.length);
		}
		catch(InputMismatchException e) {
			System.out.println("타입 에러 : 숫자를 입력하셔야 합니다.");
		} 
	}

}
