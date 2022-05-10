package org.ssglobal.training.codes.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		
		// Create HashMap
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> hashMap2 = new HashMap<>();
		Map<Integer, String> hashMap3 = new HashMap<>(50);	

		// Insertion
		hashMap.put(10, "Manila");
		hashMap2.put(1, "Pasay");
		hashMap2.put(2, "Pasig");
		hashMap2.put(3, "Marikina");
		hashMap.putAll(hashMap2);
		
		System.out.println(hashMap);
		
		// Update
		hashMap.replace(10, "Cebu");
		System.out.println(hashMap);
		
		hashMap.replace(1, "Pasay" , "Malabon");
		System.out.println(hashMap);
		
		// Traversal
		System.out.println(hashMap.get(10));
		// no typical for-loop can be used
		
		for(Entry<Integer, String> entry: hashMap.entrySet()) {
			System.out.format("key: %d, value: %s \n", entry.getKey(), entry.getValue());
		}
		
		for (Integer key: hashMap.keySet()){
			System.out.format("key: %d \n", key);
		}
		
		for (String val: hashMap.values()){
			System.out.format("value: %s \n", val);
		}
		
		Iterator<Entry<Integer, String>> iteratorEntry = hashMap.entrySet().iterator();
		while (iteratorEntry.hasNext()) {
			Entry<Integer, String> entry = iteratorEntry.next();
			System.out.format("key: %d, value: %s \n", entry.getKey(), entry.getValue());
		}
		
		// Removal
		
		//hashMap.remove(10, "Cebu");
		//System.out.println(hashMap);
		
		// Utility
		
		System.out.println(hashMap.containsKey(11));
		System.out.println(hashMap.containsKey("Cotabato"));
		System.out.println(hashMap.get(11));
		System.out.println(hashMap.getOrDefault(11, "").toLowerCase());
		hashMap.putIfAbsent(11, "Cebu"); // will not work anymore if may duplicate
		System.out.println(hashMap);
		
		// Create LinkedHashMap
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> linkedHashMap2 = new LinkedHashMap<>();
		Map<Integer, String> linkedHashMap3 = new LinkedHashMap<>(50);
		
		linkedHashMap.put(10, "Manila");
		linkedHashMap.put(3, "Marikina");
		linkedHashMap.putIfAbsent(11, "Manila");
		linkedHashMap.put(1, "Pasay");
		linkedHashMap.put(2, "Pasig");
		linkedHashMap.put(3, "HongKong");
		
		
		System.out.println("LinkedHashMap: " +linkedHashMap);
		
		//Properties props = new Properties();
		//props.put(linkedHashMap3, props);
		
		// Creation
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		Map <Integer, String> treeMap2 = new TreeMap<>(); // cannot input capacity
		
		treeMap.put(10, "Manila");
		treeMap.put(3, "Marikina");
		treeMap.putIfAbsent(11, "Manila");
		treeMap.put(1, "Pasay");
		treeMap.put(2, "Pasig");
		treeMap.put(3, "HongKong");
		
		System.out.println(treeMap); // sorts key only
		
		// Ancient Map
		
		Hashtable<Integer, String> hashTable = new Hashtable<>(10);	
	}
}

class ZipCodeComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1.compareTo(o2) == 0) {
			return 0;
		}else if (o1.compareTo(o2) > 0) {
			return -2;
		}else {
			return 2;
		}
	}
	
	

}
