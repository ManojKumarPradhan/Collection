package com.bigob.Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
		System.out.println(linkedHashSet);
		
		System.out.println("It will internally use HashSet constructor to create a object of LinkedHashMap<>");
		System.out.println("LinkedList folloe insertion order means in which order we insert this order only it will retrive ");
		System.out.println("Default size is 16 and load-factor .75");
	}
}
