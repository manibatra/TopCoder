package practice;

import java.util.Arrays;

public class SRM580_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new SRM580_Lvl2().getmax(new int[]{2, 3, 3, 3, 3, 2}, 
													new int[]{1, 2, 2, 4, 4, 6}));
		

	}

	boolean used[];

	public int getmax(int[] l, int[] t)
	{

		int res=0;
		used=new boolean[l.length];
		Arrays.fill(used, false);
		int max=Integer.MIN_VALUE;
		for(int x : t){

			if(x>max)
				max=x;
		}
		res+=getFish(l, t, max);
		for(boolean x : used)
			System.out.print(x);
		System.out.println();
		res+=getFish(l, t, max);
		for(boolean x : used)
			System.out.print(x);
		System.out.println();
		return res;

	}

	private int getFish(int[] l, int[] t,int max) {

		boolean[] xyz=new boolean[used.length];
		System.arraycopy(used, 0, xyz, 0, used.length);
		int res=0;
		for(int i=0; i<=100; i++){
			int count=0;
			boolean[] tmpUsed=new boolean[used.length];
			System.arraycopy(xyz, 0, tmpUsed, 0, used.length);
			for(int j=0; j<t.length; j++){
				if(tmpUsed[j]==false)	{
					if(i>=t[j] && i<=t[j]+l[j]){
						count++;
						tmpUsed[j]=true;
					}
				}
			}
			if(count>res){
				System.out.println(i);
				res=count;
				System.arraycopy(tmpUsed, 0, used, 0, used.length);
			}
		}
		return res;

	}

}
