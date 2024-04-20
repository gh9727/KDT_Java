package Class;

public class Car {
	// 필드 - 멤버 변수 - 데이터
	private int speed; // 외부 접근 방지 : private 키워드 사용
	
	// 메소드 - 멤버 함수
	void start() {
		System.out.println("Engine Start");
	}
	// 생성자1
	public Car(){
		this(1);
	}
	// 생성자2
	public Car(int speed) {
		if ( speed > 0) {
			this.speed= speed;
		}
	}
	// getter, setter 세팅 : 캡슐화의 원칙 - 필드에 접근하는 메소드 
	int getSpeed() {
		return this.speed;
	}
	void setSpeed(int speed) {
		if( speed < 0) {			
			this.speed = Math.abs(speed);
		}
		else {
			this.speed = speed;
		}
	}
}