package org.ssglobal.training.codes.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		
		// Creation of ArrayList
		ArrayList<String> arrList = new ArrayList<>();
		List<? super CharSequence> arrList2 = new ArrayList<>(); //polymorphic way, matipid sa memory
		List<StringBuilder> arrList3 = new ArrayList<>(50);
		
		// Utilities
		
		// Insertion at the tail end
		arrList2.add("Good Afternoon!");
		arrList2.add(new StringBuilder("Bonjour!"));
		arrList2.add(new StringBuffer("Ola!"));
		arrList2.add(new StringBuffer("Welcome!"));
		
		System.out.println(arrList2);
		
		// Insertion anywhere else
		arrList2.add(0, "Mabuhay!");
		System.out.println(arrList2);
		arrList2.add(3, new StringBuilder("Ohayoo Gozaimasu!"));
		System.out.println(arrList2);
		
		// IndexOutOfBounds:
		//arrList2.add(10, "Hello!");
		
		arrList2.add(arrList2.size(), "Hello!");
		System.out.println(arrList2);
		
		// Inserting another collection (Bulk insertion)
		arrList.add("Mabuhay!");
		arrList.add("Welcome!");
		arrList.add("Good bye!");
		arrList2.addAll(arrList);
		System.out.println(arrList2);
		
		arrList3.add(new StringBuilder("Happy Dinner!"));
		StringBuilder sb = new StringBuilder("Good Evening!");
		arrList3.add(sb);
		arrList2.addAll(0, arrList3);
		System.out.println(arrList2);
		
		// flattening process
		// Update utility
		
		arrList2.set(0, "Happy Lunch!");
		System.out.println(arrList2);
		
		// Retrieval of items
		System.out.println(arrList2.get(3)); // be conscious with the size
		
		for(int i = 0; i < arrList2.size(); i++) {
			System.out.format("%s ", arrList2.get(i));
		}
		
		System.out.println("\n");
		
		for(Object lookup: arrList2) {
			System.out.format("%s ", lookup);
		}
		System.out.println("\n");
		
		Iterator<CharSequence> iterator = (Iterator<CharSequence>) arrList2.iterator();
		
		while(iterator.hasNext()) {
			System.out.format("%s ", iterator.next()); //fastest
		}
		System.out.println("\n");
		
		arrList2.forEach((obj) -> {
			System.out.format("%s ", obj);
		}); // fastest among all traversals
		System.out.println("\n");
		
		// Remove the items
		arrList2.remove(5);
		System.out.println(arrList2);
		arrList2.remove("Welcome!");
		System.out.println(arrList2);
		
		List<Integer> arrListInts = new ArrayList<>();
		arrListInts.add(10);
		arrListInts.add(5);
		arrListInts.add(2);
		arrListInts.add(0);
		arrListInts.add(6);
		arrListInts.add(7);
		arrListInts.add(5);
		arrListInts.remove(5);
		System.out.println(arrListInts);
		//arrListInts.remove((Integer)5);
		arrListInts.removeIf((obj) -> {
			if (obj.equals(5)) {
				return true;
			}
			return false;
		});
		System.out.println(arrListInts);
		
		// Bulk removal
		//arrList2.removeAll(arrList);
		//System.out.println(arrList2);
		//arrList2.removeAll(arrList3);
		//System.out.println(arrList2);
		
		//arrList2.retainAll(arrList3);
		//arrList2.clear();
		//System.out.println(arrList2);
	
		// Other utilities
		System.out.println(arrList2.contains(sb));
		System.out.println(arrList2.contains("Mabuhay!"));
		Object[] arrData = arrList2.toArray();

		List<? super CharSequence> subArrList2 = arrList2.subList(1, 4);
		System.out.println(subArrList2);
		System.out.println(arrList2.isEmpty());
		
		// Create LinkedList
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.addFirst(10);
		linkedList.addLast(20);
		//linkedList.removeFirst(); // dequeue
		//linkedList.removeLast(); // dequeue
		
		// avoid applying loops to linkedlist
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		
		List<Integer> linkedList2 = new LinkedList<>();
		//List<Integer> linkedList3 = new LinkedList<>(50); //cannot set initial capacity
		
		// Create the Vector
		Vector<Double> vector = new Vector<>();
		List<Double> vector2 = new Vector<>();
		List<Double> vector3 = new Vector<>(50);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
