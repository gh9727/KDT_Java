package practice;
import java.util.*;
public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Exam> rect = new ArrayList<Exam>();
		while(true) {			
			System.out.println("삼각형 가로와 세로 길이를 띄어쓰기 기준으로 입력하세요");
			int width = scan.nextInt();
			int height =scan.nextInt();
			if(!(width == 0 && height == 0)) {
				Exam rectangle = new Exam(width);
				rectangle.setHeight(height);
				rect.add(rectangle);
			}
			else {
				break;
			}
		}
		System.out.println();
		for(int i = 0; i < rect.size(); i++) {
			System.out.println("가로 길이는: " + rect.get(i).getWidth());
			System.out.println("세로 길이는: " + rect.get(i).getHeight());
			System.out.println("넓이는 " + rect.get(i).area());
			System.out.println("-------------------");
		}
		// static으로 선언된 멤버 변수는 객체 없이 접근 가능하다
		System.out.println("생성된 인스턴스 개수 : " + Exam.count);
		scan.close();
	}

}
