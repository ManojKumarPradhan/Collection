package com.bigob.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
		System.out.println(linkedHashSet);
		
		System.out.println("It will internally use HashSet constructor to create a object of LinkedHashMap<>");
		System.out.println("LinkedList follow insertion order means in which order we insert this order only it will retrive ");
		System.out.println("Default size is 16 and load-factor .75");
		System.out.println("As it is extends from HashSet then it have all the properties of Hashset but it folloe insertion order");
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		linkedHashSet.add(4);
		linkedHashSet.add(5);
		linkedHashSet.add(6);
		linkedHashSet.add(7);
		linkedHashSet.add(8);
		linkedHashSet.add(9);
		linkedHashSet.add(10);
		linkedHashSet.add(11);
		linkedHashSet.add(12);
		linkedHashSet.add(13);
		linkedHashSet.add(14);
		linkedHashSet.add(15);
		linkedHashSet.add(16);
		linkedHashSet.add(17);
		linkedHashSet.add(18);
		linkedHashSet.add(19);
		System.out.println();
		linkedHashSet.forEach(System.out::print);
		System.out.println();
		LinkedHashSet<String> linkedHashSet2=new LinkedHashSet<>();
		linkedHashSet2.add("manoj");
		linkedHashSet2.add("kumar");
		linkedHashSet2.add("hjsdch");
		linkedHashSet2.add("bdcbj");
		linkedHashSet2.add("msdcvsc");
		linkedHashSet2.add("manosdcsdcj");
		linkedHashSet2.add("manosdcsj");
		linkedHashSet2.add("mandcscoj");
		System.out.println(linkedHashSet2);
		
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("manoj");
		hashSet.add("kumar");
		hashSet.add("hjsdch");
		hashSet.add("bdcbj");
		hashSet.add("msdcvsc");
		hashSet.add("manosdcsdcj");
		hashSet.add("manosdcsj");
		hashSet.add("mandcscoj");
		System.out.println(hashSet);
		
		
		Iterator<String> iterator= linkedHashSet2.iterator();
		iterator.hasNext();
		iterator.next();
		iterator.next();
		linkedHashSet2.add("jsdc");
		//ConcurrentModoficationException  because it is fail-fast
		//iterator.next();
		
	}
}
