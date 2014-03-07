package practice;

import java.util.Arrays;

public class SRM579_Lvl1 {


	public static void main(String[] args) {

		System.out.println(new SRM579_Lvl1());

		

	}

	public int maxWins(int initialLevel, int[] grezPower)
	{
		
		Arrays.sort(grezPower);
		
		int count=0;
		
		for(int i=0; i < grezPower.length ; i++){

			if(grezPower[i]<initialLevel){
				
				count++;
				initialLevel+=grezPower[i]/2;
				
			}

		}
		
		return count;
	}


}
