package practice;

public class SRM556_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println('r'-'a');

	}
	
	public int maxLength(String letters)
	{
		
			
		int ans=0;
		
		for(int i=0; i < letters.length(); i++ ){
			
			for(int j=i; j<letters.length();j++){
				
				boolean ok =true;
				
				int[] cr=new int[26];
				
				for(int k=i; k<=j;k++){
					
					cr[letters.charAt(k)-'a']++;
					
					
				}
				
				
				for(int x : cr){
					
					if(x>1)
						ok=false;
					
					
				}
				
				if(ok)
					ans=Math.max(ans, j-i+1);
				
				
				
			}
			
			
			
			
		}
		
		return ans;
		
		
	}

}
