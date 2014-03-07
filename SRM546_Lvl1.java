package practice;

public class SRM546_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}

	public String describeIntersection(int[] A, int[] B)
	{

		int[] cA={A[0],A[1],A[2],A[1],A[2],A[3],A[0],A[3]};
		int[] cB={B[0],B[1],B[2],B[1],B[2],B[3],B[0],B[3]};
		
		
			if(A[1]>B[1] && A[2]<=B[3]){



			if((B[0]>=A[0] && B[0]<=A[2]) || (A[0]>=B[0] && A[0]<=B[2]))
				return "rectangle";
			


		}

		if(B[1]>A[1] && B[2]<=A[3]){



			if(B[0]>=A[0] && B[0]<=A[2])
				return "rectangle";



		}
		
		if(A[3]==B[1] || A[1]==B[3])
			if((A[0]>=B[0] && A[2]<=B[2]) || (B[0]>=A[0] && B[2]<=A[2]))
				return "segment";
		
		if(A[0]==B[2] || A[2]==B[0])
			if((B[0]>=A[0] && B[2]<=A[2]) || (A[0]>=B[0] && A[2]<=B[2]))
				return "segment";
		
		
		
		
		for(int i=0; i<cA.length; i+=2){
		
			for(int j=0; j<cA.length; j+=2){
			
				if(cA[i]==cB[j]&&cA[i+1]==cB[j+1])
					return "point";
				
			}
			
		}

		
		
		
		return "none";

	}



}


