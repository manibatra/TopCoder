package practice;

public class SRM558_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}

	public int score(String[] cost, String[] benefit, String[] stone)
	{
		int cst=0;

		for(int i=0; i<stone.length; i++){

			for(int j=0; j<stone[i].length();j++){

				if(stone[i].charAt(j)=='o'){

					cst=cst+Character.getNumericValue(benefit[i].charAt(j))-Character.getNumericValue(cost[i].charAt(j));
					continue;

				}

				boolean flag=true;

				if((j-1)>=0){

					if(stone[i].charAt(j-1)!='o'){

						flag=false;

					}

				}
				
				if((j+1)<stone[i].length()){

					if(stone[i].charAt(j+1)!='o'){

						flag=false;

					}

				}
				
				if((i-1)>=0){

					if(stone[i-1].charAt(j)!='o'){

						flag=false;

					}

				}
				
				if((i+1)<stone.length){

					if(stone[i+1].charAt(j)!='o'){

						flag=false;

					}

				}
				
				if(flag==true){
					
					cst=cst+Character.getNumericValue(benefit[i].charAt(j));
					
					
				}
				
				
				
			}


		}
		
		
		return cst;


	}

}
