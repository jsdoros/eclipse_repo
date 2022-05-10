package org.ssglobal.training.codes.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {

		HashSet<Float> hashSet = new HashSet<Float>();
		Set<Float> hashSet3 = new HashSet<>(50);
		
		// Insertion
		hashSet.add(101.5F);
		hashSet.add(12.5F);
		hashSet.add(11.5F);
		hashSet.add(22.3F);
		hashSet.add(101.5F);
		
		System.out.println(hashSet);
		
		List<Float> allFloats = new ArrayList<>();
		allFloats.add(1.5F);
		allFloats.add(2.5F);
		allFloats.add(3.5F);
		hashSet.addAll(allFloats);
		
		System.out.println(hashSet);
		
		// Update - no update
		// Retrieval
		// no single retrieval
		
		for(Float lookup:hashSet) {
			System.out.format("%f ", lookup);
		}
		System.out.println();
		
		// Iterator
		// forEach
		
		// Deletion
		hashSet.removeAll(allFloats);
		System.out.println(hashSet);
		
		// Utilities
		
		// Create LinkedHashset
		LinkedHashSet<Float> linkedHashSet = new LinkedHashSet();
		Set<String> linkedHashSet2 = new LinkedHashSet<>();
		Set<String> linkedHashSet3 = new LinkedHashSet<>(50);
		
		linkedHashSet.add(101.5F);
		linkedHashSet.add(12.5F);
		linkedHashSet.add(11.5F);
		linkedHashSet.add(22.3F);
		linkedHashSet.add(101.5F);
		
		System.out.println(linkedHashSet);
		
		// Create TreeSet
		
		TreeSet<String> treeSet = new TreeSet<>();
		Set<String> treeSet2 = new TreeSet<>();
		treeSet.add("ABBA");
		treeSet.add("abba");
		treeSet.add("ABba");
		treeSet.add("AbbA");
		treeSet.add("AbBA");
		treeSet.add("ABBA");
		System.out.println(treeSet);
	}

}

class AbbaComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.compareTo(o2) == 0) {
			return 0;
		}else if (o1.compareTo(o2) > 0) {
			return -2;
		}else {
			return 2;
		}
	}
	
}
