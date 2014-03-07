package practice;

public class SRM542_Lvl1 {
	
	public double getEfficiency(String[] profit)
	{
		double P=0;
		double Q=0;
		for(int i=0; i<=profit.length; i++){
			
			for(int j=i+1; j<profit[0].length(); j++){
				
				P+=Double.parseDouble((profit[i].substring(j, j+1)));
				Q++;
				
				
				
			}
			
		}
		
		return P/Q;
	}

}
