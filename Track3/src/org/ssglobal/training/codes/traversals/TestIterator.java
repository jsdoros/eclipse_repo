package org.ssglobal.training.codes.traversals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {

		List<Integer> arrList = new ArrayList<>(Arrays.asList(10, 12, 15, 16));
		Iterator<Integer> iterator = arrList.iterator();
		while(iterator.hasNext()) {
			Integer item = iterator.next();
			if (item == 12) {
				iterator.remove();
			}
		}
		System.out.println(arrList);
	}

}
