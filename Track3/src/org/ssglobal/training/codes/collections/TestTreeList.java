package org.ssglobal.training.codes.collections;

import java.util.Iterator;
import java.util.List;

public class TestTreeList {

	public static void main(String[] args) {

		List<Integer> treeList = new TreeList<>();
		treeList.add(78);
		treeList.add(10);
		treeList.add(56);
		treeList.add(1);
		treeList.add(56);
		treeList.add(56);
		
		System.out.println(treeList);
		
		treeList.remove((Integer)56);
		
		System.out.println(treeList);
		
		Iterator<Integer> iterator = treeList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
