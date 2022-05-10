package org.ssglobal.training.codes.generics;

public class StatOps<N> {

	@SuppressWarnings("unchecked")
	public N sum(N[] data) throws NullPointerException, ArrayIndexOutOfBoundsException, Exception{
		
		//N sum = null;
		Number temp = 0;
		for(N lookup: data) {
			Number num = (Number) lookup;
			if(num instanceof Integer) {
				int intTemp = temp.intValue();
				intTemp += (int) num;
				Integer tempval = intTemp;
				temp = (Number) intTemp;
			}else if (num instanceof Double) {
				double dblTemp = temp.doubleValue();
				dblTemp += (double) num;
				Double tempVal = dblTemp;
				temp = dblTemp;
			}else if (num instanceof Float) {
				float fltTemp = temp.floatValue();
				fltTemp += (float) num;
				temp = fltTemp;
			}
		}	
		N sum = (N) temp;
		return sum;
	}
}
