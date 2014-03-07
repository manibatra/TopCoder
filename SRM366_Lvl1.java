package practice;

import java.util.Arrays;
import java.util.Comparator;

public class SRM366_Lvl1 {

	
	String n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new SRM366_Lvl1());

	}
	
	
	public String[] sortSerials(String[] s)
	{
		Sorter so=new Sorter();
		 Arrays.sort(s, so);
		return s;
	}
	
	class Sorter implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			
			if(o1.length()>o2.length())
				return 1;
			else if(o1.length()<o2.length())
				return -1;
				
			char[] O1=o1.toCharArray();
			int sum1=0;
			
			for(char x : O1)
			{
				if(x<65)
					sum1+=Integer.parseInt(""+x);
				
			}
			
			char[] O2=o2.toCharArray();
			int sum2=0;
			
			for(char x : O2)
			{
				if(x<65)
					sum2+=Integer.parseInt(""+x);
				
			}
			
			if(sum1>sum2){
				return 1;
			}else if(sum1<sum2)
				return -1;
			else
				return o1.compareTo(o2);
			
			
			
			
		}
		
		
		
	}
	
	

}
