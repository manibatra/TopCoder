package practice;

import java.util.Arrays;

public class ZigZagSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(new ZigZagSequence().longestZigZag(new int[]{70,55,13,2,99,2,80,80,80,80,100,19,7,5,5,5,1000,32,32}	));

	}

	public int longestZigZag(int[] sequence){

		int n=sequence.length;

		int dp[]=new int[n];

		Arrays.fill(dp, 1);
		for(int i=1; i< n; i++){

			if(sequence[i]-sequence[i-1]<0){

				dp[i]+=1;
				dp[i]*=-1;

			}else if(sequence[i]-sequence[i-1]>0){

				dp[i]+=1;

			}

		}

		for(int i=2; i < n; i++){

			for(int j=0; j <i; j++){

				if((sequence[i]-sequence[j]<0) && dp[j]>0){
					dp[i]=Math.max(Math.abs(dp[i]), (dp[j]+1));
					dp[i]*=-1;
				}

				if((sequence[i]-sequence[j]>0) && dp[j]<0)
					dp[i]=Math.max(Math.abs(dp[i]), Math.abs(dp[j])+1);

			}

		}


		return Math.abs(dp[n-1]);
	}

}
