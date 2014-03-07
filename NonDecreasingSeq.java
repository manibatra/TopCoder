package practice;

import java.util.Arrays;

public class NonDecreasingSeq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new NonDecreasingSeq().count(new int[]{5, 3, 4, 8, 6, 7}));

	}
	
	public int count(int[] numbers){
		
		int dp[]=new int[numbers.length];
		
		Arrays.fill(dp, 1);
		
		for(int i=1; i<numbers.length; i++){
			
			for(int j=0; j < i; j++){
				
				if(numbers[j]<numbers[i]){
					
					if(dp[j]+1>dp[i])
						dp[i]=dp[j]+1;
					
				}
				
				
			}
			
			
		}
		
		for(int x : dp){
			
			System.out.print(x+" ");
			
		}
		
		System.out.println();
		
		return dp[dp.length-1];
		
	}

}
