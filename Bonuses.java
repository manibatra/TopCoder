package practice;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class Bonuses {
	
	
	public static void main(String args[]){
		
		System.out.println(((float)10/(float)3));
		
		Bonuses oye=new Bonuses();
		
		int bonus[]={485, 324, 263, 143, 470, 292, 304, 188, 100, 254, 296,
				 255, 360, 231, 311, 275,  93, 463, 115, 366, 197, 470};
		int[] emp=oye.getDivision(bonus);
		
		System.out.println();
		
		for(int i: emp){
			
			System.out.print(i+" ");
			
		}
		
		
	}
	
	public int[] getDivision(int[] bonus){
		
		
		
		int[] employees=new int[bonus.length];
		
		float totalBonus=sum(bonus);
		
		float[] percent=percentCut(bonus, totalBonus);
		
		
		
		employees=truncate(percent);
		
		
		
		
		
		int trunSum=(int) sum(employees);
		
		int diff=100-trunSum;
		
		
		employees=giveBonus(diff, employees, bonus);
		
		return employees;
		
		
	}

	

	private int[] giveBonus(int diff, int[] employees, int[] bonus) {
		
		
		System.out.println(diff);
		
		for(int i: employees){
			
			System.out.print(i+" ");
			
		}
		
		
		int[] fEmp=new int[employees.length];
		
		int max=0;
		int highest=0;
		
	for(int j=1; j<=diff; j++){	
		
		for(int i=0; i< bonus.length; i++){
			
			
			if(bonus[i]>max){
				
				max=bonus[i];
				
				highest=i;
				
			}
			
			
		}
		
		
		
		fEmp[highest]=employees[highest]+1;
		
		bonus[highest]=0;
		employees[highest]=0;
		
		max=0;
		
	}
	
	
	for(int i=0; i< employees.length; i++){
		
		if(employees[i]!=0){
			
			fEmp[i]=employees[i];
			
		}
		
		
	}
		
		
		
		return fEmp;
	}



	private int[] truncate(float[] percent) {
		
		int[] truncatedPercent=new int[percent.length];
		
		for(int i=0; i< percent.length; i++){
			
			truncatedPercent[i]=(int) percent[i];
			
		}
		
		return truncatedPercent;
	}



	private float[] percentCut(int[] bonus, float totalBonus) {
		
		float[] percent=new float[bonus.length];
		
		for(int i=0; i<percent.length; i++){
			
			
			percent[i]=(float)(bonus[i]/totalBonus)*100;
			
			
		}
		
		
		return percent;
	}

	private float sum(int[] bonus) {
		
		float sum=0;
		
		for(int i: bonus){
			
			sum+=i;
			
		}
		
		return sum;
	}
	
	

}
