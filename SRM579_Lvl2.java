package practice;

public class SRM579_Lvl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(new SRM579_Lvl2().minPresses(new String[]{"ba","a","a","b","ba"}));

		

	}


	public int minPresses(String[] lines)
	{
		StringBuffer buf=new StringBuffer("");

		StringBuffer undo=new StringBuffer("");

		int count=0;
		
		count+=lines[0].length();
		count++;
		buf.append(lines[0]);
		undo.append(lines[0]);

		for(int i=1; i < lines.length ; i++){

			//checking buffer
			int bmax=0;
			System.out.println(count);
			System.out.println(lines[i]);
			for(int j=0; j <lines[i].length(); j++){


				if(lines[i].substring(0, j).equals(buf.toString())){

					bmax++;

				}
			}	
			if(bmax!=0){
				
				count++;
				count+=(lines[i].length()-bmax);
				undo.append(lines[i].substring(bmax+1));
				buf.append(lines[i].substring(bmax+1));
				continue;


			}

			if(bmax==0){
				int fStart=0;
				int fEnd=0;
				int umax=0;
				//System.out.println(undo.toString());
				for(int j=0; j <lines[i].length(); j++){

					int start=0;
					int end=0;
					
					for(int k=0; k<undo.length();k++){


						for(int l=k; l<undo.length();l++){

							start=k;
							end=l;
							//System.out.println(k+","+l);
							//System.out.println(undo.substring(k, l)+"=="+lines[i].substring(0, j));
							

							if(lines[i].substring(0, j).equals(undo.substring(k, l))){	
								
								//System.out.println(undo.substring(k, l));
								if((end-start)>umax){

									fStart=start;
									fEnd=end;
									umax=end-start;

								}
							}


						}

						//System.out.println(fStart+"fff"+fEnd);
					}

					
				}
				
				
				if(umax>1){

					count+=2;
					buf.replace(0, buf.length(), undo.substring(fStart, fEnd));
					//System.out.println(buf.toString());
					count+=(lines[i].length()-buf.length()+1);


				}

				if(umax==0){
					
					//System.out.println("here");
					if(buf.toString()!=""){

						count+=2;

					}

					count+=(lines[i].length()+1);
					undo.append(lines[i]);


				}



			}

		}

		return count;


	}





}
