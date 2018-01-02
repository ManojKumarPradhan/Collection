package com.bigob.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListVSVector {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();

		List<String> vectors = new Vector<>();

		System.out.println("ArrayList is introduce in java 1.2");
		System.out.println("And");
		System.out.println("Vector is a legacy class introduce in frst version");
		System.out.println();

		System.out.println("Initial size of ArrayList is 10");
		System.out.println("And");
		System.out.println("Initial size of Vector is 10");
		System.out.println();

		System.out.println("ArrayList methods are not synchronised is not suitable for multithreaded enviroment"
				+ "\nit is faster then vector because of not synchronised");
		System.out.println("And");
		System.out.println("Vector are methods are synchronised so it is better option for muthithreaded enviroment"
				+ "\nit is slower then synchronised");
		System.out.println();

		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("4");
		arrayList.add("5");
		arrayList.add("6");
		arrayList.add("7");
		arrayList.add("8");
		arrayList.add("9");
		arrayList.add("10");
		arrayList.add("11");
		arrayList.add("12");
		arrayList.add("13");
		arrayList.add("14");
		arrayList.add("15");

		System.out.println(arrayList);

		vectors.add("1");
		vectors.add("2");
		vectors.add("3");
		vectors.add("4");
		vectors.add("5");
		vectors.add("6");
		vectors.add("7");
		vectors.add("8");
		vectors.add("9");
		vectors.add("10");
		vectors.add("11");
		vectors.add("12");
		vectors.add("13");
		vectors.add("14");
		vectors.add("15");

		System.out.println(vectors);

		System.out.println("Both Are growable array");
		System.out.println();

		System.out.println("in ArrayList if you crossed initialial capacity it will grow by half means "
				+ "\ninitial capacity is 10 so next time it grow like 15,22,33,49......like capacity+(capacity>>1)");
		System.out.println("And");
		System.out.println("in Vector if you crossed initial capacity it will frow by double of its privious size"
				+ "\nmeans initial capacity is 10 so it will grow like 20,40,80,160........newCapacity=oldCapacity+oldCapacity");

		System.out.println();
		
		System.out.println("ArrayList is fail-fast because when we fetched the data with iterator or ListIterator "
				+ "\n if we use add(-) then it will thorw ConcurrentModificationException");
		
		System.out.println("AND");
		System.out.println("Vector can fetched with Enumeration with method elements() so when we fetch if"
				+ "\n we try to add(-) something it will not throw ConcurrentModificationException");
		
		System.out.println("...........................................................................");

		
		
		System.out.println("....methods Test....");

		arrayList.stream().filter(ArrayListVSVector::match).forEach(System.out::println);
		
		vectors.stream().filter(ArrayListVSVector::match).forEach(System.out::println);
		System.out.println("................................");
		System.out.println(arrayList.size());
		System.out.println(vectors.size());
		System.out.println("...................................");
		System.out.println(arrayList.get(1));
		System.out.println(vectors.get(1));
		System.out.println("...................................");
		System.out.println(arrayList.contains("11"));
		System.out.println(vectors.contains("11"));
		System.out.println("...................................");
		System.out.println(arrayList.set(1, "Manoj"));
		System.out.println(vectors.set(1, "Manoj"));
		System.out.println("...................................");
		arrayList.listIterator().forEachRemaining(System.out::print);
		System.out.println();
		vectors.listIterator().forEachRemaining(System.out::print);
		System.out.println();
		
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		Vector<Integer> vNum=new Vector<>();
		vNum.add(7);
		vNum.add(8);
		vNum.add(9);
		vNum.add(10);
		vNum.add(11);
		vNum.add(12);
		
		Iterator<Integer> iterator=numbers.iterator();
		System.out.println("iterator.next() :"+iterator.next());
		System.out.println("iterator.next() :"+iterator.next());
		System.out.println("numbers.add(13)  :"+numbers.add(13));
		//System.out.println("iterator.next() :"+iterator.next());
		
		System.out.println();
		
		Enumeration<Integer> enumeration=vNum.elements();
		System.out.println("enumeration.nextElement() :"+enumeration.nextElement());
		System.out.println("enumeration.nextElement() :"+enumeration.nextElement());
		System.out.println("vNum.add(14)  :"+vNum.add(14));
		System.out.println("enumeration.nextElement() :"+enumeration.nextElement());
	}
	public static boolean match(String s){
		if (s == "1")
			return false;
		else
			return true;
	}
}

