package practice;

import java.util.Arrays;

public class LangfordSequence {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new LangfordSequence().getFirst(new int[]{8, 0, 12, 6, 2, 4, 3, 13})));

	}

	int[] result;

	public int[] getFirst(int[] a) {


		if(a.length == 1)
			return new int[]{};


		this.result = new int[2*a.length];
		Arrays.fill(this.result, -1);

		Arrays.sort(a);

		placeOthers(Arrays.copyOf(result, result.length), a, 0);
		return this.result;



	}

	private void placeOthers(int[] ans, int[] a, int i) {


		for(int x = 0,  y = a[i]+1; x < ans.length && y < ans.length; x++, y++ ){
			//System.out.println(Arrays.toString(ans) + "   "+a[i]);
			int[] temp = Arrays.copyOf(ans, ans.length);

			//System.out.println(x+"  and  "+y);
			if(temp[x] == -1 && temp[y] == -1){
				temp[x] = a[i];
				temp[y] = a[i];

				if(i == (a.length - 1)){
					System.out.println(Arrays.toString(temp));
					if(this.result[0] == -1)
						this.result = temp;
					else if(checkLex( this.result, temp)){
						this.result = temp;

					}


				} else

					placeOthers(Arrays.copyOf(temp, temp.length), a, i+1);


			}	


		}


	}

	private boolean checkLex(int[] result, int[] temp) {

		for(int i = 0; i < result.length; i++){

			if(result[i] != temp[i]){
				if(result[i] > temp[i])
					return true;
				else
					return false;
			}


		}
		return false;
	}


}
