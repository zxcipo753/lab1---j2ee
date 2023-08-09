//package com.avtech.j2ee.lab2;

/**
    ---------------------------------------------------------------------------------------
	Filename:   MortgagePayment.java
	Purpose:    Calculate and display the montly payment amount
	            	to fully amortize a $200,000.00 loan over a 30
	            	year term at 5.75% interest
    ---------------------------------------------------------------------------------------
*/


// Import statements
// ------------------
import java.io.*;             //for system input and output
import java.text.*;	    //for handling text, dates and formatting numbers and messages

public class MortgagePayment
{
  public static void main (String[] args) throws IOException
  {
	//declare variables
	//------------------
	double principal, rate, years, months, monthlyInterest, monthlyPayment;
	//BufferedReader lineIn= new BufferedReader(new InputStreamReader(System.in));

	//Setup up formatting for the monthly payment (round to two decimal places)
	//-------------------------------------------------------------------------
	DecimalFormat twoDigits = new DecimalFormat("$#,000.00");

	//Set variables for calculation, this will later be
	//provided by the user input
	//--------------------------------------------------
	principal = 200000.00;
	rate = 5.75;
	years = 30;
	months = 30 * 12.0;
	monthlyInterest = rate / (12 * 100);

	//Calculate the monthly payment
	//---------------------------------------------------
	monthlyPayment = principal * (monthlyInterest / (1 - Math.pow((1 + monthlyInterest),(months * -1))));
	


	//screen display and prompts
	//---------------------------
	System.out.println();
	System.out.println("\tMortgage Calculator");
	System.out.println("\t=====================================");
	System.out.println();
	System.out.println("\tPrincipal:\t\t" + twoDigits.format(principal));
	System.out.println("\tInterest Rate:\t\t" + rate + "%");
	System.out.println("\t# of Years:\t\t" + years);
	System.out.println();
	System.out.println("\t=====================================");
	System.out.println();
	System.out.println("\tMonthly Payment:\t" + twoDigits.format(monthlyPayment));
	System.out.println();



  }  //end of main

} //end of class
