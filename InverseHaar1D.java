package practice;

import javax.xml.crypto.dsig.Transform;

public class InverseHaar1D {

	public static void main(String[] args) {

		InverseHaar1D o = new InverseHaar1D();
		System.out.println(o.transform(new int[]{101, -53}, 1));
	}
	
	
	public int[] transform(int[] transformedData, int L){
		
		int N = transformedData.length;
		
		int[] result = new int[N];
		
		return getOriginal(transformedData, L, result);
		
		
	}


	private int[] getOriginal(int[] transformedData, int L, int[] result) {
		
		if(L==0)
			return result;
		
		int workableLength = (int) (transformedData.length/Math.pow(2, L-1));
		
		int divide = (workableLength/2);
		
		int ptr = 0;
		
		for(int i = 0; i < divide; i++){
			
			int x;
			int y;
			
			x = (transformedData[i] + transformedData[divide + i])/2;
			y = (transformedData[i] - transformedData[divide + i]/2);
			
			
			result[ptr++] = x;
			result[ptr++] = y;
			
		}
		
		return getOriginal(transformedData, L - 1, result);
	}

}
