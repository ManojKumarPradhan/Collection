package com.bigob.Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Number> hashSet=new HashSet<>();
		hashSet.add(null);
		hashSet.add(1);
		hashSet.add(23);
		hashSet.add(21);
		hashSet.add(2);
		hashSet.add(31);
		hashSet.add(43);
		hashSet.add(51);
		hashSet.add(33);
		hashSet.add(51);
		hashSet.add(63);
		hashSet.add(71);
		hashSet.add(73);
		hashSet.add(81);
		hashSet.add(463);
		hashSet.add(2646);
		
		
		System.out.println(hashSet);
		System.out.println("It will use Hashing techinque to store the value ");
		System.out.println("the order is not preditable in HashSet class\n it alloe null value");
		System.out.println("HashSet is not shynronize and we can make it syncronise by Collections.synchronizedSet(-)");
		System.out.println("When we create a HashSet Object internally it will create a HashMap object and when"
				+ "\n we enter a value it will be the key og the HashMap and value will always a Object");
		System.out.println("its default size is 16");
		System.out.println("HashSet load factor is 0.75 so thrash-hold is 12 that means "
				+ "\n when it reach 12th node autmatically a new HashSet created and replace the value with size increased HashSet");
		System.out.println("it will increase size by double ");
		System.out.println("It is fail fast  by nature it we add item while ititerating then it will throw ConcurrentModificationExcetion");
		System.out.println("");
		
		
		Set<Number> numbers=hashSet;
		numbers=Collections.synchronizedSet(numbers);
		System.out.println(hashSet.size());
	}
}
