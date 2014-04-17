package practice;

import java.util.*;

public class HeightCalculator {

	/**
	 * This method takes a (non-null) List of platform positions and returns a
	 * (non-null) map from each of those platform positions to a list of
	 * positions, as described in the assignment handout, representing
	 * subsegments of the platform and their propping heights. See the
	 * assignment handout for details.
	 * 
	 */

	static Map<Position, List<Position>> result ;


	public static Map<Position, List<Position>> getProppingHeights(
			List<Position> platforms) {

		result = new HashMap<Position, List<Position>>();


		for(int i = 0; i < platforms.size(); i++) {

			List<Position> temp = new ArrayList<Position>();

			temp.add(platforms.get(i));

			for(int j = 0; j < platforms.size(); j++ ){


				if(intersects(platforms.get(i), platforms.get(j))) {

					temp.add(platforms.get(j));

				}

			}

			findResult(temp);


			temp.clear();

		}

		//declaring a store for the intervals and the heights at which the platforms are present in those intervals
		return result;


	}

	private static void findResult(List<Position> temp) {

		trim(temp);

		List<Position> ans = new ArrayList<Position>();

		Position current = temp.get(0);

		temp.remove(0);

		Position startProp = new Position(current.start(), current.end(), 0);
		Position endProp = new Position(current.start(), current.end(), 0);


		while(startProp.start() != current.end()) {


			double currHeight = startProp.height();
			boolean changed = false;
			for(Position x : temp) {

				if(x.start() <= endProp.start() && x.end() > startProp.start() && x.height() > currHeight) {
					endProp = new Position(x.start() < startProp.start() ? startProp.start() : x.start(), x.end(), x.height());
					currHeight = endProp.height();
					changed = true;
				}

			}

			if(changed)
			startProp = endProp;

			endProp = new Position(startProp.end() , current.end(), 0);
			

			currHeight = startProp.height();
			for(Position x : temp) {

				if(x.start() <= endProp.start() && x.end() > startProp.start() && x.height() > currHeight) {

			
						endProp = new Position(x.start(), x.end(), x.height());
						currHeight = endProp.height();
						
				}

			}


			ans.add(new Position(startProp.start(), endProp.start(), current.height() - startProp.height()));


			startProp = endProp;
			endProp = new Position(startProp.end() , current.end(), 0);




		}

		result.put(current, ans);

	}



	private static void trim(List<Position> temp) {


		Position current = temp.get(0);

		for(int i = 1; i < temp.size(); i++) {

			Position change = temp.get(i);
			if(temp.get(i).start() < current.start()){

				temp.remove(i);
				temp.add(i, new Position(current.start(), change.end(), change.height()));

			}

			change = temp.get(i);
			if(temp.get(i).end() > current.end()){

				temp.remove(i);
				temp.add(i, new Position(change.start(), current.end(), change.height()));

			}


		}



	}

	private static boolean intersects(Position position, Position position2) {
		
		if(position.start() == position2.start() && position.end() == position2.end() && position2.height() < position.height())
			return true;

		if(position2.start() > position.start() && position2.start() < position.end() && position2.height() < position.height())
			return true;

		if(position2.end() > position.start() && position2.end() < position.end() && position2.height() < position.height())
			return true;

		if(position.start() > position2.start() && position.start() < position2.end() && position2.height() < position.height())
			return true;

		if(position.end() > position2.start() && position.end() < position2.end() && position2.height() < position.height())
			return true;


		return false;
	}


}
