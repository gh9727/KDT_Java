package array;
import java.util.*;
public class Exam {
	//가변적 매개변수 : 스프레드(...) 연산자 사용
	// 가변 매개변수는 항상 매개변수 마지막에 와야함 ! ! !
	public static int addNumbers(int ...nums) {
		int total = 0;
		for(int num : nums) {
			total += num;
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요");
		int[] arr = new int[5];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		System.out.println((double)sum/arr.length);
//		scan.close(); 
		
		int sum2 = addNumbers(1,8,9,10);
		System.out.println("가변 매개 변수 : "+sum);
	}
}