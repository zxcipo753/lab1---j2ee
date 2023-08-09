//package com.avtech.j2ee.lab2;

/**
    ---------------------------------------------------------------------------------------
	Filename:   SampleProgram.java
	Purpose:    This is a sample Java program.
    ---------------------------------------------------------------------------------------
*/


// Import statements
// ------------------
import java.util.Date;             //for system input and output

public class SampleProgram
{
  public static void main (String[] args)
  {
	//declare variables
	//------------------
	Date today = new Date();

	//screen display
	//---------------------------
	System.out.println();
	System.out.println("\t\tSample Java Program");
	System.out.println("\t======================================");
	System.out.println();
	System.out.println("\tToday is: " + today);
	System.out.println();
	System.out.println("\t======================================");
	System.out.println();

  }  //end of main

} //end of class
