package practice;

import java.text.DecimalFormat;

public class SRM541_Lvl2 {

	public int countAnts(int[] x, int[] y, String direction)
	{

		double[] X=new double[x.length];

		double[] Y=new double[y.length];

		DecimalFormat form = new DecimalFormat("#.#");
		int ptr=0;
		for(int a : x){

			
			X[ptr++]=Double.valueOf(form.format(a));

		}
		
		

		ptr=0;
		for(int a : y){

			Y[ptr++]=a;

		}

		char[] sb=direction.toCharArray();


		for(int i=0; i<=4000;i++){

			for(int j=0; j< x.length; j++){

				if(sb[j]=='N')
					Y[j]=Double.valueOf(form.format(Y[j]+0.5));
				else if(sb[j]=='S')
					Y[j]=Double.valueOf(form.format(Y[j]-0.5));
				else if(sb[j]=='E')
					X[j]=Double.valueOf(form.format(X[j]+0.5));
				else if(sb[j]=='W')
					X[j]=Double.valueOf(form.format(X[j]-0.5));
			}
			
			
			for(int k=0; k<X.length;k++){

				if(sb[k]!='X')
				for(int j=0; j<X.length; j++){

					if(sb[j]!='X')
					if(j!=k){
					if(X[k]==X[j] && Y[k]==Y[j])
					{

						sb[j]='X';
						sb[k]='X';

					}

					

				}
					
				}


			}


		}

		int count=0;
		for(char a : sb){
			System.out.print(a);
			if(a!='X')
				count++;

		}




		return count;

	}
	
}
