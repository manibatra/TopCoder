package practice;


import java.util.Scanner;

public class Shares {

	/**
	 * @param args
	 */

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int T=s.nextInt();

		for(int x=0; x<T; x++){

			int N=s.nextInt();
			int[] price=new int[N];
			for(int i=0; i<N;i++){

				price[i]=s.nextInt();

			}
			
			int[] highPoint=new int[N];
			
			int max=0;
			
			for(int i=N-1; i>=0;i--){
				if(price[i]>max)
					max=price[i];
				highPoint[i]=max;
				
				
			}
			
			long total=0;
			
			for(int i=0; i<N; i++){
				
				if(price[i]<highPoint[i])
					total+=(highPoint[i]-price[i]);
			}
			
			System.out.println(total);
			
			
		}
			
	}

	

}
