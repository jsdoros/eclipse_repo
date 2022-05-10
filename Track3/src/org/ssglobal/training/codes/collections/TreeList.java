package org.ssglobal.training.codes.collections;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;

public class TreeList <E> extends AbstractList<E>{

	@SuppressWarnings("unchecked")
	private E[] elementData = (E[]) new Object[0];
	
	@Override
	public E get(int index) throws IndexOutOfBoundsException{
		
		E element = null;
		if(index < elementData.length) {
			element = elementData[index];
		}else {
			throw new IndexOutOfBoundsException();
		}
		
		return element;
	}

	@Override
	public int size() {
		return elementData.length;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(E e) {
		
		try {
			E[] temp = (E[]) new Object[elementData.length + 1];
			System.arraycopy(elementData, 0, temp, 0 , elementData.length);
			temp[elementData.length] = e;	
			elementData = null;
			elementData = temp;
			Arrays.sort(elementData);
			temp = null;
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean remove(Object o) {
		
		try {
			int occurences = 0;
			for(E data: elementData) {
				if(data == o) {
				occurences++;
				}
			}
			E[] temp = (E[]) new Object [elementData.length - occurences];
		
			int i = 0;
			for(E data: elementData) {
				if(data == o) {
					continue;
				}
				temp[i] = data;
				i++;
			}
			elementData = null;
			elementData = temp;
			temp = null;
			return true;
		}catch(Exception e) {
			return false;
		}
	
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<>() {
			
			private int counter = 0;
			
			@Override
			public boolean hasNext() {
				if(counter < elementData.length) {
					return true;
				}
				return false;
			}

			@Override
			public E next() {
				int tempCounter = 0;
				counter++;
				return elementData[tempCounter];
			}
		}; 
	}
}

class MyIterator<E> implements Iterator<E>{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


