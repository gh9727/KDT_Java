package java_first;
import java.math.BigDecimal;
public class OverLodding {
	public double area(double num1) {
		return num1 * num1 * 3.14;
	}
	public double area(double num1, double num2) {
		return num1 * num2;
	}
	public double area(double numa, int numb) {
		return numa * numb / 2;
	}
	public static void main(String[] args) {
		OverLodding over = new OverLodding();
		BigDecimal a = new BigDecimal("3.14");
		System.out.printf("반지름이 5인 원의 넓이 : %f",over.area(5.0)).println();
		System.out.printf("가로 4, 세로 7인 직사각형의 넓이 : %.1f ",over.area(4.0,7.0)).println();
		System.out.printf("밑변 6, 높이 3인 삼각형의 넓이 : %.1f",over.area(6,3.0));
	}

}
