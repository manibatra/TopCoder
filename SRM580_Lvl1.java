package practice;

import java.util.Arrays;

public class SRM580_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean j=true;
		if(!j){
			
			System.out.println("wow");
		}
		
		System.out.println(new SRM580_Lvl1());

	}
	
	public int count(int[] s, int[] t)
	{
		
		int start=0;
		int end=0;
		int c=0;
		
		
		
		for(int i=0; i<s.length ; i++){
			
			start=s[i];
			end=t[i];
			
			for(int j=i+1; j<s.length; j++){
				
				if(s[j]>=start && s[j]<=end)
					c++;
				
			}
			
			
		}
		
		return c;
		
	}
	
	

}
