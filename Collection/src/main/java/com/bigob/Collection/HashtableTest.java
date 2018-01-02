package com.bigob.Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableTest {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable=new Hashtable<>();
		
		System.out.println("Hashtable is a legacy class means it is present from the initial days");
		System.out.println("It will not take null as value and  null key, it will throw NullPointerException");
		System.out.println("Hashtable initial capacity is 11 and load factor is .75");
		System.out.println("All method is shyncronised here");
		System.out.println("it is fail fast while adding the value with iterating ");
		System.out.println("But we can use Enumeration so it will nt throw ConcurrentModificationException");
		System.out.println("To add and retrive method we need to override equals() and hashcode()");
		System.out.println("Here in this example Integer and String already have equals() and hashcode()");
		System.out.println("It internally use hashing techinque to store and retrive the element");
		System.out.println("After reaching load-factor it will increase size by (oldCapacity << 1) + 1 this method"
				+ "\n means initial size is 11 it will grow 23,47........");
		System.out.println();
		
		System.out.println(".....................................................................................");
		
		hashtable.put(1324, "manoj");
		hashtable.put(24, "manoj");
		hashtable.put(3234, "manoj");
		hashtable.put(4234, "manoj");
		hashtable.put(523, "manoj");
		hashtable.put(6234, "manoj");
		hashtable.put(7234, "manoj");
		hashtable.put(42315, "manoj");
		hashtable.put(2349, "manoj");
		hashtable.put(12340, "manoj");
		hashtable.put(12341, "manoj");
		hashtable.put(13242, "manoj");
		hashtable.put(1323, "manoj");
		hashtable.put(12344, "manoj");
		hashtable.put(8234, "manoj");
		//hashtable.put(null, null);
		
		System.out.println(hashtable);
		
		Enumeration<Integer> enumeration=hashtable.keys();
		enumeration.nextElement();
		enumeration.nextElement();
		hashtable.put(777, "joker");
		enumeration.nextElement();
	
		hashtable.forEach((i,s)->{
			System.out.println(i+"\t:\t"+s);
		});
		
		hashtable.remove(24, "manoj");
		System.out.println();
		hashtable.forEach((i,s)->{
			System.out.println(i+"\t:\t"+s);
		});
		
		System.out.println("(oldCapacity << 1) + 1; "+((23<<1)+1));
	}
}
