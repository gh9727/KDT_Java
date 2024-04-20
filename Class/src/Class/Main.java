package Class;

public class Main {
	public static void main(String[] args) {
		Car hyundai = new Car(-30);
		Car kia = new Car(1);
		hyundai.start();
		kia.start();
		System.out.println(hyundai.getSpeed());
		System.out.println(kia.getSpeed());
		// 외부에서 접근하면 안됨 : 캡슐화의 원칙
		// 누구든 클래스를 조작이 가능
//		hyundai.speed = 30;
//		kia.speed = 50;
		hyundai.setSpeed(30);
		kia.setSpeed(50);
//		System.out.println(hyundai.speed);
//		System.out.println(kia.speed);
		System.out.println(hyundai.getSpeed());
		System.out.println(kia.getSpeed());
		// 내가 정의한 Calculator 클래스 인스턴스(객체) 생성
//		Calculator calc = new Calculator();
//		System.out.println("더하기" + calc.add(3, 7));
//		System.out.println("빼기" + calc.subtract(7, 3));
//		System.out.println("곱하기" + calc.multiply(2, 5));
//		System.out.println("나누기" + calc.multiply(5, 0));
	}
}
