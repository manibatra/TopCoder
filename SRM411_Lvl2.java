package practice;

import java.util.Arrays;

public class SRM411_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public int decompose(String s, String[] v)
	{
		
		int L=s.length();
		
		int[] dp= new int[L+1];
		
		Arrays.fill(dp, 100);
		
		dp[0]=0;
		
		for(int i=0; i<dp.length; i++){
			
			if(dp[i]!=100){
				
				for(int j=0; j<v.length; j++){
					
					int jL=v[j].length();
					
					if(i+jL<=L && possible(v[j], s.substring(i, i+jL ))){
						
						dp[i+jL]=Math.min(dp[i+jL], dp[i]+score(v[j], s.substring(i, i+jL )));
						
						
					}
					
				}
				
				
			}
			
			
			
		}
		
		
		return (dp[dp.length-1]==100)?-1:dp[dp.length-1];
		
		
		
	}

	private int score(String string, String substring) {
		
		int count=0;
		
		for(int i=0; i<string.length(); i++){
			
			if(string.charAt(i)!=substring.charAt(i))
				count++;
			
		}
		
		return count;
	}

	private boolean possible(String string, String substring) {
		
		int[] st=new int[26];
		int[] sub=new int[26];
		
		for(char x : string.toCharArray()) st[x-'a']++;
		for(char x : substring.toCharArray()) sub[x-'a']++;
		
		return Arrays.equals(st, sub);
		
		
	}

}
