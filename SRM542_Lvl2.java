package practice;

public class SRM542_Lvl2 {
	
	public int countRoutes(int X, int Y, int minT, int maxT)
	{
		
		long result=0;
		long[] distx = new long[20005];
		long[] disty=new long[20005];
		
		for(int i=0; i<X; i++){
			
			distx[i]=(X-i)*(i-1);
			
		}
		
		for(int j=0; j<Y; j++){
			
			disty[j]=(Y-j)*(j-1);
			
		}
		
		distx[0]=0;
		disty[0]=0;
		
		for(int i=0; i<X; i++){
			
			for(int j=0; j<Y; j++){
				
				if(2*(i+j)>=minT && 2*(i+j)<=maxT){
					
					result+=(distx[i]*disty[j])%1000000007;
					
				}
				
			}
			
		}
		
		result*=6%1000000007;
		
		
		
		return (int)(result%1000000007);
	}

}
