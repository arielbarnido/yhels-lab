package com.money.tracker.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.money.tracker.bo.AbstractTransactionExpenseImpl;
import com.money.tracker.vo.Transaction;

public abstract class AbstractTransaction {

	Profile transactionProfile;
	Transaction transaction;

	public AbstractTransaction(Profile profile) {
		transactionProfile = profile;
	}

	public List<Transaction> retrieveTransactions() {

		ArrayList<Transaction> allTransactions = new ArrayList<Transaction>();

		Transaction t1 = new Transaction();
		t1.setExpenseId("1");
		t1.setAmount(10.00);
		t1.setCategory("Transportation");
		t1.setDetails("This a sample detail");
		t1.setExpenseDate(new Date());

		allTransactions.add(t1);

		Transaction t2 = new Transaction();
		t2.setExpenseId("2");
		t2.setAmount(20.00);
		t2.setCategory("Food");
		t2.setDetails("This a sample detail for FOOD");
		t2.setExpenseDate(new Date());

		allTransactions.add(t2);

		Transaction t3 = new Transaction();
		t3.setExpenseId("3");
		t3.setAmount(30.00);
		t3.setCategory("Transportation");
		t3.setDetails("This a sample detail 3");
		t3.setExpenseDate(new Date());

		
		allTransactions.add(t3);

		return allTransactions;
	}

	private void setTransaction(Transaction transaction) {
		this.transaction = transaction;

	}

	public boolean addTransaction(AbstractTransaction transaction) {
		return false;
	}

	public boolean deleteTransaction(AbstractTransaction transaction) {
		return false;
	}

	public boolean editTransaction(AbstractTransaction transaction) {
		return false;
	}

	public abstract Transaction getTransaction();

}
