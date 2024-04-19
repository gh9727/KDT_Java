package java_first;
import java.math.BigDecimal;
import java.lang.Math;
public class OverLodding {
	public double area(double radius) {
		return radius * radius * Math.PI;
	}
	public double area(double w, double h) {
		return w * h;
	}
	public double area(double w, double h, boolean isT) {
		if(isT) {	
			return w * h * 0.5;
		}
		else {
			return area(w,h);
		}
	}
	public static void main(String[] args) {
		OverLodding over = new OverLodding();
		BigDecimal a = new BigDecimal("3.14");
		System.out.printf("반지름이 5인 원의 넓이 : %f",over.area(5.0)).println();
		System.out.printf("가로 4, 세로 7인 직사각형의 넓이 : %.1f ",over.area(4.0,7.0)).println();
		System.out.printf("밑변 6, 높이 3인 삼각형의 넓이 : %.1f",over.area(6.0,3.0,true));
	}

}
