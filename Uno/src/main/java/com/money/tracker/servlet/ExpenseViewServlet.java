package com.money.tracker.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.money.tracker.bo.AbstractTransactionExpenseImpl;
import com.money.tracker.core.AbstractTransaction;
import com.money.tracker.core.Profile;
import com.money.tracker.profile.UserProfile;
import com.money.tracker.vo.Transaction;

/**
 * Servlet implementation class ExpenseViewServlet
 */
public class ExpenseViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExpenseViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("GETTING:" + (String)(request.getParameter("expenseId")));
		
		Map a = request.getParameterMap();
		
		Iterator z = a.keySet().iterator();
		
		while(z.hasNext()){
			System.out.println(z.next());
		}
		
		
		String user = "ariel";
		
		
		//do a get profile operation here base on the input username
		
		
		Profile profile = new Profile();
		
		
		
		
		
		
		AbstractTransaction expenses = new AbstractTransactionExpenseImpl(profile);
		List<Transaction> transactions =  expenses.retrieveTransactions();
		
		
		//retrieval of category type
		Map<String, String> categories = new HashMap<String, String>();
		categories.put("Transportation","Transportation");
		categories.put("Food","Food");
		categories.put("Utilities","Utilities");
		
		request.setAttribute("categories", categories);
		request.setAttribute("expenseDetails", transactions);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ExpenseView.jsp");
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POSTING");
	}

}
