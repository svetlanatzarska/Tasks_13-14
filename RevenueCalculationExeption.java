package com.homework;

public class RevenueCalculationExeption extends java.lang.Exception {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	RevenueCalculationExeption(String message) {
	super(message);
	}
	
	
	 RevenueCalculationExeption(String message, Throwable error) {
	super(message, error);
	
	}
}