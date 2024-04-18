package java_first;
import java.util.Scanner;

public class Calc {
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	public double sub(double num1, double num2) {
		return num1 - num2;
	}
	public double mult(double num1, double num2) {
		return num1 * num2;
	}
	public double div(double num1, double num2) {
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 두 개를 입력하세요");
		double num1 = scan.nextInt();
		double num2 = scan.nextInt();
		Calc calc = new Calc();
		System.out.printf("덧셈 결과 : %.1f\n",calc.add(num1, num2));
		System.out.printf("뺄셈 결과 : %.1f\n", calc.sub(num1, num2));
		System.out.printf("덧셈 결과 : %f\n", calc.div(num1, num2));
		System.out.printf("덧셈 결과 : %.1f\n", calc.mult(num1, num2));

	}

}
