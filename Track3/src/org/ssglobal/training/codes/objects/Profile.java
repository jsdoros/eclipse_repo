package org.ssglobal.training.codes.objects;

public final class Profile implements Comparable<Profile> {
	
	private Integer id;
	private String name;
	private String address;
	private Float salary;
	
	//public Profile() {
		//negligence itong public
	//}
	
	// counter for instantiation
	private static int counter = 0;
	
	private Profile() {
		System.out.println("A profile object is instantiated.");
	}
	
	private Profile(Integer id, String name, String address, Float salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	private Profile(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.address = "";
		this.salary = 0.0F;
	}
	
	private Profile(Integer id, String name, Float salary) {
		this.id = id;
		this.name = name;
		this.address = "";
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public static Profile create(Integer id, String name, String address, Float salary) throws ProfileSingletonException {
		
		if (counter >= 3) {
			throw new ProfileSingletonException();
		}
		counter++;
		return new Profile(id, name, address, salary);
	}
	
	public static Profile create(Integer id, String name) throws ProfileSingletonException {
		
		if (counter >= 3) {
			throw new ProfileSingletonException();
		}
		counter++;
		return new Profile(id, name);
	}
	
	public static Profile create(Integer id, String name, Float salary) throws ProfileSingletonException {
		
		if (counter >= 3) {
			throw new ProfileSingletonException();
		}
		counter++;
		return new Profile(id, name, salary);
	}
	
	// factory method - returns the instance of the class; always static	
	public static Profile create() throws ProfileSingletonException{
		
		if (counter >= 3) {
			throw new ProfileSingletonException();
		}
		counter++;
		return new Profile();
	}

	@Override
	public int compareTo(Profile o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class ProfileSingletonException extends Exception{
	
	private String message =  "cannot instantiate more than once";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println(message);
	}
	
}
