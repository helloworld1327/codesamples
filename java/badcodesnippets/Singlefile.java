#Css.java

package com.eva;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Css {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		  String name = req.getParameter("name");
		  PrintWriter out = resp.getWriter();
		  out.write("Hello " + name); // Noncompliant
		}

	public static void main(String[] args) {
		System.out.println("Testing CSS...");

	}

}


#Deserialization.java
package com.eva;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public void deseri() {
		try {
			File file = new File("object.obj");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
			javax.swing.JButton button = (javax.swing.JButton) in.readObject();
			in.close();
			}
		catch(Exception e) {
			System.out.println("Error caught");
		}
	}



	public static void main(String[] args) {
		System.out.println("Deserialization of untrusted data...");

	}

}

#Evalinj.java
package com.eva;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.support.ScriptEngine;
import com.support.ScriptEngineManager;

public class Evalinj {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		  String input = req.getParameter("input");
		  ScriptEngineManager manager = new ScriptEngineManager();
		  ScriptEngine engine = manager.getEngineByName("JavaScript");
		  engine.eval(input); // Noncompliant
		}

	public static void main(String[] args) {
		System.out.println("Eval Injection...");

	}

}

#Hardcodedcred.java
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

#Inadequateencrypt.java
package com.eva;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;

public class Inadequateencrypt {
	public void encrypt() throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
		keyGen.init(64); // Noncompliant

		KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
		keyPairGen.initialize(512); // Noncompliant

	}


	public static void main(String[] args) {
		System.out.println("Inadequate Encyption...");

	}

}

#Missingauth.java
package com.eva;

import com.support.BankAccount;

public class Missingauth {
	public BankAccount createBankAccount(String accountNumber, String accountType,
			String accountName, String accountSSN, double balance) {
			BankAccount account = new BankAccount();
			account.setAccountNumber(accountNumber);
			account.setAccountNumber(accountType);
			account.setAccountOwnerName(accountName);
			account.setAccountOwnerName(accountSSN);
			account.setBalance(balance);

			return account;
			}

	public static void main(String[] args) {
		System.out.println("Missing authentication...");

	}

}

#Nullpointerderef.java
package com.eva;

import java.util.Optional;

public class Nullpointerderef {
	public void Nullpoint() {
		Optional<String> value = this.getOptionalValue();

		// ...

		String stringValue = value.get(); // Noncompliant
		System.out.println(stringValue);


	}

	private Optional<String> getOptionalValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {

	}

}
