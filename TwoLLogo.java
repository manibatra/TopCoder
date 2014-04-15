package practice;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class TwoLLogo
{
	
	public long countWays(String[] grid)
	{
		//length set as 900 to account for each point in the grid
		//x and y to store the x and y coordinate of a point
		int[] x = new int[900];
		int[] y = new int[900];
		//to store the max valid height and width possible at the point
		int[] maxH= new int[900];
		int[] maxW = new int[900];
		
		//ptr is the common id in all of the above arrays
		int ptr = 0;
		for(int a = 0; a < grid.length; a++){
			
			for(int b = 0; b < grid[0].length(); b++){
				
				if(grid[a].charAt(b) == '.'){
					
					int i = 0;
					
					while((a-i) > 0 && grid[a-i].charAt(b) != '#'){
						i++;
						
					}
					maxH[ptr] = i;
					i = 0;
					while((b+i) < grid[0].length() && grid[a].charAt(b+i) != '#'){
						i++;
					}
					maxW[ptr]=i;
					i=0;
					if(maxH[ptr] > 1 && maxW[ptr] > 1){
						
						x[ptr] = a;
						y[ptr] = b;
						ptr++;
						
					}
				}
				
				
			}
			
		}
		
		
		
		
		return 0;
		
	}
	
	

	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String[] p0, boolean hasAnswer, long p1) {
		System.out.print("Test " + testNum + ": [" + "{");
		for (int i = 0; p0.length > i; ++i) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print("\"" + p0[i] + "\"");
		}
		System.out.print("}");
		System.out.println("]");
		TwoLLogo obj;
		long answer;
		obj = new TwoLLogo();
		long startTime = System.currentTimeMillis();
		answer = obj.countWays(p0);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + p1);
		}
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		if (hasAnswer) {
			res = answer == p1;
		}
		if (!res) {
			System.out.println("DOESN'T MATCH!!!!");
		} else if ((endTime - startTime) / 1000.0 >= 2) {
			System.out.println("FAIL the timeout");
			res = false;
		} else if (hasAnswer) {
			System.out.println("Match :-)");
		} else {
			System.out.println("OK, but is it right?");
		}
		System.out.println("");
		return res;
	}
	public static void main(String[] args) {
		boolean all_right;
		all_right = true;
		
		String[] p0;
		long p1;
		
		// ----- test 0 -----
//		p0 = new String[]{"....","...."};
//		p1 = 1L;
//		all_right = KawigiEdit_RunTest(0, p0, true, p1) && all_right;
//		// ------------------
//		
////		// ----- test 1 -----
//		p0 = new String[]{".##..","...#.",".#.#.","#...#"};
//		p1 = 3L;
//		all_right = KawigiEdit_RunTest(1, p0, true, p1) && all_right;
////		// ------------------
////		
////		// ----- test 2 -----
//		p0 = new String[]{"..#.","#.#.","....","..#."};
//		p1 = 4L;
//		all_right = KawigiEdit_RunTest(2, p0, true, p1) && all_right;
////		// ------------------
////		
////		// ----- test 3 -----
//		p0 = new String[]{"..",".."};
//		p1 = 0L;
//		all_right = KawigiEdit_RunTest(3, p0, true, p1) && all_right;
////		// ------------------
////		
////		// ----- test 4 -----
//		p0 = new String[]{".#.#","....",".#.#","...."};
//		p1 = 34L;
//		all_right = KawigiEdit_RunTest(4, p0, true, p1) && all_right;
////		// ------------------
////		
////		// ----- test 5 -----
//		p0 = new String[]{"##############","##############","#.############","#.############","#.############","#.############","#.############","#.############","#.#####.######","#.#####.######","#.#####.######","#....##.######","#######.######","#######.######","#######.######","#######.######","#######.######","#######.######","#######......#","##############"};
//		p1 = 1350L;
//		all_right = KawigiEdit_RunTest(5, p0, true, p1) && all_right;
////		// ------------------
////		
////		// ----- test 6 -----
//		p0 = new String[]{"#......",".#....#",".#.#...","#....#.",".##..#.",".#.....",".....#.",".#.#...",".#...#.","..##..."};
//		p1 = 2386L;
//		all_right = KawigiEdit_RunTest(6, p0, true, p1) && all_right;
//		// ------------------
//		
//		// ----- test 7 -----
		p0 = new String[]{"...#..........................","..............................","..............................","..................#...#.......","..................#...........","..............................","...........#..................","..............................",".....#..#.....................",".......................#......","..................#.....#.....","..............................","..............................","..............................","..............................","..#...........................","..............................","..............................","..............................","#............................#","..............................",".....#.........#............#.","..............................",".........................#....",".#............................",".............#................","..............................","..............................",".......................#......",".............#................"};
		p1 = 5020791386L;
		all_right = KawigiEdit_RunTest(7, p0, true, p1) && all_right;
//		// ------------------
//		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
