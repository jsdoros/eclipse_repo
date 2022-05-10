package org.ssglobal.training.codes.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

public class TestCompareCapacity {

	public static void main(String[] args) {
		
		Vector<Double> vector = new Vector<>();
		ArrayList<Double> arrList = new ArrayList<>();
		
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		vector.add(10.5);
		
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		arrList.add(10.5);
		
		System.out.format("Vector size: %d, capacity: %d \n", vector.size(), vector.capacity());
		System.out.format("ArrayList size: %d, capacity: %d \n", arrList.size(), getArrayListCapacity(arrList));
	}
	
	public static int getArrayListCapacity(ArrayList<Double> arrList) {
		
		Class<?> arrayListClass = ArrayList.class;
		Object[] arrData = null;
		int capacity = 0;
		try {
			Field capacityField = arrayListClass.getDeclaredField("elementData");
			capacityField.setAccessible(true);
			arrData = (Object[]) capacityField.get(arrList);
			capacity = arrData.length;
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return capacity;
	}
}
