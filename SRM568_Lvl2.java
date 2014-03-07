package practice;

public class SRM568_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}

	public int minOperations(int[] red, int[] green, int[] blue)
	{
		int result=Integer.MAX_VALUE;
		int boxes=red.length;
		if(boxes<3)
			return -1;


		for(int r=0; r < red.length; r++){


			for(int b=0; b<boxes;b++){


				if(r!=b)
					for(int g=0; g<boxes; g++){

						int moves=0;  

						if(r!=g && b!=g) {
							for(int i=0; i<boxes; i++){



								int cr=green[i]+blue[i];
								int cb=green[i]+red[i];
								int cg=red[i]+blue[i];

								if(i==r)
									moves+=cr;
								else if(i==b)
									moves+=cb;
								else if(i==g)
									moves+=cg;
								else
									moves+=Math.min(cr, Math.min(cg, cb));
							}

							result=Math.min(result, moves);

						}
					}
			}
		}

		return result;
	}

}
