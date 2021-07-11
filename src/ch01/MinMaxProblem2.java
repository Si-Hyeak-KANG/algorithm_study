package ch01;

public class MinMaxProblem2 {

	public static void main(String[] args) {
		
		int[] numbers = {10,55,23,2,79,101,16,82,30,45};
		
		int min = numbers[0] ; // 최소값
		int max = numbers[0] ; // 최대값
		int maxPos=0; // 최소값 위치
		int minPos=0; // 최대값 위치
		
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
			
			
			
			System.out.println("최소값은 " + min + "최소값의 위치는 "+ minPos );
			System.out.println("최대값은 " + max + "최대값의 위치는 "+ maxPos );
		
	}

}
