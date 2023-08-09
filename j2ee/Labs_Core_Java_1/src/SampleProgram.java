package com.avtech.j2ee.lab2;

/**
    ---------------------------------------------------------------------------------------
	Filename:   SampleProgram.java
	Purpose:    This is a sample Java program.
    ---------------------------------------------------------------------------------------
*/


// Import statements
// ------------------
import java.util.Date;             //for system input and output
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SampleProgram
{
  public static void main (String[] args)
  {
	//declare variables
	//------------------

	Date today = new Date();

	// Get system properties
	String username = System.getProperty("user.name");
	String os = System.getProperty("os.name");

	// Get current user directory
	String userDir = System.getProperty("user.dir");

	// Get JAVA_HOME from environment variables
	// String javaHome = System.getenv("JAVA_HOME");

	//screen display
	//---------------------------
	System.out.println();
	System.out.println("\t\tProjec No.1 (Java)");
	System.out.println("\t======================================");
	System.out.println();
	System.out.println("\tToday is: " + today);
	System.out.println("\tUsername: " + username);
	System.out.println("\tOperating System: " + os);
	System.out.println("\tCurrent User Directory: " + userDir);
	//System.out.println("\tJAVA_HOME: " + javaHome);
	System.out.println();
	System.out.println("\t======================================");
	System.out.println();

  }  //end of main

} //end of class
