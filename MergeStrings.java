package practice;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class MergeStrings
{
	
	
	public String getmin(String S, String A, String B)
	{

		
		
		return null;
	}
	
	
	
	// BEGIN KAWIGIEDIT TESTING
	// Generated by KawigiEdit 2.1.4 (beta) modified by pivanof
	private static boolean KawigiEdit_RunTest(int testNum, String p0, String p1, String p2, boolean hasAnswer, String p3) {
		System.out.print("Test " + testNum + ": [" + "\"" + p0 + "\"" + "," + "\"" + p1 + "\"" + "," + "\"" + p2 + "\"");
		System.out.println("]");
		MergeStrings obj;
		String answer;
		obj = new MergeStrings();
		long startTime = System.currentTimeMillis();
		answer = obj.getmin(p0, p1, p2);
		long endTime = System.currentTimeMillis();
		boolean res;
		res = true;
		System.out.println("Time: " + (endTime - startTime) / 1000.0 + " seconds");
		if (hasAnswer) {
			System.out.println("Desired answer:");
			System.out.println("\t" + "\"" + p3 + "\"");
		}
		System.out.println("Your answer:");
		System.out.println("\t" + "\"" + answer + "\"");
		if (hasAnswer) {
			res = answer.equals(p3);
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
		
		String p0;
		String p1;
		String p2;
		String p3;
		
		// ----- test 0 -----
		p0 = "??CC??";
		p1 = "ABC";
		p2 = "BCC";
		p3 = "ABCCBC";
		all_right = KawigiEdit_RunTest(0, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 1 -----
		p0 = "WHAT?";
		p1 = "THE";
		p2 = "WA";
		p3 = "";
		all_right = KawigiEdit_RunTest(1, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 2 -----
		p0 = "PARROT";
		p1 = "PARROT";
		p2 = "";
		p3 = "PARROT";
		all_right = KawigiEdit_RunTest(2, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 3 -----
		p0 = "???????????";
		p1 = "AZZAA";
		p2 = "AZAZZA";
		p3 = "AAZAZZAAZZA";
		all_right = KawigiEdit_RunTest(3, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		// ----- test 4 -----
		p0 = "????K??????????????D???K???K????????K?????K???????";
		p1 = "KKKKKDKKKDKKDDKDDDKDKK";
		p2 = "KDKDDKKKDDKDDKKKDKDKKDDDDDDD";
		p3 = "KDKDKDKKKDDKDDKKKDKDKKDKDDDKDDDKKDKKKDKKDDKDDDKDKK";
		all_right = KawigiEdit_RunTest(4, p0, p1, p2, true, p3) && all_right;
		// ------------------
		
		if (all_right) {
			System.out.println("You're a stud (at least on the example cases)!");
		} else {
			System.out.println("Some of the test cases had errors.");
		}
	}
	// END KAWIGIEDIT TESTING
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
