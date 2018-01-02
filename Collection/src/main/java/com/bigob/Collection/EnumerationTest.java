package com.bigob.Collection;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		List<Integer> vector=new Vector<>(Arrays.asList(2,4,5,3,5,7,8,4,3,9));
		Enumeration<Integer> enumeration=((Vector<Integer>)vector).elements();
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		System.out.println("Enumeration iteration is fail-safe "
				+ "\n it has 2 method hasMoreElement() which gives a boolean value"
				+ "\n and nextElement() which gives a type of variable");
	}
}
