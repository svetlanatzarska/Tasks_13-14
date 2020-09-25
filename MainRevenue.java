package com.homework;

public class MainRevenue {

	public static void main(String[] args) throws RevenueCalculationExeption {
		// TODO Auto-generated method stub
		
		
		Firma_ET myRevenue = new Firma_ET();
		
//		System.out.println(myRevenue.calculateRevenueForPeriod("350days", 150700));
//		System.out.println(myRevenue.calculateRevenueForPeriod("0", 150700));
		
		System.out.println(myRevenue.calculateRevenueForPeriod1("10", 150700));
//		System.out.println(myRevenue.calculateRevenueForPeriod1("0", 150700));
	}
	
	
}
