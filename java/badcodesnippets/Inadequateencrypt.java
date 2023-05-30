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
