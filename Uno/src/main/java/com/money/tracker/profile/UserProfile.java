package com.money.tracker.profile;

import java.util.List;

import com.money.tracker.bo.Income;
import com.money.tracker.services.ExpenseService;
import com.money.tracker.vo.Transaction;

public class UserProfile {

	private String name;
	private List<Income> userIncome;
	private List<Transaction> expenses;
	private ExpenseService expenseService;
	
	public void initializeUserProfile(String userProfileId){
		
		expenseService = new ExpenseService();
		setExpenses(expenseService.getDetails(userProfileId));
		
		
		
	}

	private void setExpenses(List<Transaction> details) {
		expenses = details;
		
	}

	public List<Transaction> getExpenses() {
		return expenses;
	}
	
	
	
}
