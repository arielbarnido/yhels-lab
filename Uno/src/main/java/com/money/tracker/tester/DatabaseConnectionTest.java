package com.money.tracker.tester;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

import com.money.tracker.utils.DatabaseConnectionHelper;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {

	
	DatabaseConnectionHelper dbHelper;
	Connection conn;
	
	@Before
	public void setup(){
		dbHelper = new DatabaseConnectionHelper();
	}
	
	@Test
	public void shouldInstantiateDBConnectionObject(){
		assertNotNull(dbHelper);
	}
	
	
	
	@Test
	public void shouldTestSimpleQuery(){
	
		createConnection();
		try {
			Statement st = conn.createStatement();
			boolean isRes = st.execute("select table_name from user_tables");
			ResultSet rs = null;
			if(isRes){
				rs = st.getResultSet();
			}
			
			assertNotNull(rs);
			
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void createConnection(){
		
		
		try {
			conn = dbHelper.createConnection();
			assertNotNull(conn);
			
			
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
		
	}
	

}
