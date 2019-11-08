package com.training1;

import java.util.Scanner;

public class CalulatorServieImpl  implements IcalculatorService{
	/*
	 * Scanner sc =new Scanner(System.in); double x,y,z;
	 */

	public Double addNNum(Double... a) {
		// TODO Auto-generated method stub
		Double sum =0.0;
		for(int i=0; i <a.length; i++) {
			
			sum = sum+a[i];
		}
		return sum;
	}

	public Double multNumber(Double... b) {
		Double mult =1.0;
		for(int i=0; i <b.length; i++) {
			
			mult = mult*b[i];
		}
		return mult;
	}

	public Double DivNumber(Double... c) {
		Double div =1.0;
		for(int i=0; i <c.length; i++) {
			
			div = div/c[i];
		}
		return div;
	}
	}

	
	
	
	
	
	
	
	
	
	/*
	 * public void input() { x=sc.nextDouble(); y=sc.nextDouble();
	 * 
	 * 
	 * 
	 * }
	 * 
	 * public void subtract() { z=x-y;
	 * 
	 * }
	 */
	
	

		
	












