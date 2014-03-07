package practice;

public class SRM538_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new SRM538_Lvl2().isItPossible(new int[]{-810742, 891236, -289982, -85908, -982879, -364693, 67597, 818999, 279107, 680495, -15920, -604831, 672008, -350753, 327724, 856926, -206005, -622313, -901344, -95596, 56939, 383652, 809353}, 
				new int[]{-237539, 249059, -667713, -412437, -619724, -674852, -527180, 478060, 107903, 567445, -275069, 266734, 189532, -746286, -209320, 122682, -266570, 560819, -360160, -982565, 325096, -682556, -514348}, 0));



	}
	
	public String isItPossible(int[] x, int[] y, int wantedParity)
	{
		
		
		int sum=0;
		
		for(int i=0; i< x.length; i++){
			
			sum=Math.abs(x[i])+Math.abs(y[i]);
			if(sum%2==wantedParity)
				return "CAN";
			
			
			
		}
		
		return "CANNOT";
		
	}

}
