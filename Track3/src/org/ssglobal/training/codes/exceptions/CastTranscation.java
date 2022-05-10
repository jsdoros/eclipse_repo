package org.ssglobal.training.codes.exceptions;

public class CastTranscation {

		public double castToDouble(Object item) throws CastDoubleException{
			
			if (!(item instanceof Number)) {
				throw new CastDoubleException();
				
			}
			double val = (Double) item;
			return val;
		}
}
