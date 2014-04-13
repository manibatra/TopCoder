package practice;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class VerticalSticks {

	/**
	 * @param args
	 */
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner s=new Scanner(System.in);
		
		int T=s.nextInt();
		
		for(int c=0; c<T;c++){
		
		int N=s.nextInt();
		
		int[] sticks=new int[N];
		
		for(int i=0; i<N; i++){
			
			sticks[i]=s.nextInt();
			
		}
		
		
		
		int[] k=new int[N];
		
		for(int i=0; i<N; i++){
			
			int count=0;
			int fixed=sticks[i];
			
			for(int j=0; j<N;j++){
				
				if(sticks[j]>=fixed)
					count++;
				
			}
			
			k[i]=count+1;
			
		}
		
		int n=N+1;
		
		float result=0;
		
		for(int x: k)
			System.out.println(x);
		
		for(int i=0; i<k.length;i++){
			
			result+=(n/(float)k[i]);
			
		}
		
		System.out.println(new DecimalFormat(".##").format(result));
		
		
		}

			
		
	}

}
