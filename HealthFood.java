package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	
	Comparator<Item> cP = new Comparator<Item>() {

		@Override
		public int compare(Item i1, Item i2) {
			if(i1.protein > i2.protein) return 1;
			if(i2.protein > i1.protein) return -1;
			return 0;
		}
	};
	
	Comparator<Item> cC = new Comparator<Item>() {

		@Override
		public int compare(Item i1, Item i2) {
			if(i1.carbs > i2.carbs) return 1;
			if(i2.carbs > i1.carbs) return -1;
			return 0;
		}
	};
	
	
	Comparator<Item> cF = new Comparator<Item>() {

		@Override
		public int compare(Item i1, Item i2) {
			if(i1.fat > i2.fat) return 1;
			if(i2.fat > i1.fat) return -1;
			return 0;
		}
	};
	
	Comparator<Item> cT = new Comparator<Item>() {

		@Override
		public int compare(Item i1, Item i2) {
			if(i1.total > i2.total) return 1;
			if(i2.total > i1.total) return -1;
			return 0;
		}
	};
	
	
	

	public class Item {

		private int index;
		private int protein;
		private int carbs;
		private int fat;
		private int total; 
		
		public Item( int index, int protein, int carbs, int fat){
			this.index = index;
			this.protein = protein;
			this.carbs = carbs;
			this.total = (protein + carbs) * 5 + (fat * 9);
			
			
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
