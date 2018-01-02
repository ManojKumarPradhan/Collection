package com.bigob.Collection;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap=new TreeMap<>();
		
		System.out.println("Initaial capacity is 16 and load-factor .75");
		System.out.println("It will follow ascending order of insertation because internally it use ");
		System.out.println("it is fall fast mean it will throw ConcurrentModificationException");
		System.out.println("If key is not implement to Comparator or Comparable interface then it will throw ClassCastException");
		System.out.println("It will not take null as key because internally it will call compare() or compareTo()"
				+ "\n which gives NullPointerException");
		System.out.println("Here we have some interesting method like headMap(), tailMap, descendingMap()");
		
		treeMap.put(1, "1");
		treeMap.put(102, "1");
		treeMap.put(11, "1");
		treeMap.put(12, "1");
		treeMap.put(11, "1");
		treeMap.put(13, "1");
		treeMap.put(12, "1");
		treeMap.put(1222, "1");
		treeMap.put(111, "1");
		treeMap.put(1432, "1");
		treeMap.put(145, "1");
		treeMap.put(17, "1");
		//treeMap.put(null, "1");
		treeMap.put(19, "1");
		treeMap.put(176, "1");
		treeMap.put(159, "1");
		treeMap.put(51, "1");
		treeMap.put(71, "1");
		
		treeMap.forEach((i,s)->{
			System.out.println(i+"\t:\t"+s);
		});
		
		System.out.println("headMap(102)");
		treeMap.headMap(102).forEach((i,s)->{
			System.out.println(i+"\t:\t"+s);
		});
		
		System.out.println("tailMap(102)");
		treeMap.tailMap(102).forEach((i,s)->{
			System.out.println(i+"\t:\t"+s);
		});
		
		SortedMap<Integer, String> sortedMap=treeMap;
		sortedMap=Collections.synchronizedSortedMap(sortedMap);
		
		TreeMap<Student, Integer> treeMap2=new TreeMap<>(new Student());
		treeMap2.put(new Student().setId(101).setName("Manoj"), 101);
		treeMap2.put(new Student().setId(102).setName("Manoj"), 101);
		treeMap2.put(new Student().setId(103).setName("Manoj"), 101);
		
		System.out.println(treeMap2);
		
		treeMap.descendingMap().forEach((i,s)->{
			System.out.println(i+"\t:\t"+s);
		});
	}
}
