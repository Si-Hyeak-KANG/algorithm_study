package ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {

		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108, 111};
		
		int target = 111;
		int left = 0;
		int right = numbers.length -1; 
		int mid = (left + right) / 2;
		
		int temp = numbers[mid]; // �񱳰�
		boolean find = false;
		
		while( left <= right) {
			
			if(target == temp) {
				find = true;
				break; // while���� ���� ������
			}
			else if(target < temp) {
				right = mid -1;
			}
			else {
				left = mid + 1;
			}
			
			mid = (left + right) / 2;
			temp = numbers[mid];
		}
		
		if(find == true) {
			mid++;
			System.out.println("ã�� ���� " + mid + "��° �ֽ��ϴ�.");
		}
		else 
			System.out.println("ã�� ���� �����ϴ�.");
	}

}