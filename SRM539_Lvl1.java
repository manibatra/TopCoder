package practice;

public class SRM539_Lvl1 {
	
	public int maxFamily(String[] female, String[] male, String[] sibling)
	{
		
		
		int best=0;
		
		for(int i=0; i<sibling.length; i++){
			
			for(int j=0; j<female.length; j++){
				
				if(match(sibling[i], female[j])){
					for(int k=0; k<male.length; k++){
						
						if(match(sibling[i], male[k])){
							
							int temp=2;
							for(int c=0; c<sibling[i].length(); c++){
								System.out.println(sibling[i]);
								if(sibling[i].charAt(c)=='Y'){
									
								
									temp++;
								}
								
							}
							
							best=Math.max(best, temp);
							
							
						}
							
					}
				}
				
			}
			
			
		}
		
		return best;
			
			
			
			
			
	
		
		
		
		
	}
	
	public boolean match(String s, String t){
		
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)=='Y')
				if(t.charAt(i)!='Y')
					return false;
			
			
		}
		
		return true;
		
	}

}
