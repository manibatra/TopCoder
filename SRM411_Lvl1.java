package practice;

public class SRM411_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new SRM411_Lvl1().getNumber(0, 2));

	}
	
	public int getNumber(int lowerBound, int upperBound)
	{
		
		int[] numbers=new int[upperBound-lowerBound+1];
		
		int ptr=0;
		
		
		for(int i=lowerBound; i<=upperBound; i++){
			
			int count=0;
			
			for(int j=0; j <=Math.sqrt(i) ; j++){
				
				for(int k=j; k<=Math.sqrt(i); k++){
					
					if(((j*j)+(k*k))==i)
						count++;
					
				}


			}
			
			numbers[ptr++]=count;
			
			
		}
		
		int max=0;
		int high=0;
		
		for(int i: numbers)
			System.out.print(i+" ");
				
		System.out.println();
				for(int i=0; i<numbers.length; i++){
					
					if(numbers[i]>=max  )
						
						
					{
						max=numbers[i];
						high=i;
					}
						
					
				}
				
				return lowerBound+high;
		
	}
	
	
	

}
