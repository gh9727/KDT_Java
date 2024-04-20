package practice;

public class Exam {
	// 인스턴스 개수 감지 static 변수
	public static int count = 0;
	// 멤버 변수
	private int width;
	private int height;
	
	// 생성자
	public Exam(int width) {
		this.width = width;
		count++;
	}
	// 멤버 함수
	public int area() {
		return this.width * this.height;
	}
	
	// getter & setter
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}


// 빈 생성자
//public Exam() {
//	// this.width = 0;
//	// this.height = 0;
//	// 다른 생성자를 호출하는 방법 : this();
//	this(0,0);
//};
// 정사각형 생성자
//public Exam(int num) {
//	// this.width = num;
//	// this.height = num;
//	// 다른 생성자를 호출하는 방법
//	this(num,num);
//}