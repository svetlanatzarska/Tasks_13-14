package com.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor


public class Company {

	String name;	
	String dateOfEstanbishment;
	String bulstat;

public Company(String name, String dateOfEstablishment, String bulstat) {
	this.name = name;
	this.dateOfEstanbishment = dateOfEstablishment;
	setBulstat(bulstat);	
}

private void setBulstat(String buls){
	if (buls.length() != 10) {
		throw new IllegalArgumentException();
	}
	else
	{
		this.bulstat = buls;
	}
		
}


public String toString() {
	return "The company's name is: " + name + ", founded in " + dateOfEstanbishment + " with bulstat: " + bulstat + ".";
}



}
