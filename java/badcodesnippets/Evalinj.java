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
