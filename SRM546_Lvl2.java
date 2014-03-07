package practice;

public class SRM546_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new SRM546_Lvl2().getWinner(new int[]{123,123,456,456,456,123}));

	}

	public int getWinner(int[] events)
	{

		int max=0;
		int count=0;
		int maxElement=0;
		for(int i=0; i<events.length ; i++){

			int element=0;
			if(events[i]!=-1)
				element=events[i];
			else
				continue;
			int currentCount=0;
			int currentMax=0;
			for(int j=0; j<events.length; j++){

				if(events[j]==element){

					currentCount++;
					events[j]=-1;
					currentMax=j;
				}

			}
			
			System.out.println(max+" "+" "+maxElement+" "+count);
			if(currentCount>count){
				count=currentCount;
				maxElement=element;
				max=currentMax;
			}else if(currentCount==count){
				
				if(currentMax<max)
				{
					
					count=currentCount;
					maxElement=element;
					max=currentMax;
					
				}
				
			}
				

		}
		
		return maxElement;

	}

}
