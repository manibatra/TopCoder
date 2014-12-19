package practice;

public class MatchCounts {

	public static void main(String[] args){

		System.out.println(howMany(new String[]{"012345","012345","012345","012345","012345","012345"}));

	}

	static int result = 0;


	public static int howMany(String[] ability){


		int person = 0;

		for(int i = 0; i < ability[person].length(); i++){

			String path = ability[person].substring(i, i+1);
			if(person == ability.length -1)
				result++;
			else

				startTree(ability, person, path);


		}

		return result;

	}

	//the solution is good but for comp. program. the variables name should be shorter
	private static void startTree(String[] ability, int person,String path) {

		person++;
		
		if(person==(ability.length -1)){
			for(int i = 0; i < ability[person].length(); i++){

				if(!path.contains(Character.toString(ability[person].charAt(i)))){

					result++;

				}


			}

		} else{

			for(int i = 0; i < ability[person].length(); i++){

				if(!path.contains(Character.toString(ability[person].charAt(i)))){

					
					startTree(ability, person, path+Character.toString(ability[person].charAt(i)));

				}

			}

		}

	}

}
