package com.bigob.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		TreeSet<Integer> integers = new TreeSet<>();

		System.out.println(
				"TreeSet is providing ascending order of Set where while retriving we can get the order we want"
						+ "\n But in case HashSet it not follow any insertion order or we cant garenty any order in HashSet but it is faster then TreeSet");
		System.out.println(
				"TreeSet a child of ShortedSet So if we want a ordered set or shorted set then we must go for TreeSet");
		System.out.println(
				"All the element in TreeSet generics is must be the child of Comparable of Comparator interface "
						+ "\n otherwise it will throw class cast exception");
		System.out.println("But TreeSet have method other method like headSet() tailSet()");

		System.out.println("TreeSet does not allow null value it will throw NullPointerException because it internally use compare() or compateTo() with the object reference");
		
		treeSet.add("a");
		//treeSet.add(null);
		treeSet.add("b");
		treeSet.add("c");
		treeSet.add("d");
		treeSet.add("e");
		treeSet.add("f");
		treeSet.add("g");
		treeSet.add("h");
		treeSet.add("j");
		treeSet.add("z");
		treeSet.add("l");
		treeSet.add("m");
		treeSet.add("n");
		treeSet.add("o");
		treeSet.add("k");
		treeSet.add("q");
		treeSet.add("p");

		SortedSet<String> set = treeSet.headSet("f");
		System.out.println("set : " + set);

		SortedSet<String> set1 = treeSet.tailSet("f");
		System.out.println("set1 : " + set1);

		System.out.println(treeSet.first());

		System.out.println(treeSet.last());

		System.out.println(treeSet);
		// it will insert in ascending order
		System.out.println("[a, b, c, d, e, f, g, h, j, k, l, m, n, o, p, q, z]");

		integers.add(2);
		integers.add(3);
		integers.add(1);
		integers.add(5);
		integers.add(6);
		integers.add(23);
		//integers.add(null);
		integers.add(2213);
		integers.add(22);
		integers.add(232);
		integers.add(12);
		integers.add(223);
		integers.add(1232);
		integers.add(3422);
		integers.add(342);
		integers.add(343242);
		integers.add(3242);
		integers.add(2344);
		integers.add(21233);
		integers.add(2567);

		System.out.println(integers);

		// Student implement Comparator interface
		/*
		 * Comparator have 2 un-implement methods they are compare(-,-) and
		 * equals(-) It also have 16 default method added in java 8
		 * 
		 * if we have some custom order to follow in TreeSet implementation the
		 * we must have to override this interface it is in java.util package
		 */
		TreeSet<Student> students = new TreeSet<>(new Student());
		students.add(new Student().setId(101).setName("Manoj"));
		students.add(new Student().setId(102).setName("Manoj1"));
		students.add(new Student().setId(103).setName("Manoj2"));
		System.out.println(students);

		// Student1 implement Comparable interface
		/*
		 * Comparable have only one method that is compateTo(-) we pass the
		 * object and cpmpareTo(-) take this as reference of a object and doing
		 * comparasion with provided object it always give a ascending order by
		 * default in TreeSet if we want some custom order the we must go for
		 * comparable interface it is present in java.lang package
		 */
		TreeSet<Student1> students1 = new TreeSet<>();
		students1.add(new Student1().setId(101).setName("Manoj"));
		students1.add(new Student1().setId(102).setName("Manoj1"));
		students1.add(new Student1().setId(103).setName("Manoj2"));
		System.out.println(students1);

	}
}
