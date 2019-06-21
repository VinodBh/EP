package main;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {
	public static void main(String[] args) {
	TestNG tn = new TestNG();
	List<String> suites = new ArrayList();
	suites.add("testng.xml");
	tn.setTestSuites(suites);
	tn.run();
	}
}
