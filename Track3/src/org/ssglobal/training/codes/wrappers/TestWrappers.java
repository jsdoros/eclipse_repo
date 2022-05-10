package org.ssglobal.training.codes.wrappers;

public class TestWrappers {

	public static void main(String[] args) {
			
		/* Old version of upgrading primitive types
		
		Integer ageInt = new Integer(40);
		Double salaryDbl = new Double(50000.00);
		Character letterChr = new Character('L');
		
		*/
		
		Integer ageInt = 40;
		Double salaryDbl = 50000.00;
		Character letterChr ='L';
				
		System.out.println(ageInt);
		System.out.println(salaryDbl);
		System.out.println(letterChr);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(ageInt.hashCode());
		ageInt += ageInt; // do not do this
	}

	/* Using old version of upgrading primitive types
	 
		public int setAge(Integer age) {
		int agePrimitive = age.intValue();
		return agePrimitive + 20;
		
		*/
		
		public int setAge(Integer age) {
			int agePrimitive = age;
			return agePrimitive + 20;
	}
}
