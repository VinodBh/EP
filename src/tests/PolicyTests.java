package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Map;
import java.util.regex.Pattern;


import org.testng.annotations.Test;
import com.gargoylesoftware.htmlunit.javascript.host.dom.AbstractList;

public class PolicyTests extends AbstractList  {
	@Test
	public static void firstTest() {
		//System.setProperty("webdriver.chrome.driver", "D:\\VB\\Jars\\chromedriver1\\chromedriver.exe");
		//WebDriver d = new ChromeDriver();
		//d.get("https:www.google.com");
		//System.out.println("Test End");
		String a = "This is | India";
		String[] b = a.split(Pattern.quote("|"));
		String[] c = a.split("\\|");
		
		System.out.println(b.length);
		System.out.println("c len" + c.length);
		
		for(int i=0; i<=b.length-1; i++) {
			System.out.println(b[i]);
		}
		//d.quit();
	}
	
	public static void main(String[] args) {
		//firstTest();
		//foo();
		////removeDup();
		//num_rev();
		//shapes();
		iteratorTest();
		//System.out.println("try return value = " + tryCatch());
		
	}
	
	
	public static void foo() {
		int i = 1;
		int j = 1;
		int m  = 30;
		int temp = 0;
		while(i<= m) {
			System.out.println(i);
			temp = i + j;
			i= j;
			j=temp;
		}
	}

	
	public static void removeDup() {
		HashSet<Integer> nm = new HashSet<>();
		nm.add(12);
		nm.add(13);
		nm.add(14);
		nm.add(15);
		nm.add(12);
		nm.add(12);
		nm.add(13);
		nm.add(1);
		nm.add(154);
		nm.add(null);
		//HashSet mySet = new HashSet(nm);
		//System.out.println(mySet);
		System.out.println("frequency of 13=" + Collections.frequency(nm, 12));
		try {
		System.out.println("Max in list=" + Collections.max(nm));
		System.out.println("Min in list=" + Collections.min(nm));
		}
		catch(Exception e) {}
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		myMap.put(1, 101);
		myMap.put(2, 101);
		myMap.put(3, 103);
		myMap.put(4, 104);
		myMap.put(4, 104);

		
		ArrayList<Integer> lst = new ArrayList<Integer>(myMap.values());
		System.out.println(lst);
		Set<Integer> set2 = myMap.keySet();
		System.out.println(set2);
		
			
	}
	
	
	
	public static void num_rev() {
		int no = 1230100;
		int t = no;
		int no2 = 0;
		
		while(no > 0) {
			int m = no % 10;
			no2 = no2 * 10 + m;
			no = no /10;
		}

		System.out.println("Reverse no is--" + no2);
		StringBuilder sb = new StringBuilder();
		sb.append("This is India");
		System.out.println(sb.reverse());
		StringBuffer ss = new StringBuffer();
		ss.append("xyz");
		ss.setLength(0);
		ss.append("ABC");
		ss.reverse();
		System.out.println(ss);
		String abc = "01234567890";
		System.out.println(abc.substring(6));
		
		java.util.AbstractList<String> aList = new LinkedList<String>();
		
		aList.add("A");
		aList.add("B");
		aList.add("C");
		aList.add("D");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("zzz");
		list2.add("xxx");
		list2.add("yyy");
		list2.add("yyy");
				
		list2.subList(2, 3);
		System.out.println("Last index of yyy =" + list2.lastIndexOf(null));

		aList.addAll(list2);
		System.out.println("This is sub list--" + aList.subList(1, 5));
		System.out.println("Add all example:-" + aList);
		char[] chars = {'T', 'e', 'c', 'h', 'i', 'e', ' ','D', 'e', 'l', 'i', 'g', 'h', 't'};
		
String string = new String(chars);
System.out.println(string);

Map<String, Integer> myMap2 = new HashMap<String, Integer>();
myMap2.put("test", 102);
myMap2.put("Test", 103);
myMap2.put(null, 101);
System.out.println(myMap2);

	}
	
	
	public static void shapes() {
		
		String shape = "circle";
		if(shape.equals("circle")) {
			Circle c = new Circle();
			c.draw(10, 20, 301);
		}
		else if(shape.equals("Square")) {
			Square s = new Square();
			s.draw(10, 20, 40);
		}
		else {
			System.out.println("not implemented...");
		}
		
		
		Design.clear();
		
	}
	
	public static int tryCatch(){
		try {
			System.out.println("i am in try");
			int i = 10/0;
			System.out.println(i);
			return 10;
		}
		catch(Exception e) {
			System.out.println(e + "in Catch..");
			return 20;
		}
		finally {
			System.out.println("i am in finally");
			//return 30;
			// TODO: handle finally clause
		}
	}
	
	
	public static void iteratorTest() {
			List<String> abc= new ArrayList<>();
			abc.add("a");
			abc.add("b");
			abc.add("c");
			abc.add("d");
		
		 ListIterator<String> itr = abc.listIterator();
		  while(itr.hasNext()) {
			  String t = itr.next().toString();
			 System.out.println(t);
			 if(t.equalsIgnoreCase("c")) {
				 itr.set("cc");
				 itr.add("zz");
			 }
		 }
		 System.out.println(abc);
	}
	
}