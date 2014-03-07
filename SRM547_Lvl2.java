package practice;

import java.util.Arrays;

public class SRM547_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new SRM547_Lvl2().maximalLength(new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 100}, 20));

	}
	
	public double maximalLength(int[] height, int w)
	{
		int n=height.length;
		double[] dp=new double[n];
		
		Arrays.fill(dp, Double.MIN_VALUE);
		
		for(int i=1; i < n; i++){
			
			
				int maxB=1;
			
			
				
				for(int b=1; b<=height[i]; b++){
					
					
					if(findRope(height[i-1], b, w)>dp[i-1]){
					dp[i-1]=findRope(height[i-1], b, w);
				
					maxB=b;
					}
				
				
				
				
			}
			
			height[i]=maxB;
				
		}
		
		double tRope=0;
		
		for(double x : dp){
			
			if(x!=Double.MIN_VALUE){
				
				tRope+=x;
				
			}
			
		}
		
		return tRope;
		
		
	}

	private double findRope(int a, int b, int w) {
		
		double sqH=Math.pow(Math.max(a, b)-Math.min(a, b), 2)+Math.pow(w, 2);
		
		return Math.pow(sqH, 0.5);
	}

}
