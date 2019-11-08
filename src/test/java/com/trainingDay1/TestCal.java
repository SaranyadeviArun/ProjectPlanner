package com.trainingDay1;

import java.util.Scanner;

import org.junit.Test;

import com.training1.IcalculatorService;
import com.training1.CalulatorServieImpl;

import junit.framework.Assert;

public class TestCal {

	IcalculatorService calServ = new CalulatorServieImpl();

	
	  @Test
	  public void TestAddCal() 
	  { Double num1 = -45.0;
	  Double num2 = -45.0;
	  Double num3 = 55.0; 
	  Double num4= -5.0; 
	  Double num5=5.0; 
	  Double expecedOutput= -145.0;
	  Double actualresult=calServ.addNNum(num1,num2,num3,num4,num5);
	  Assert.assertEquals(expecedOutput, actualresult); }
	 

	@Test
	public void TestMultCal() {
		Double num11 = 5.0;
		Double num22 = 5.0;
		Double num33 = 5.0;
		Double num44 = -5.0;
		Double expecedOutput1 = -625.0;
		Double actualresult1 = calServ.multNumber(num11, num22, num33, num44);
		Assert.assertEquals(expecedOutput1, actualresult1);
	}
	
	
	
	@Test
	public void TestDivCal() {
		Double num11 = 10.0;
		Double num22 = 5.0;
	   Double expecedOutput1 = 2.0;
		Double actualresult1 = calServ.DivNumber(num11, num22);
		Assert.assertEquals(expecedOutput1, actualresult1);
	}
      
	/*
	 * @Test public void TestSubstract() { Double num11 = 15.0; Double num22 = 5.0;
	 * Double expecedOutput1 = 10.0; Double actualresult1 = calServ.subtract();
	 * Assert.assertEquals(expecedOutput1, actualresult1); }
	 */
	
	
}
