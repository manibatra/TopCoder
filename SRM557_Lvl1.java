package practice;

public class SRM557_Lvl1 {

	
	public int minHP(int[] dps, int[] hp)
	{
		
		int tD=0;
		
		
		for(int i=0; i < hp.length; i++){
			
			for(int j=i; j < dps.length; j++){
				
				tD=hp[i]*dps[j];
				
				
			}
			
		}
		
		return tD;
		
		
	}
	

}
