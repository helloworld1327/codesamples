package com.eva;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Urlredirection {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		  String location = req.getParameter("url");
		  resp.sendRedirect(location); // Noncompliant
		} 

	public static void main(String[] args) {
		System.out.println("URL Redirection to Untrusted Site ...");

	}

}
