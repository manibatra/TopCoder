package practice;

import java.util.Arrays;

public class TCCC04_Round4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		System.out.println(new TCCC04_Round4().maxDonations(new int[]{ 94, 40, 49 }));
		

	}
	
	public int maxDonations(int[] donations){
		
		if(donations.length==2)
			return Math.max(donations[0], donations[1]);
		
		int maxStraight=calculateMax(donations);
		int[] rD=new int[donations.length];
		
		int ptr=donations.length-1;
		
		for(int x : donations ){
			
			rD[ptr--]=x;
			
		}
		
		int maxReverse=calculateMax(rD);
		
		
		
			return Math.max(maxStraight, maxReverse);
		
		
	}

	private int calculateMax(int[] donations) {
		
		boolean first[]=new boolean[donations.length];
		
		Arrays.fill(first, false);
		
		first[0]=true;
		
		int[] dp=new int[donations.length];
		
		dp[0]=donations[0];
		dp[1]=donations[1];
		
		for(int i=2; i < donations.length-1; i++){
			
			
			for(int j=0; j < i-1; j++){
				
				
				if(dp[i]<dp[j]+donations[i])
				{
					
					dp[i]=dp[j]+donations[i];
					first[i]=first[j];
					
				}
				
			}
			
		}
		
		for(int i=0; i<donations.length-2; i++){
			
			//System.out.println(dp[i]);
			
			if(dp[donations.length-1]<donations[donations.length-1]+dp[i] && first[i]==false)
				dp[donations.length-1]=donations[donations.length-1]+dp[i];
			
			
		}
		
		
		
		int max=0;
		
		for(int x : dp){
			//System.out.print(x+" ");
			max=Math.max(max, x);
			
		}
		
		//System.out.println();
		
		return max;
	}

}
