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
