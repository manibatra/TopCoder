package practice;

import java.util.Arrays;

import org.omg.CORBA.INTF_REPOS;

public class SRM558_Lvl2 {

	/**
	 * @param args
	 */

	final static int MAX=1000000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(4 & 2);
		System.out.println(new SRM558_Lvl2().getMinimumCost("R*RR*GG", 2, 4));

	}

	public int getMinimumCost(String desiredColor, int stampCost, int pushCost)
	{

		int N=desiredColor.length();

		int cost[]=new int[N+1];

		int a[]=new int[N];

		for(int i=0; i < N; i++){

			if(desiredColor.charAt(i)=='*') a[i]=7;
			if(desiredColor.charAt(i)=='R') a[i]=1;
			if(desiredColor.charAt(i)=='G') a[i]=2;
			if(desiredColor.charAt(i)=='B') a[i]=4;
		}

		int res=MAX;

		for(int len=1; len <=N; len++){

			Arrays.fill(cost, MAX);
			cost[0]=0;
			
			System.out.println(len);

			for(int i=0; i < N; i++){

				int color=7;

				for(int j=i; j <N; j++){

					color&=a[j];
					if(color==0) break;
					int seg=j-i+1;
					if(seg < len) continue;
					if(cost[i]!=MAX){

						cost[j+1]=Math.min(cost[j+1], cost[i]+((seg+len-1)/len));
						System.out.println(i);
						for(int x : cost){
							
							System.out.print(x+" ");
							
						}
						System.out.println();
						
					}



				}



			}
			if(cost[N]!=MAX)
				res=Math.min(res, (cost[N]*pushCost)+len*stampCost);	

		}

		return res;

	}



}
