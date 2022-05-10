package org.ssglobal.training.codes.generics;

import java.math.BigDecimal;

public class BDOAccounts {
	
	public Double withdrawAccount(Double amount) throws Exception {
		return null;
	}

	
	public Double depositAccount(Double amount) throws Exception {
		return null;
	}

	
	public Double checkDeposit(Double amount) throws Exception {
		return null;
	}
	
	// Generic method
	public <N> N computeInterestCompound(N amount, double rate, int year) throws Exception {
		
		if (amount instanceof Float) {
			float amtFlt = ((Float) amount).floatValue();
			float interest = (float) (amtFlt * Math.pow(rate, year));
			Float interestFlt = interest;
			return (N) interestFlt;
		}else if (amount instanceof Double) {
			double amtFlt = ((Double) amount).doubleValue();
			double interest = (double) (amtFlt * Math.pow(rate, year));
			Double interestDbl = interest;
			return (N) interestDbl;
		}else if (amount instanceof BigDecimal) {
			BigDecimal rateBg = new BigDecimal(String.valueOf(rate));
			BigDecimal interestDbl = rateBg.pow(year).multiply((BigDecimal) amount);
			return (N) interestDbl;
		}else {
			throw new Exception();
		}
	}
}
