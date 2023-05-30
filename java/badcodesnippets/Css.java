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
