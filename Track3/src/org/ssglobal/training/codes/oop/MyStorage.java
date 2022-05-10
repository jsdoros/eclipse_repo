package org.ssglobal.training.codes.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyStorage {
	
	private double[] grades = new double[0];
	private int[] vector = new int[10];
	private List<String> names = new ArrayList<>();
	private Map<String, Integer> coords = new HashMap();
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	
	

}
