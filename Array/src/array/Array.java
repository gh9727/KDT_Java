package array;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		// Java 배열 : 정적 할당
		int[] arr1 = new int[10]; // 정수 10개를 저장할 수 있는 배열
		int[] arr2 = {1,2,3,4,5}; // 중괄호로 배열 선언 + 값 초기화
		int[] arr3; // 나중에 배열 초기화
		arr3 = new int[5]; 
		
		// 선언된 배열값 변경하기
		arr1[3] = 300;
		System.out.println(Arrays.toString(arr1));
		
		// for-each 배열 출력
		for(int arr : arr2) {
			System.out.println(arr);
		}
		
		//2차원 배열
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(matrix[0]));
		
		for(int[] row : matrix) {
			for(int num : row) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		matrix[0][1] = 100;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}

}
