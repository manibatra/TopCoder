package practice;

public class SRM544_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SRM544_Lvl1().IsFraudulent(new int[] {0, 0, 2, 0, 8, 0, 6, 10, 13, 0, 6, 11, 3, 0, 0, 5, 0, 5, 0, 8, 5, 0, 7, 0}));

	}
	
	public String IsFraudulent(int[] percentages)
	{
	
		
		int sum=0;
		int count=0;
	
		for(int i=0; i<percentages.length; i++){
		
			sum+=percentages[i];
			if(percentages[i]>0)
				count++;
		
		}
		
		System.out.println(sum);
		
		if(sum<100){
			sum+=percentages.length*0.5;
			System.out.println(sum);
		if(sum<100)	
		 return "YES";
		else
		 return "NO";
		 
		 }  
		 
		else if(sum>100){
			sum-=count/2;
			
			System.out.println(sum);
		
		if(sum>100)
			return "YES";
		else
			return "NO";
		}	
		
		return "NO";						
			
		
	}

}
