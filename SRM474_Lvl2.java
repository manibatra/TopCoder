package practice;

public class SRM474_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public int count(String A, String B)
	{
		
		int count=0;
		
		
		
		
		for(int i=0; i < A.length() ; i++){

			String C=A.substring(0, i)+B+A.substring(i, A.length());
			StringBuffer buf=new StringBuffer(C);
			buf.reverse();
			if(C.equals(buf.toString()))
				count++;
			
		}
		
		return count;
		
	}

}
