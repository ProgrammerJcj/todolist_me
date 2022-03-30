package com.iljo.tdl.listDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.iljo.tdl.todoDto.ToDoDto;



public class ListDao {
DataSource dataSource;
	
	
	// Constructor
		public ListDao() {
			try {  // context.xml 사용하여 연결
				Context contex = new InitialContext();
				dataSource = (DataSource) contex.lookup("java:comp/env/jdbc/todolist"); //
				   
				
			}catch (Exception e) {
				e.printStackTrace();
			
			}
			
			
		}
		
	// Method
	
	public ArrayList<ToDoDto> list(String user_id, int ct_id, int td_priorx, int td_statusx) {
		ArrayList<ToDoDto> dtos = new ArrayList<ToDoDto>();
		
		String query1 = "select * from todo where user_user_id = '" + user_id + "' ";
		String query2 = "";
		String query3 = "";
		String query4 = "";
		String query5 = " order by td_date desc";
		
		if(ct_id != 0 ) {
			query2 = " and category_ct_id = " + ct_id;
		}
		
		if(td_statusx != 0) {
			query3 = " and td_status = " + td_statusx;
		}
		
		if(td_priorx !=0 ) {
			query4 = " and td_prior = "  + td_priorx;
		}
	
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();					
			preparedStatement = connection.prepareStatement(query1 + query2 + query3 + query4 + query5);
			resultSet = preparedStatement.executeQuery();
		
			while(resultSet.next()) {
				int td_id = resultSet.getInt("td_id");
				String td_content = resultSet.getString("td_content");
				Timestamp td_date = resultSet.getTimestamp("td_date");
				int td_prior = resultSet.getInt("td_prior");	
				int td_status = resultSet.getInt("td_status");
				int category_ct_id = resultSet.getInt("category_ct_id");
				String user_user_id = resultSet.getString("user_user_id");
				
				ToDoDto dto = new ToDoDto(td_id, td_content, td_date, td_prior, td_status, category_ct_id, user_user_id);
				dtos.add(dto);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		
		}finally {  // 이상이 있거나 없거나 모두 온다 
			try {
				if(resultSet != null) resultSet.close();	 // 선언의 반대순으로 close 	
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return dtos;
	} // list
	
	public void delete(int td_id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	
		
		try {
			connection = dataSource.getConnection();
			String query = "delete from todolist where td_id = '" + td_id + "'";
			preparedStatement = connection.prepareStatement(query);	
			preparedStatement.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally { 
			try {
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // delete

}
