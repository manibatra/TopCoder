package practice;

import java.util.Arrays;

public class SRM531_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long x=(long) ((Math.pow(45, 51)*50*49*48*47*46)%1000000007);
		System.out.println(x);

	}
	
	public int[] getUnsorted(int[] s)
	{
		
		Arrays.sort(s);
		
		
		boolean change=false;
		for(int i=s.length-1; i>=1; i-- ){
			
			if(s[i]>s[i-1]){
				
				change=true;
				int temp=s[i];
				s[i]=s[i-1];
				s[i-1]=temp;
				break;
				
			}
			
		}
		
		if(change)
			return s;
		else
			return new int[]{};
		
		
	}
	
	

}
