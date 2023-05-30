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
