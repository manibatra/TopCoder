package practice;

public class SRM543_Lvl1 {
	
	public int getMax(String places)
	{
		
		int c=0;
		int v=0;
		
		for(int i=0; i<places.length(); i++){
			
			if(places.charAt(i)=='C')
				c++;
			else
				v++;
			
		}
		
		System.out.println(3L^4L^5L^6L^7L^8L^9L^10L);
		
		if(Math.abs(c-v)==1 || Math.abs(c-v)==0)
		  return c+v;
		else if(c!=0 && v!=0)
			return Math.min(c, v)*2+1;
		else
			return 1;
			
		
		
	}

}
