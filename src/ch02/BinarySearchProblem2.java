package ch02;

public class BinarySearchProblem2 {

	public static void main(String[] args) {
	
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 95; // 찾을 숫자
		
		int left = 0;
		int right = numbers.length-1;
		int mid = (left+right)/2;
		
		int temp = numbers[mid];
		boolean find = false;
		
		while(left <= right) {
			
			if(target == temp) { // 숫자를 찾은 경우
				
				find = true;
				break;
			} else if(target < temp) {
				
				right = mid-1;
			} else {
				left = mid+1;
			}
			
			mid = (left+right)/2;
			temp = numbers[mid];
			
		}
		
		if(find == true) {
			System.out.println("찾는 숫자의 위치는 " + (mid+1) + "번째 입니다.");
			
		}else {
			System.out.println("찾는 수가 없습니다.");
		}
		
		
		
	}	

}
