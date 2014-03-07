package practice;

import java.util.Arrays;

public class CoinSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new CoinSum().countCoins(new int[]{2, 3, 5}, 9));

	}
	
	public int countCoins(int[] coins, int sum){
		
		
		int cost[]=new int[sum+1];
		
		Arrays.fill(cost, 1000000000);
		cost[0]=0;
		
		for(int i=1; i<=sum; i++){
			
			for(int j=0; j < coins.length; j++){
				
				if(coins[j]<=i && cost[i-coins[j]]!=1000000000){
					
					cost[i]=Math.min(cost[i], cost[i-coins[j]]+1);
					
					
				}
				
				
				
			}
			
			
		}
		
		if(cost[sum]!=1000000000)
		return cost[sum];
		else
			return -1;
		
	}

}
