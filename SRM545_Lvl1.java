package practice;

public class SRM545_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(-1 & 8);

	}
	
	
	public int restoreY(int[] A)
	{
		
		
		
		for(int i=0; i< A.length; i++){
			
			
			int LHS=A[i];
			
			
			
			int RHS=-1;
			
	
			for(int j=0; j<A.length; j++){
				
			if(j!=i)	
				RHS&=A[j];
				
			}
			
			
			
			
			
			
			
			
			
		
			
			if(RHS==LHS)
				return RHS;
			
			
		}
		return -1;
		
	}
	

}
