package ch01;

public class MinMaxProblem2 {

	public static void main(String[] args) {
		
		int[] numbers = {10,55,23,2,79,101,16,82,30,45};
		
		int min = numbers[0] ; // �ּҰ�
		int max = numbers[0] ; // �ִ밪
		int maxPos=0; // �ּҰ� ��ġ
		int minPos=0; // �ִ밪 ��ġ
		
		for(int i=1; i<numbers.length; i++) {
			
			if( min > numbers[i] ) {
				
				min = numbers[i];
				minPos = i+1;
			}
			
			if( max < numbers[i] ) {
				
				max = numbers[i];
				maxPos = i+1;
			}
		}	
			
			
			
			System.out.println("�ּҰ��� " + min + "�ּҰ��� ��ġ�� "+ minPos );
			System.out.println("�ִ밪�� " + max + "�ִ밪�� ��ġ�� "+ maxPos );
		
	}

}
