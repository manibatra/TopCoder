package practice;

import java.util.Arrays;


public class InverseHaar1D {

	public static void main(String[] args) {

		InverseHaar1D o = new InverseHaar1D();
		System.out.println(Arrays.toString(o.transform(new int[]{369, 477, 451, 262, 47, 135, 
				 -125, -2, 18, -23, 30, 101, 
				 -5, -18, 54, -20, 11, 45, -5, 
				 70, -24, 2, -50, 15, 55, -62, 
				 -23, -17, 44, -8, -44, -52}, 3)));
	}
	
	
	public int[] transform(int[] transformedData, int L){
		
		
		int[] result = Arrays.copyOf(transformedData, transformedData.length);
		
		return getOriginal(transformedData, L, result);
		
		
	}


	private int[] getOriginal(int[] transformedData, int L, int[] result) {
		
		//base case of the recursion
		if(L==0)
			return result;
		
		//Unchanged array = Total Length - workable length
		int workableLength = (int) (transformedData.length/Math.pow(2, L-1));
		
		//We start moving indices from 0 and divide, to form pairs
		int divide = (workableLength/2);
		
		//So that the result array is not tempered with while performing calcultations
		int[] temp = Arrays.copyOf(result, result.length);
		
		int ptr = 0;
		
		for(int i = 0; i < divide; i++){
			
			int x;
			int y;
			
			//x+y = A, x-y = B => x = A+B/2, y = A-B/2
			x = (temp[i] + temp[divide + i])/2;
			y = (temp[i] - temp[divide + i])/2;
			
			
			result[ptr++] = x;
			result[ptr++] = y;
			
		}
		
		//copying the unchanged data
		int i = 0;
		while(ptr < result.length){
			
			result[ptr++] = temp[workableLength + i];
			i++;
			
		}
		
		//System.out.println(Arrays.toString(result));
		
		return getOriginal(transformedData, L - 1, result);
	}

}
