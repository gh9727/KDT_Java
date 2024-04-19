package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//add(element) : 요소 추가
		list.add("Google");
		list.add("Samsung");
		list.add(1,"Amazon");
		
		//ArrayList 배열 출력 : Arrays.toString() 사용할 필요 없다.
		System.out.println(list);
		
		//addAll(arrayList) : 여러 요소 일괄적으로 추가
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Apple");
		list2.add("Microsoft");
		list.addAll(list2); // 1. 정적 Array를 써도 되는지
		System.out.println(list);
		
		//size(arrayList) : ArrayList 배열 크기 확인
		System.out.println(list.size());
		
		//containts(params) : ArrayList가 params를 포함하는지에 대하여 true | false 로반환
		System.out.println(list.contains("Hyundai"));
		
		//get(index) : 특정 요소(인덱스)에 접근
		System.out.println(list.get(2));
		
		//set(index, element) : 인덱스에 위치한 값을 교체
		list.set(2, "Hyundai");
		System.out.println(list);
		
		//indexOf(params) : 요소의 인덱스값 찾기 - 요소가 있으면 인덱스값 반환 | 요소가 없으면 -1 반환
		System.out.println(list.indexOf("Amazon"));
		
		//remove(index | element) : 요소 삭제
		list.remove(0);
		list.remove("Google");
		System.out.println(list);
		
		//isEmpty() : ArrayList가 비어있는지 확인 - 비었으면 true | 안비었으면 false
		System.out.println(list.isEmpty());
		
		//clear() : 요소 전부 삭제
		list.clear();
		System.out.println("list.clear() 후 list 요소 여부 : " + list.isEmpty());
	}

}
