package org.ssglobal.training.codes.generics;

public interface BankingOps<N> {

		N withdrawAccount(N amount) throws Exception;
		N depositAccount(N amount) throws Exception;
		N checkDeposit(N amount) throws Exception;
}
