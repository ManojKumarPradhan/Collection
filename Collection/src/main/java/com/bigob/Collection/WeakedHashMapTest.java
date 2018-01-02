package com.bigob.Collection;

import java.util.WeakHashMap;

public class WeakedHashMapTest {

	public static void main(String[] args) {
		WeakHashMap<Student3, Integer> hashMap=new WeakHashMap<>();
		Student3 student3=new Student3().setId(101).setName("joker");
		hashMap.put(student3, 101);
		hashMap.put(new Student3().setId(102).setName("jiij"), 102);
		hashMap.put(new Student3().setId(103).setName("fdsd"), 104);
		
		System.out.println("Before GC");
		hashMap.forEach((student,roll)->{
			System.out.println(student+ "\t:\t"+roll);
		});
		
		System.gc();
		System.out.println("after GC");
		hashMap.forEach((student,roll)->{
			System.out.println(student+ "\t:\t"+roll);
		});
		
	}
}
