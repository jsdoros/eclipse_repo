package org.ssglobal.training.codes.generics;

public class TestProcessData {

	public static void main(String[] args) {
		ProcessData<String> pd = new ProcessData<String>();
		pd.processValue("Hello Manila");

		ProcessData<StringBuilder> pd2 = new ProcessData<StringBuilder>();
		pd2.processValue(new StringBuilder("Hello Manila"));
		
		ProcessData<StringBuffer> pd3 = new ProcessData<StringBuffer>();
		pd3.processValue(new StringBuffer("Hello Manila"));
		
		// Consumption - you pass data into it
		ProcessData<? super CharSequence> pdAll = new ProcessData<>();
		pdAll.processValue("Ola");
		pdAll.processValue(new StringBuilder ("Ola"));
		pdAll.processValue(new StringBuffer ("Ola"));
		//pdAll.processValue(45);
		
		// Production
		//ProcessData<? extends CharSequence> pdAll2 = new ProcessData<>();
		//pdAll.processValue("Ola");
		
		callReference(pd);
		callReference(pd2);
		callReference(pd3);
		callReference(pdAll);
	}

	public static void callReference(ProcessData<? extends CharSequence> pd) {
		System.out.println(pd.index());
	}
}
