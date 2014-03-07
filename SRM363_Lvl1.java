package practice;

public class SRM363_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			
	}

	
	public String whatTimeIsIt(String time)
	{
		
		int h=Integer.parseInt(time.substring(0, 2));
		
		int ah=12-h;
		
		
		int m=Integer.parseInt(time.substring(3));
		
		if(h==0 && m == 0)
			return "00:00";
		
		if(m>0){
			
			ah--;
			m=(60-m);
			
		}
		
		String min=""+m;
		
		if(min.length()<2)
			min="0"+min;
		
		String res=ah+":"+min;
		
		if(res.length()<5)
			res="0"+res;
		
		return res;
		
		
	}
	
}
