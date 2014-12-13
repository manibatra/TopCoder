package practice;

public class FlowerGardens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int [] getOrdering ( int []height, int [] bloom, int [] wilt ){
		
		int[] result = new int[height.length];
		boolean[] used = new boolean[height.length];
		
		for(int i=0; i < result.length; i++){
			
			int currentMax = -1;
			int currentMaxPos = -1;
			
			for(int j = 0; j < height.length; j ++){
				
				if(!used[j] && height[j] > currentMax){
					boolean blocked = false;
					
					for(int k = 0; k < height.length && !blocked;k++){
						
							if(height[j] > height[k]) {
								
								if(wilt[k] >= bloom[j] && bloom[k] <= wilt[k])
									blocked = true;
								
							}
						
						
					}
					
					if(!blocked){
						
						if(height[j] > currentMax){
							currentMax = height[j];
							currentMaxPos = j;
						
						}	
				
					}
				
			
			
			
			
				}
				result[i]=currentMax;
				used[currentMaxPos] = true;
		
			}

		}
		
		
		return result;
		
	}
	
}	
