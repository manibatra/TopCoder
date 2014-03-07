package practice;

import java.util.Arrays;

public class SRM366_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		System.out.println(new SRM366_Lvl2().maxFinal(new int[]{5, 3, 7}, 5, 10));


	}


	int[][] dp;

	public int maxFinal(int[] c, int b, int m)
	{
		dp=new int[c.length+1][m+1];
		
		for(int i=0; i<=c.length; i++)
		Arrays.fill(dp[i], -1000000000);
		
		return aOrS(b, c, 0,m);

	}

	private int aOrS(int b, int[] c, int p,int m) {
		System.out.println(p); 
		if(b<0 || b>m)
			return -1;
		
		if(p==c.length)
			return b;
		
		if(dp[p][b]!=-1000000000)
			return dp[p][b];
		
		
		int m1=Math.max(aOrS(b+c[p], c, p+1, m), aOrS(b-c[p], c, p+1, m));
		dp[p][b]=m1;
		
		
		
		

		return m1;

	}



}
