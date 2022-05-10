package org.ssglobal.training.codes.traversals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {

	public static void main(String[] args) {

		List<Integer> arrList = new ArrayList<>(Arrays.asList(10, 12, 15, 16));
		
		ListIterator<Integer> iterator = arrList.listIterator();
		while(iterator.hasNext()) {
			Integer item = iterator.next();
			System.out.format("Element %d at index %d \n", item, iterator.nextIndex());
			if (item == 12) {
				iterator.remove();
			}
		}
		while (iterator.hasPrevious()) {
			Integer item = iterator.previous();
			System.out.format("Element %d at index %d \n", item, iterator.previousIndex());
			if (item == 15) {
				iterator.add(25);
			}
		}
		while(iterator.hasNext()) {
			Integer item = iterator.next();
			System.out.format("Element %d at index %d \n", item, iterator.nextIndex());
			if (item == 16) {
				iterator.set(-16);
			}
		}
		System.out.println(arrList);
	}

}
