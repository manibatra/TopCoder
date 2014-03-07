package practice;

public class SRM543_Lvl2 {
	
	public long getXor(long L, long R)
	{
		long a=L;
		
		if(R-L<50){
			
			for(long x=L+1; x<=R; x++){
				
				a^=x;
				
			}
			
			return a;
			
		}
		long[] store=new long[50];
		int ptr=0;
		for(long x=L+1;x<=L+50; x++){
			
			a=a^x;
			//System.out.println(x+"  "+a);
			store[ptr++]=a;
			
		}
		
		int start=0;
		long number=0;
		for(int i=0; i<store.length-4; i++){
			
			if(store[i]==store[i+4]){
				
				start=i;
				number=store[i];
				break;
				
			}
		}
		
		L+=start+1;
		long d=R-L;
		long remaining=d%4;
		
		//System.out.println("\n"+d+"\n\n\n");
		
		for(long x=R-remaining+1; x<=R; x++){
			
			number^=x;
			
			//System.out.println(x+"  "+number);
			
		}
		
		
		
		
		return number;
	}

}
