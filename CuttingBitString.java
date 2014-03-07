package practice;

import java.util.Arrays;
import java.util.TreeSet;

public class CuttingBitString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new CuttingBitString().getmin("01111111111"));

	}
	
	
	public int getmin(String S){
		
		TreeSet<String> powers=new TreeSet<String>();
		
		long pow=1;
		
		while(pow < (1L<<60)){
			
			powers.add(Long.toBinaryString(pow));
			pow*=5;
			
			
		}
		
		int N=S.length();
		int dp[]=new int[N];
		
		Arrays.fill(dp, Integer.MAX_VALUE/2);
		
		
		for(int i=0; i < N; i++){
			
			if(powers.contains(S.substring(0, i+1)))
				dp[i]=1;
			else{
				
				for(int j=0; j <i;j++){
					
					if(powers.contains(S.substring(j+1, i+1)))
						dp[i]=Math.min(dp[i], dp[j]+1);
				}
				
				
			}
			
			
		}
		
		return dp[N-1]==Integer.MAX_VALUE/2?-1:dp[N-1];
	}

}
