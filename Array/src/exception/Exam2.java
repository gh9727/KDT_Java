package exception;
import java.util.*;
import java.util.InputMismatchException;
public class Exam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		try {
			int size = scan.nextInt();
			int index = 0;
			ArrayList<Integer> equalArray = new ArrayList<>();
			ArrayList<Integer> arrayState = new ArrayList<>();
		    System.out.println("배열 요소를 입력하세요");
		    try {
		    	ArrayList<Integer> intArray  = new ArrayList<Integer>();
		    	while(index < size) {
		    		intArray.add(scan.nextInt());
		    		index++;
		    	}
		    	// Collection : 배열리스트 정렬 시켜주는 클래스 
		    	 Collections.sort(intArray);
		    	System.out.println("중복된 숫자 서브 배열");
		    	
		    	for(int value : intArray) {
		    		if(arrayState.contains(value)) {
		    			continue;
		    		}
		    		else {	    			
		    			arrayState.add(value);
		    			for(int i = 0; i < intArray.size(); i++) {
		    				if(value == intArray.get(i)) {
		    					// 자기 자신은 기본적으로 포함됨
		    					equalArray.add(intArray.get(i));
		    				}
		    			}
		    		}
		    		if(equalArray.size() >= 2) {
		    			System.out.print(equalArray);
		    			equalArray.clear();
		    		}
		    		else {
		    			equalArray.clear();
		    		}
		    	}
		    }
		    catch(InputMismatchException e) {
		    	System.out.println("타입 에러 : 숫자만 입력하실 수 있습니다.");
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		    	System.out.println("인덱스 에러 : 배열 개수를 초과하였습니다.");
		    }
		} catch(InputMismatchException e) {
			System.out.println("배열 사이즈는 정수만 입력 가능 합니다.");
		} catch(NegativeArraySizeException e) {
			System.out.println("배열 사이즈는 정수만 입력 가능 합니다.");
		}
		finally {
			scan.close();
		}
	}
	
}

