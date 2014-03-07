package practice;

import java.util.Collections;
import java.util.Vector;


public class SRM539_Lvl2 {
	
	class Bounds implements Comparable<Bounds>{

		int lower;
		int upper;

		public Bounds(int lowSum, int highSum){

			this.lower=lowSum;
			this.upper=highSum;

		}

		@Override
		public int compareTo(Bounds o) {
			if(lower>o.lower)
				return 1;
			else if(lower<o.lower)
				return -1;
			else
				return 0;
		}


	}

	public class Over9000Rocks
	{


		public int countPossibilities(int[] lowerBound, int[] upperBound)
		{

			Vector<Bounds> result=new Vector<Bounds>(); 

			for(int i=0; i< 1<<lowerBound.length;i++){

				int subsetL[]=new int[lowerBound.length];
				int subsetH[]=new int[lowerBound.length];

				for(int k=0; k<lowerBound.length;k++){

					if(((1<<k) & i)!=0){

						subsetL[k]=lowerBound[k];
						subsetH[k]=upperBound[k];

					}



				}


				int lowSum=0;
				int highSum=0;

				for(int x: subsetL){

					lowSum+=x;

				}

				for(int x: subsetH){

					highSum+=x;

				}



				//System.out.println(lowSum+"   "+highSum);

				if(highSum<=9000)
					continue;

				if(lowSum<=9000)
				{

					lowSum=9001;
				}

				Bounds bound=new Bounds(lowSum, highSum);

				if(!result.contains(bound))
					result.add(bound);


			}

			Collections.sort(result);

			int sum=0;

			if(result.size()==0)
				return 0;

			Bounds current=result.get(0);

			for(int i=1; i<result.size();i++){

				if(current.upper>=result.get(i).lower)
					current.upper=Math.max(current.upper, result.get(i).upper);
				else
				{sum+=(current.upper-current.lower+1);
				current=result.get(i);
				}


			}

			sum+=(current.upper-current.lower+1);


			return sum;


		}




	}

}
