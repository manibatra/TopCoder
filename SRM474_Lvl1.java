package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;



public class SRM474_Lvl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(new SRM474_Lvl1().isValid(1000000,new int[]{997760, 999502, 996496, 997760, 995162, 999071, 996496, 999071, 996972, 993113, 991680, 999932, 992958, 991963, 995326, 994425, 997635, 996893, 990428, 990428, 995548, 998631, 992796, 990059, 994468, 995162, 995986, 993293, 991205, 996496, 999071, 999932, 994545, 992908, 995986, 996496, 991639, 998631, 992713},"+-+--++---+--+++--+++---++--+-++-++--++"));

		System.out.println(true&false);

	}



	public String isValid(int N, int[] coords, String moves)
	{



		HashSet< TreeMap<Integer, Integer>> visited=new HashSet< TreeMap<Integer, Integer>>();

		TreeMap<Integer, Integer> current=new TreeMap<Integer, Integer>();

		for(int i : coords){

			current.put(i, 0);

		}


		visited.add((TreeMap<Integer, Integer>) current.clone());


		for(int i=0; i < coords.length; i++){

			if(moves.charAt(i)=='+')
				current.put(coords[i], current.get(coords[i])+1);
			else
				current.put(coords[i], current.get(coords[i])-1);
			
			if(visited.contains(current))
				return "NOT VALID";
			
			
			visited.add((TreeMap<Integer, Integer>) current.clone());


		}
		
		return "VALID";








	}







}


