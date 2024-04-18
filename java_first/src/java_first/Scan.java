package java_first;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		System.out.println("이름, 나이, 키, 결혼 여부를 빈칸으로 분리하여 입력");
		//System.in : 표준 입력 스트림을 나타내며, 키보드 입력을 위해 사용
		Scanner scan = new Scanner(System.in); // Scanner 객체
		String name = scan.next(); // next() 함수마다 한 줄의 콘솔 입력 창이 생김
		int age = scan.nextInt(); 
		double height = scan.nextDouble();
		boolean isMarry = scan.nextBoolean(); 
		System.out.printf("이름은 %s, 나이는 %d, 키는 %.1fcm, 결혼 여부는 %b",name,age,height,isMarry);
		scan.close(); // 콘솔 입력 창 닫아주기(중요)
	}

}
