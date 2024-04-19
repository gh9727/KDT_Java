package array;

import java.util.Arrays;

public class ArraysMethod {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//copyOf : 한 배열에서 내가 정한 길이 만큼 배열 요소 복사
		int[] copyOfArray = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(copyOfArray));
		
		//copyofRange : 한 배열에서 내가 정한 시작 인덱스에서 종료 인덱스 전까지의 배열 요소 복사
		int[] copyOfRangeArray = Arrays.copyOfRange(arr, 0,3); // 0 ~ 2 까지 요소 복사
		System.out.println(Arrays.toString(copyOfRangeArray));
		
		//fill : 배열의 모든 요소를 정해진 값으로 채움
		Arrays.fill(arr, 10);
		System.out.println(Arrays.toString(arr));
		
		//fill로 부분 요소 채움
		int[] arr2 = new int[10];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		Arrays.fill(arr2, 3,arr2.length,100);
		System.out.println(Arrays.toString(arr2));
		
		//sort : 배열을 오름차순으로 정렬
		int[] arr3 = {2,1,5,3,4};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		//equals : 두 배열이 같은지 여부 확인
		int[] arr4 = {1,2,3,4,5};
		System.out.println(Arrays.equals(arr3, arr4));
		
		//deepEquals : 두 다차원 배열이 같은지 비교
		int[][] arrs1 = {{1,2},{3,4}};
		int[][] arrs2 = {{1,2},{3,5}};
		System.out.println(Arrays.deepEquals(arrs1,arrs2));
		
		//binarySearch : 이진 탐색 알고리즘 사용하여 한 배열의 인덱스 요소 검색
		//바이너리서치 함수 사용시 반드시 배열 정렬되있어야함!
		int index = Arrays.binarySearch(arr3, 4);
		System.out.println(index);
	}

}
