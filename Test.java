package practice;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {


	public static void main(String[] args){
			
		String x = "";
		
		long start = System.currentTimeMillis();
		
		System.out.println(x);
		
		System.out.println("time when short :"+ (System.currentTimeMillis()-start));
		
		
		for(int i =0; i < 100000; i++){
			
			x+="a";
			
		}
		
		start = System.currentTimeMillis();
		
		System.out.println(x);
		
		System.out.println("time when long : " +(System.currentTimeMillis()-start));
		
		

	}

	public int minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, int[] enemyCount)
	{



		int totalEnemies=0;

		int[] fat=new int[magicalGirlStrength.length];

		Arrays.fill(fat, 0);


		for(int x : enemyCount){

			totalEnemies+=x;

		}

		int cT=totalEnemies;


		for(int i=1; i <=totalEnemies; i++){


			for(int j=0; j<magicalGirlStrength.length; j++ ){

				int cF=magicalGirlStrength[j];
				int maxEnemyPos=-1;

				int max=0;

				for(int k=0; k <enemyStrength.length; k++){

					if(enemyStrength[k]<=cF && enemyStrength[k]>max && enemyCount[k]>0){

						max=enemyStrength[k];
						maxEnemyPos=k;

					}

				}

				if(maxEnemyPos!=-1){
					enemyCount[maxEnemyPos]--;
					fat[j]++;
					cT--;

				}

			}

		}

		if(cT>0)
			return -1;

		int maxFat=0;

		for(int x : fat){

			if(x>maxFat)
				maxFat=x;

		}

		return maxFat;


	}



}