package practice;

public class SRM581_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new SRM581_Lvl1());
		
		
		

	}
	
	public int minimumTurns(String ca)
	{
		
		int cb=0;
		
		int cw=0;
		
		for(int i=0; i<ca.length() ; i++){
			
			if(i%2==0 && ca.charAt(i)=='W')
				cb++;
			
			if(i%2==1 && ca.charAt(i)=='B')
				cb++;
			
			if(i%2==0 && ca.charAt(i)=='B')
				cw++;
			
			if(i%2==1 && ca.charAt(i)=='W')
				cw++;
			
		}
		
		
		return Math.min(cw, cb);
		
	}
	

}
