package com.iljo.tdl.todoUpdateDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TodoUpdateDao {

	
	
	DataSource dataSource;
	
	public TodoUpdateDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/todolist");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void create(String td_content, String category_ct_id, String user_user_id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "insert into todo (td_content, td_date, td_prior, td_status, category_ct_id, user_user_id) values (?,now(), 0, 0, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, td_content);
			preparedStatement.setString(2, category_ct_id);
			preparedStatement.setString(3, user_user_id);
			
			preparedStatement.executeUpdate();

			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // create
	
	
	public void modify(String td_id, String td_content, String category_ct_id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "update todo set td_content = ?, category_ct_id = ? where td_Id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, td_content);
			preparedStatement.setString(2, category_ct_id);
			preparedStatement.setString(3, td_id);
			
			preparedStatement.executeUpdate();

			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // modify
	

	public void prior(String td_id, String td_prior) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "update todo set td_prior = ? where td_Id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, td_prior);
			preparedStatement.setString(2, td_id);
			
			preparedStatement.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // modify
	

	public void status(String td_id, String td_status) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "update todo set td_status = ? where td_Id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, td_status);
			preparedStatement.setString(2, td_id);
			
			preparedStatement.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	} // modify			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
