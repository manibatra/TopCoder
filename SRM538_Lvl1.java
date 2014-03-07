package practice;

public class SRM538_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new SRM538_Lvl1().maxDistance("LL???RRRRRRR???"));

	}
	
	public int maxDistance(String program)
	{
		
		
		
		int distanceL=0;
		int maxL=0;
		int distanceR=0;
		int maxR=0;
		for(char x : program.toCharArray())
		{
			
			if(x=='L')
				distanceR--;
			if(x=='R')
				distanceR++;
			if(x=='?')
				distanceR++;
			
			maxR=Math.max(maxR, distanceR);
		}
		
		
		for(char x : program.toCharArray())
		{
			
			if(x=='L')
				distanceL++;
			if(x=='R')
				distanceL--;
			if(x=='?')
				distanceL++;
			
			maxL=Math.max(maxL, distanceL);
		}
		
		
		if(maxL>=maxR)
			return maxL;
		else 
			return maxR;
		
		
		
	}

	private int countMax(char c, String p) {
		
		int maxD=0;
		int d=0;
		
		System.out.println(c);
		
			for(char x : p.toCharArray()){
				
				if(c=='L'){
					if(x=='L')
						d++;
					if(x=='R')
						d--;
					if(x=='?')
						d++;
					
					maxD=Math.max(maxD, d);
					
				}
				
				if(c=='R'){
					if(x=='L')
						d--;
					if(x=='R')
						d++;
					if(x=='?')
						d--;
					
					maxD=Math.max(maxD, d);
					
				}
				
				
				
				
			}
		
		return maxD;
	}
	
	

}
