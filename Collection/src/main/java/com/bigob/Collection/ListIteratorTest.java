package com.bigob.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("abc");
		arrayList.add("cde");
		arrayList.add("efg");
		arrayList.add("ghi");
		arrayList.add("ijk");
		arrayList.add("klm");
		arrayList.add("mno");
		arrayList.add("opq");
		
		System.out.println(arrayList);
		
		ListIterator<String> iterator=arrayList.listIterator();
		System.out.println("removing mno");
		while(iterator.hasNext()){
			if(iterator.next().equals("mno"))
				iterator.remove();
		}
		System.out.println("printing reverse of insertion order...");
		while(iterator.hasPrevious()){
			System.out.print(iterator.previous()+"\t");
		}
		System.out.println();
		System.out.println("printing in insertion order");
		while (iterator.hasNext()) {
			System.out.println(iterator.nextIndex()+":\t"+iterator.next());
		}
		
		System.out.println(iterator.nextIndex());
		iterator.nextIndex();
		
		iterator.add("qrs");
		
		
		System.out.println(arrayList);
		
		System.out.println("This interface has 9 methods 6 for query operation and 3 fr modification operation"
				+ "\n Query Opetration"
				+ "\n 1. hasNext() it will return boolean value"
				+ "\n 2. hasPrevious() it will return a boolean value true if there is a previous element"
				+ "\n 3. next() it will return next element"
				+ "\n 4. previous()it will return previous element"
				+ "\n 5. nextIndex() it will return the index number of next element"
				+ "\n 6. previousIndex() it will return index number of previous element"
				+ "\n Modification operation"
				+ "\n 7. add() it will add the element"
				+ "\n 8. remove() it will remove the element"
				+ "\n 9. set() it will replace the element with current element");
	}
}
