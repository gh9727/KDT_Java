package java_first;

public class Over {
	// 메소드 오버로딩
	// 하나의 함수명으로 여러개의 동작이 가능한 기능 만들기
	public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public double add(double num1,double num2) {
		double sum = num1 + num2;
		return sum;
	}
	public int add(int num1,int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public static void main(String[] args) {
		Over over = new Over();
		System.out.println("result = " + over.add(3, 5));
		System.out.println("result = " + over.add(3.2, 5.3));
		System.out.println("result = " + over.add(3,5,2));
	}
	
}
