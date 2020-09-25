package com.homework;

import java.awt.dnd.DnDConstants;


public class Main {

	public static void main(String[] args) {
		
		
		final String nameOfCompany = "Rosenhof";
		final String dateOfEst = "12.12.2019";
		final String bulstatNumber = "BG12345678";
		
		final String ownerName = "Kiril";
		final double inCapital = 22000.00;
		final double actCapital = 145000.00;
	
	
		Company myCompany = new Company(nameOfCompany, dateOfEst, bulstatNumber);		
		
		System.out.println(myCompany.toString());	
		System.out.println("The length of bulstat is: " + bulstatNumber.length());
		System.out.println("The length of bulstat is: " + myCompany.getBulstat());
	 
		Firma_ET myET = new Firma_ET(nameOfCompany, dateOfEst, bulstatNumber, ownerName, inCapital, actCapital);
		
		System.out.println("The profit is: " + myET.calculateCompanyProfit());
		
		
	}

	

}
