package practice;

public class SRM541_Lvl1 {
	
	public int countTuples(String S)
	{
		int count=0;
		
		for(int i=1; i<S.length();i++){
			
			for(int j=1; j+i<S.length(); j++ ){
				
				String sub1=S.substring(j, j+i);
				
				
				
				for(int k=j+i; k+i<S.length();k++){
					
					
					
					if(sub1.equals(S.substring(k, k+i)) && !(S.substring(j+i, k).equals(""))){
						
						
						count++;
						
					}
					
				}
				
				
			}
			
			
		}
		
		return count;
		
	}

}
