package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class HealthFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//	//TO DO : 'C' = high carbs
	//	'c' = low carbs
	//			'P' = high protein
	//			'p' = low protein
	//			'F' = high fat
	//			'f' = low fat
	//			'T' = high calorie
	//			't' = low calorie

	public class Item implements Comparable<Item> {

		private int index;
		private int value;
		
		public Item(int index, int value){
			this.index = index;
			this.value = value;
		}

		@Override
		public int compareTo(Item i) {
			if(this.value >	i.value) return 1;
			if(this.value < i.value) return 0;
			return 0;
		}



	}

	public int[] selectMeals(int[] protein, int[] carbs, int[] fat, String[] dietPlans) {

		int[] cal = new int[protein.length];

		for(int i = 0; i < cal.length; i++){

			cal[i] = (protein[i] * 5) + (carbs[i] * 5) + (fat[i] * 9);

		}
		
		List<Item> sP = new ArrayList<Item>();
		List<Item> sC = new ArrayList<Item>();
		List<Item> sF = new ArrayList<Item>();
		List<Item> sT = new ArrayList<Item>();

		for(int i = 0; i < protein.length; i++){
			
			sP.add(new Item(i, protein[i]));
			sC.add(new Item(i, carbs[i]));
			sF.add(new Item(i, fat[i]));
			sT.add(new Item(i, cal[i]));


			
		}
		
		Collections.sort(sP);
		Collections.sort(sC);
		Collections.sort(sF);
		Collections.sort(sT);

		int[] result = new int[dietPlans.length];



		for(int i = 0; i < dietPlans.length; i++){

			Vector<Integer> testing = new Vector<Integer>();

			for(int j = 0; j < cal.length; j++)
				testing.add(j);

			result[i] = testThis(sP, sC, sF, sT, dietPlans[i], 0,  testing);


		}

		return result;


	}

	private int testThis(List<Item> sP, List<Item> sC, List<Item> sF,
			List<Item> sT, String dietPlan, int i, Vector<Integer> testing
			) {
		
		Vector<Integer> temp = new Vector<Integer>();
		switch(dietPlan.charAt(i)){

		case 'C':
			findMax(sC, temp);
			break;
		case 'P':
			findMax(sP, temp);
			break;
		case 'F':
			findMax(sF, temp);
			break;
		case 'T':
			findMax(sT, temp);
			break;
			
		case 'c':
			findMin(sC, temp);
			break;
		case 'p':
			findMin(sP, temp);
			break;
		case 'f':
			findMin(sF, temp);
			break;
		case 't':
			findMin(sT, temp);
			break;		

		}
		
		if(temp.size() == 1)
			return temp.get(0);
		
		if(temp.size() > 1 && i < (dietPlan.length() -1)){
			
			List<Item> tsP = new ArrayList<Item>();
			List<Item> tsC = new ArrayList<Item>();
			List<Item> tsF = new ArrayList<Item>();
			List<Item> tsT = new ArrayList<Item>();
			
			for(int j = 0; j < temp.size(); j++){
				
				tsP.add(e)
				
			}

			
			return testThis(sP, sC, sF, sT, dietPlan, i+1, temp );
			
		}

		
		return 0;
	}

	private void findMin(List<Item> list, Vector<Integer> temp) {
		
		int min = list.get(0).value;
		for(Item x : list){
			
			if(min == x.value)
				temp.add(x.index);
			else
				break;
				
		}
		
	}

	private void findMax(List<Item> list, Vector<Integer> temp) {
		
		int max = list.get(list.size() - 1).value;
		Collections.reverse(list);
		for(Item x : list){
			
			if(max == x.value)
				temp.add(x.index);
			else
				break;
				
		}
		Collections.reverse(list);
				
	}



}
