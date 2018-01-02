package com.bigob.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<>();
		
		System.out.println("It will take null value whete as hashtable will not take null value ");
		System.out.println("Initial capasity is 16 and load-factor is .75");
		System.out.println("All the methods in HashMap is not synchronize but we can make object synchrnised with"
				+ "\n Collections.synchronizedMap(map) ");
		System.out.println("As like HashSet it will also not garenty insertion order (HashSet internaly use HashMap)");
		System.out.println("This will not suppoet fetching through Enumeration so we use Iteration "
				+ "\n hence it will throw ConcurrentModificationException");
		System.out.println("After crossing the load-factor it will increase the size by double");
		Map<Integer, String> map=hashMap;
		map=Collections.synchronizedMap(map);
		
		hashMap.put(1, "a");
		hashMap.put(12, "a");
		hashMap.put(12, "a");
		hashMap.put(null, "a");
		hashMap.put(null, "b");
		hashMap.put(23, "a");
		hashMap.put(234, "a");
		hashMap.put(53, "a");
		hashMap.put(8, "a");
		hashMap.put(35, "a");
		hashMap.put(43, "a");
		hashMap.put(54, "a");
		hashMap.put(4, "a");
		hashMap.put(7, "a");
		hashMap.put(45, "a");
		hashMap.put(145, "a");
		hashMap.put(15, "a");
		hashMap.put(134, "a");
		hashMap.put(154, "a");
		hashMap.put(14, "a");
		
		System.out.println(hashMap);
		
		Iterator<Integer> iterator=hashMap.keySet().iterator();
		iterator.next();
		iterator.next();
		hashMap.put(222, "22");
		//iterator.next();
		
		Map<Student3, Integer> map2=new HashMap<>();
		map2.put(new Student3().setId(101).setName("Manoj"), 101);
		map2.put(new Student3().setId(102).setName("Manoj"), 102);
		map2.put(new Student3().setId(102).setName("Manoj1"), 103);
		
		System.out.println(map2);
	}
}
