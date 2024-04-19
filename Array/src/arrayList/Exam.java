package arrayList;
import java.util.*;
public class Exam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> message = new ArrayList<String>();
		while(true) {
			System.out.println("문자를 입력해 주세요 ");
			String str = scan.nextLine();
			message.add(str);
			if(message.contains("exit")) {
				message.remove("exit");
				break;
			}
		}
		for ( String value : message) {
			System.out.println(value);
		}
		scan.close();
	}

}
