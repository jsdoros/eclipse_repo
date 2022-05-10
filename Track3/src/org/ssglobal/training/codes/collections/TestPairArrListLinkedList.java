package org.ssglobal.training.codes.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestPairArrListLinkedList {

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		populateList(arrList);
		populateList(linkedList);
		
		//insertList(arrList);
		LinkedList<Integer> temp = new LinkedList<>();
		temp.addAll(arrList);
		insertList(temp);
		arrList.clear();
		arrList.addAll(temp);
		temp = null;
		
		insertList(linkedList);
		
		readList(arrList);
		readList(linkedList);
		
		updateList(arrList);
		updateList(linkedList);
		
		deleteList(arrList);
		deleteList(linkedList);
		
		search(arrList);
		search(linkedList);
	}
	
	public static void populateList(List<Integer> list) {
		long before = System.currentTimeMillis();
		for(int i = 0; i < 500000; i++) {
			list.add(i);
		}
		long elapsed = System.currentTimeMillis() - before;
		System.out.format("Population: %d \n", elapsed);
	}
	
	public static void insertList(List<Integer> list) {
		long before = System.currentTimeMillis();
		for(int i = 0; i < 50000; i++) {
			list.add(0, 10);
		}
		long elapsed = System.currentTimeMillis() - before;
		System.out.format("Insertion: %d \n", elapsed);
	}

	public static void readList(List<Integer> list) {
		long before = System.currentTimeMillis();
		for(int i = 0; i < 50000; i++) {
			list.get(i);
		}
		long elapsed = System.currentTimeMillis() - before;
		System.out.format("Traversal: %d \n", elapsed);
	}
	
	public static void updateList(List<Integer> list) {
		long before = System.currentTimeMillis();
		for(int i = 0; i < 50000; i++) {
			list.set(i, 50);
		}
		long elapsed = System.currentTimeMillis() - before;
		System.out.format("Update: %d \n", elapsed);
	}
	
	public static  void deleteList(List<Integer> list) {
		long before = System.currentTimeMillis();
		for(int i = 0; i < 50000; i++) {
			list.remove(0);
		}
		long elapsed = System.currentTimeMillis() - before;
		System.out.format("Deletion: %d \n", elapsed);
	}
	
	public static  void search(List<Integer> list) {
		long before = System.currentTimeMillis();
		for(int i = 0; i < 50000; i++) {
			list.contains(0);
		}
		long elapsed = System.currentTimeMillis() - before;
		System.out.format("Search: %d \n", elapsed);
	}

}
