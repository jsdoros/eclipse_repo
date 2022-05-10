package org.ssglobal.training.codes.answers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Enrollment {

	private Set<Student> biology = new TreeSet<>();
	private Set<Student> comsci = new TreeSet<>();
	private Set<Student> engineering = new TreeSet<>();
}

class Student{
	
	private String id;
	private String name;
	private String address;
	private List<String> course = new ArrayList<>();
	
	// getter/setter
}