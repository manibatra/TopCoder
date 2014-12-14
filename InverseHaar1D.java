package practice;

import java.util.Arrays;

import javax.xml.crypto.dsig.Transform;

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
		
		if(L==0)
			return result;
		
		int workableLength = (int) (transformedData.length/Math.pow(2, L-1));
		
		int divide = (workableLength/2);
		
		int[] temp = Arrays.copyOf(result, result.length);
		
		int ptr = 0;
		
		for(int i = 0; i < divide; i++){
			
			int x;
			int y;
			
			x = (temp[i] + temp[divide + i])/2;
			y = (temp[i] - temp[divide + i])/2;
			
			
			result[ptr++] = x;
			result[ptr++] = y;
			
		}
		
		int i = 0;
		while(ptr < result.length){
			
			result[ptr++] = transformedData[workableLength + i];
			i++;
			
		}
		
		//System.out.println(Arrays.toString(result));
		
		return getOriginal(transformedData, L - 1, result);
	}

}
