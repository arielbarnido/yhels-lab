package com.money.tracker.bo;

import java.util.Date;

import com.money.tracker.core.AbstractTransaction;
import com.money.tracker.core.Profile;
import com.money.tracker.vo.Transaction;

public class AbstractTransactionExpenseImpl extends AbstractTransaction {

	private final String TRANSACTION_TYPE = "expense";

	public AbstractTransactionExpenseImpl(Profile profile) {
		super(profile);

	}

	@Override
	public Transaction getTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

}
