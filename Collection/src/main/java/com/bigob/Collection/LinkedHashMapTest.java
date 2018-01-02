package com.bigob.Collection;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap=new LinkedHashMap<>();
		
		Map<Integer, String> map=linkedHashMap;
		map=Collections.synchronizedMap(map);
		
		System.out.println("All the methods of LinkedHashMap is not synhronize if we want to make it synchronize then"
				+ "\n we have Collections.synchronizedMap(map); ");
		System.out.println("Initial capasity of LinkedHashMap is 16 and loadfactor is .75");
		System.out.println("it will allow null value and key as well");
		System.out.println("It will take the insertion order while retriving");
		System.out.println("It is fail fast");
		
		linkedHashMap.put(1, "1");
		linkedHashMap.put(2, "1");
		linkedHashMap.put(4, "1");
		linkedHashMap.put(8, "1");
		linkedHashMap.put(2, "1");
		linkedHashMap.put(0, "1");
		linkedHashMap.put(1324, "1");
		linkedHashMap.put(122, "1");
		linkedHashMap.put(13444, "1");
		linkedHashMap.put(14, "1");
		linkedHashMap.put(13, "1");
		linkedHashMap.put(12, "1");
		linkedHashMap.put(null, "1");
		linkedHashMap.put(null, "111");
		
		linkedHashMap.forEach((i,s)->{
			System.out.println(i+"\t:\t"+s);
		});
	}
}
