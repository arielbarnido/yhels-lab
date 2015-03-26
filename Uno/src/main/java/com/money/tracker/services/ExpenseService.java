package com.money.tracker.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.money.tracker.vo.Transaction;



public class ExpenseService {

	private static ExpenseService expenseService;
	
	public static ExpenseService getInstance() {
	
		
		if(null == expenseService){
			expenseService = new ExpenseService();
		}
		
		return expenseService;
	}

	public List<Transaction> getDetails(String user) {

		
		ArrayList<Transaction> allDetails = new ArrayList<Transaction>();
		
		Transaction a = new Transaction();
		a.setExpenseId("1");
		a.setAmount(10.00);
		a.setCategory("Transportation");
		a.setDetails("This a sample detail");
		a.setExpenseDate(new Date());
		
		allDetails.add(a);
		
		Transaction b = new Transaction();
		b.setExpenseId("2");
		b.setAmount(20.00);
		b.setCategory("Food");
		b.setDetails("This a sample detail for FOOD");
		b.setExpenseDate(new Date());
		allDetails.add(b);
		
		Transaction c = new Transaction();
		c.setExpenseId("3");
		c.setAmount(30.00);
		c.setCategory("Transportation");
		c.setDetails("This a sample detail 3");
		c.setExpenseDate(new Date());
		
		allDetails.add(c);
		
		return allDetails;
	}

}
