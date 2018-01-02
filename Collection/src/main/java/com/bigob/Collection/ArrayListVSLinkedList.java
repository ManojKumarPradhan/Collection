package com.bigob.Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		ArrayList<Number> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(1.1);
		arrayList.add(1.2);
		arrayList.add(1.3);
		arrayList.add(1.4);
		arrayList.add(1.5);
		arrayList.add(2);
		arrayList.add(2.1);
		arrayList.add(2.2);
		arrayList.add(2.3);
		arrayList.add(2.4);
		arrayList.add(3);
		arrayList.add(3.1);
		
		System.out.println(arrayList);
		
		LinkedList<Number> linkedList=new LinkedList<>();
		linkedList.add(4);
		linkedList.add(4.1);
		linkedList.add(4.2);
		linkedList.add(4.3);
		linkedList.add(5);
		linkedList.add(5.1);
		linkedList.add(5.2);
		linkedList.add(5.3);
		linkedList.add(6);
		linkedList.add(6.1);
		linkedList.add(6.2);
		linkedList.add(7);
		
		System.out.println(linkedList);
		
		System.out.println("...................................................................");
		
		System.out.println("ArrayList is a growable array implementation ");
		System.out.println("And");
		System.out.println("LinkedList id implementation of Double linked list");
		
		System.out.println();
		
		System.out.println("here get() and set() will work faster then LinkedList but add() and remove() will work fasten in LinkedList");
		System.out.println("And");
		System.out.println("it a Double Link list means all node connecting to the next element so "
				+ "\nhere add() and remove() is work faster then Arraylist");
	
		System.out.println();
		
		System.out.println("Both class methods are not sychnronize");
		
		System.out.println();
		
		System.out.println("ArrayList implement RandomAcess interface (it is a marker interface used for special behaviour like speedy access)"
				+ "\n in arrayList search is faster then LinkedList");
		System.out.println("And");
		System.out.println("LinkedList is implement Dqueue interface so it will some behaviour od Dqueue"
				+ "\n like add() remove() pick() push() pop() of Dqueue");
		System.out.println();
		
		System.out.println("Default capacity od Arraylist id 10 and increase by half of the size");
		System.out.println("And");
		System.out.println("there is no default size in LinkedList everytime a new element add it will create a new node");
		
		System.out.println();
		
		System.out.println("We have a method in LinkedList descendingIterator() through which we can retrive the element reversely");
		
		linkedList.iterator().forEachRemaining(i->{
			System.out.print(i+", ");
		});
		System.out.println();
		linkedList.descendingIterator().forEachRemaining(i->{
				System.out.print(i+", ");
			});
	}
}
