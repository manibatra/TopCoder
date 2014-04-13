package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		int N=s.nextInt();

		int students[]=new int[N];

		for(int i=0; i< N; i++){

			students[i]=s.nextInt();

		}

		int[] candies=new int[N];

		Arrays.fill(candies, 1);

		int low=0;
		int y=students[0];

		for(int j=1; j<N;j++){

			if(y>students[j]){
				low++;
				y=students[j];
			}
			else
				break;

		}

		candies[0]=Math.max(candies[0], 1+low);

		for(int i=1; i<N; i++){

			if(students[i]>students[i-1] && candies[i]<=candies[i-1])
				candies[i]=candies[i-1]+1;

			low=0;
			y=students[i];

			for(int j=i+1; j<N;j++){

				if(y>students[j]){
					low=low+1;
					y=students[j];
				}
				else
					break;

			}


			candies[i]=Math.max(candies[i], 1+low);

		}


		int result=0;

		for(int x : candies){

			result+=x;
		}


		System.out.println(result);






	}

}
