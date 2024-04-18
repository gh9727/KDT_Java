package java_first;
import java.math.BigDecimal;

public class Decimal {

	public static void main(String[] args) {
		// BigDecimal 클래스 : java.math 패키지 +
		// 문자열 형태로 적어야함!
		BigDecimal a = new BigDecimal("0.2");
		BigDecimal b = new BigDecimal("0.5");
		
		BigDecimal sum = a.add(b); // 덧셈 add()
		BigDecimal diff = a.subtract(b); // 뺄셈 subtract()
		BigDecimal multi = a.multiply(b); // 곱셈 multiply()
		BigDecimal div = a.divide(b); // 나누기 divide()
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(multi);
		System.out.println(div);
	}

}
