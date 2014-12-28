package practice;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new FibonacciSequence().numFibs(7, 7));

	}
	
	public 	int numFibs(int a, int b){
		
		int[] numbers = new int[1005];
		numbers[0] = 1;
		numbers[1] = 1;
		for(int i = 2; i < numbers.length; i++){
			numbers[i] = numbers[i-1] + numbers[i-2];
		}
		

		int counter = 0;
		
		for(int i=0; i < numbers.length; i++){
			
			if(numbers[i]>=a && numbers[i]<=b){
				
				counter++;
				
			}
			
		}
		
		return counter;
	}

	

}
