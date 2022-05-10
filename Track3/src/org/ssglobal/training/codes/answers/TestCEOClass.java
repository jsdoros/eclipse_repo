package org.ssglobal.training.codes.answers;

import org.ssglobal.training.codes.nested.CEOClass;

public class TestCEOClass extends CEOClass{

	public static void main(String[] args) {
		// instantiate CEOClass in nested package
		CEOClass ceo = new CEOClass();
		CEOClass.SupervisorClass sc = ceo.new SupervisorClass();
	}
	
	public void referenceData() {
		CEOClass.InnerProtectedClass ceo = new CEOClass.InnerProtectedClass();
		
	}

}
