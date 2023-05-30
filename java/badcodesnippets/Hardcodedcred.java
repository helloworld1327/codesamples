package com.eva;

import java.sql.Connection;
import java.sql.DriverManager;

public class Hardcodedcred {
	public void hardcoded() {
		Connection conn = null;
		try {
		  conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
		        "user=steve&password=blue"); // Noncompliant
		  String uname = "steve";
		  String password = "blue";
		  conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
		        "user=" + uname + "&password=" + password); // Noncompliant

		  java.net.PasswordAuthentication pa = new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Noncompliant

	} catch(Exception e) {
		System.out.println("Caught exception");
		}
	}

	public static void main(String[] args) {
		System.out.println("Hardcoded credentials ...");

	}

}
