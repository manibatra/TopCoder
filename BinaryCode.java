package practice;


public class BinaryCode {
	
	
public static void main(String[] args) {
		
		BinaryCode test=new BinaryCode();
		String[] result=test.decode("22111");
		
		System.out.println(result[0]+","+result[1]);
		

	}

	
	public String[] decode(String message){
		
		int[] enNumber=stringToNumber(message);
		
		String[] result=decrypt(enNumber);
		
		return result;
		
		
		
	}
	
	
	private String[] decrypt(int[] enNumber){
		
		String[] result=new String[2];
		
		
		int[] deNumber0=new int[enNumber.length];
		
		deNumber0[0]=0;
		if(deNumber0.length>1)
		deNumber0[1]=enNumber[0];
		
		
		
		
		
		for(int i=2; i<deNumber0.length-1;i++){
			
			
			deNumber0[i]=enNumber[i-1]-deNumber0[i]-deNumber0[i-1];
			
			if(!(deNumber0[i]==0 || deNumber0[i]==1)){
				
				
				result[0]="NONE";
				break;
				
			}
			
		}
		if(deNumber0.length>1)
		deNumber0[deNumber0.length-1]=enNumber[enNumber.length-1]-deNumber0[deNumber0.length-2];
		
		if(!(deNumber0[deNumber0.length-1]==0 || deNumber0[deNumber0.length-1]==1)){
			
			
			result[0]="NONE";
			
			
		}
		
		int[] deNumber1=new int[enNumber.length];
		
		deNumber1[0]=0;
		if(deNumber1.length>1)
		deNumber1[1]=enNumber[0]-1;
		
		
		
		
		
		for(int i=2; i<deNumber1.length-1;i++){
			
			
			deNumber1[i]=enNumber[i-1]-deNumber1[i]-deNumber1[i-1];
			if(!(deNumber1[i]==0 || deNumber1[i]==1)){
				
				
				result[1]="NONE";
				break;
				
			}
			
		}
		if(deNumber1.length>1)
		deNumber1[deNumber1.length-1]=enNumber[enNumber.length-1]-deNumber1[deNumber1.length-2];
		
		if(!(deNumber1[deNumber1.length-1]==0 || deNumber1[deNumber1.length-1]==1)){
			
			
			result[1]="NONE";
			
			
		}
		
		
		if(result[0]!="NONE"){
			
			StringBuilder sb=new StringBuilder();
			
			for(int i=0;i<deNumber0.length;i++){
				
				sb.append(deNumber0[i]);
				
			}
			result[0]=sb.toString();
			
		}
		
		
		
		if(result[1]!="NONE"){
			
			StringBuilder sb1=new StringBuilder();
			
			for(int i=0;i<deNumber1.length;i++){
				
				sb1.append(deNumber1[i]);
				
			}
			
			result[1]=sb1.toString();
			
		}
		
		
			
			
			
			
		if(enNumber.length==1){
			
			if(enNumber[0]==0){
				
				result[0]="0";
				result[1]="NONE";
				
			}else if(enNumber[0]==1){
					
					result[0]="NONE";
					result[1]="1";
					
				}else{
					
					result[0]="NONE";
					result[1]="NONE";
					
				}
		
			
		}
		

		
		return result;
		
		
		
	}
	
	
	private int[] stringToNumber(String message){
		
		//System.out.println(message);
		
		
		
		
		int[] encrypted=new int[message.length()];
		
		for(int i=0; i< encrypted.length;i++){
			
			
			encrypted[i]=Character.digit(message.charAt(i),10);
			
			
			
		}
		
		return encrypted;
		
		
	}
	

}
