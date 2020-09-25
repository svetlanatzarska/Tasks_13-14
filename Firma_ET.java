package com.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor



public class Firma_ET extends Company {
	

	private String nameOfOwner;
	private double initialCapital;
	private double actualCapital;
	
public Firma_ET(String name, String dateOfEstablishment, String bulstat, String nameOfOwner, double initialCapital, double actualCapital) 
{
	super(name, dateOfEstablishment, bulstat);
	this.nameOfOwner = nameOfOwner;
	this.initialCapital = initialCapital;
	this.actualCapital = actualCapital;	
	
}

protected double calculateCompanyProfit() {
	double calculateProfit = (this.actualCapital - this.initialCapital);
	return calculateProfit;
}
//ZADACHA 14

public int calculateRevenueForPeriod(String calculationPeriodInDays, int revenueForPeriod) throws RevenueCalculationExeption { 
	 	int result = 0;
	try{
		int stringConvertToInt = Integer.parseInt(calculationPeriodInDays);
		result = (revenueForPeriod / stringConvertToInt);
} 
	catch(NumberFormatException e) {
		System.out.println("You entered an invalid NUMBER " + e.fillInStackTrace());
//		throw new RevenueCalculationExeption("You entered an invalid integer number",e);
}
	catch(ArithmeticException ae) {
		System.out.println("Devide by zero is not allowed " + ae.fillInStackTrace());	
		throw new RevenueCalculationExeption("Devide by zero is not allowed.You have an arithmetics fault.",ae);
}
	return 0;
}

public int calculateRevenueForPeriod1(String calculationPeriodInDays, int revenueForPeriod) { 
	 	int result = 0;
	 	
	 	if (isNumber(calculationPeriodInDays)) {
	 		
	 		int stringConvertToInt = Integer.parseInt(calculationPeriodInDays);
	 		
	 		if (stringConvertToInt != 0) {
	 			result = (revenueForPeriod / stringConvertToInt);	 		
	 		}
	 	}				
		
		return result;
}

	private boolean isNumber(String s) {
		return s.matches("[0-9]+(,[0-9]+)*,?");
	}

}
			




