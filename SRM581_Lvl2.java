package practice;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class SRM581_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Integer i1=2;

		Integer i2=2;

		System.out.println(new SRM581_Lvl2().getContainerInfo("-X--XX",new int[]{1,2},3));



	}


	int A[];


	public String getContainerInfo(String c, int[] r, int L)
	{
		A=new int[c.length()];

		int[] m=new int[c.length()];

		char[] res=new char[c.length()];



		Arrays.fill(m, 0);

		Arrays.sort(r);


		


		for(int i=0; i <r.length; i++){

			

			int cameraCount=countCamera(r, r[i]);

			int segmentCount=0;

			if(true){

				for(int j=0; j < c.length(); j++){	

					int count=0;

					int end=j+L-1;

					if(end<c.length())	{
						for(int k=j ; k<=end;k++){

							if(c.charAt(k)=='X')
								count++;

						}
						//System.out.println(count +"  "+r[i]);
						if(count==r[i]){
							
							for(int k=j ; k<=(j+L-1);k++){

								m[k]++;

							}

							segmentCount++;

						}

					}


				}
				
				for(int x: m){
					System.out.print(x+" ");
					
				}
//				
				System.out.println();

				System.out.println(cameraCount+" "+segmentCount);
				
				if(cameraCount>=segmentCount){
					
					for(int x=0; x<m.length; x++){

						if(m[x]!=0){
							res[x]='+';
							
							
							A[x]++;
						}


					}


				}else{
					
					for(int x=0; x<m.length; x++){

						if(m[x]!=0 && res[x]!='+'){
							
							res[x]='?';
							
							A[x]++;
						}


					}

					
					
				}
				
				for(char x : res){
					
					System.out.print(x+" ");
					
				}
				
				System.out.println();


				Arrays.fill(m, 0);

			}

		}
		
		
		for(int i=0; i < A.length; i++){
			
			if(A[i]==0){
				
				res[i]='-';
				
			}
			
			
		}
		
		
		
		
		String result="";
		
		for(char x : res){
			
			result+=x;
			
		}
		
		
		return result;
		
		
		


	}


	private int countCamera(int[] r, int i) {

		int count=0;
		
		System.out.println("i is"+i);

		for(int x : r){

			if(x==i)
				 count++;


		}
		
		System.out.println(count);


		return count;
	}




}
