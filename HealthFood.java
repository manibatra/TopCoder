package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class HealthFood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(new HealthFood().selectMeals(new int[]{18, 86, 76,  0, 34, 30, 95, 12, 21}
		, new int[]{26, 56,  3, 45, 88,  0, 10, 27, 53},
		new int[]{93, 96, 13, 95, 98, 18, 59, 49, 86},
		new String[]{"f", "Pt", "PT", "fT", "Cp", "C", "t", "",
				"cCp", "ttp", "PCFt", "P", "pCt", "cP", "Pc"}
		//Returns: { 2,  6,  6,  2,  4,  4,  5,  0,  5,  5,  6,  6,  3,  5,  6 }



				)));

	}


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
			this.fat = fat;
			this.total = (protein + carbs) * 5 + (fat * 9);


		}

		private int getValue(String element){

			if(element.equals("carbs"))
				return this.carbs;
			else if(element.equals("protein"))
				return this.protein;
			else if(element.equals("fat"))
				return this.fat;
			else 
				return this.total;

		}





	}

	public int[] selectMeals(int[] protein, int[] carbs, int[] fat, String[] dietPlans) {


		List<Item> foods = new ArrayList<Item>();


		for(int i = 0; i < protein.length; i++){


			foods.add(new Item(i, protein[i], carbs[i], fat[i]));


		}



		int[] result = new int[dietPlans.length];



		for(int i = 0; i < dietPlans.length; i++){

			Vector<Integer> testing = new Vector<Integer>();

			for(int j = 0; j < protein.length; j++)
				testing.add(j);
			if(dietPlans[i].length() == 0)
				result[i] = 0;
			else 

				result[i] = testThis(foods, dietPlans[i], 0,  testing);


		}

		return result;


	}

	private int testThis(List<Item> foods, String dietPlan, int i, Vector<Integer> testing
			) {

		Vector<Integer> temp = new Vector<Integer>();

		List<Item> tempFood = new ArrayList<Item>();

		for(int j = 0; j < foods.size(); j++) {

			if(testing.contains(j))
				tempFood.add(foods.get(j));

		}
		switch(dietPlan.charAt(i)){

		case 'C':
			findMax(tempFood, temp, cC, "carbs");
			break;
		case 'P':
			findMax(tempFood, temp, cP, "protein");
			break;
		case 'F':
			findMax(tempFood, temp, cF, "fat");
			break;
		case 'T':
			findMax(tempFood, temp, cT, "total");
			break;

		case 'c':
			findMin(tempFood, temp, cC, "carbs");
			break;
		case 'p':
			findMin(tempFood, temp, cP, "protein");
			break;
		case 'f':
			findMin(tempFood, temp, cF, "fat");
			break;
		case 't':
			findMin(tempFood, temp, cT, "total");
			break;		

		}

		if(temp.size() == 1)
			return temp.get(0);

		if(temp.size() > 1 && i < (dietPlan.length() -1)){



			return testThis(foods, dietPlan, i+1, temp );

		}


		return temp.get(0);
	}

	private void findMin(List<Item> list, Vector<Integer> temp, Comparator<Item> c , String element) {

		Collections.sort(list, c);
		int min = list.get(0).getValue(element);
		//System.out.println("the min is "+ min);
		for(Item x : list){

			if(min == x.getValue(element))
				temp.add(x.index);
			else
				break;

		}	

		Collections.sort(temp);

	}

	private void findMax(List<Item> list, Vector<Integer> temp, Comparator<Item> c ,String element) {

		Collections.sort(list, c);
		Collections.reverse(list);
		int max = list.get(0).getValue(element);
		//System.out.println("The max is "+max);
		for(Item x : list){

			//System.out.println(x.getValue(element));
			if(max == x.getValue(element)){
				temp.add(x.index);

			}
			else
				break;

		}
		Collections.sort(temp);

	}



}
