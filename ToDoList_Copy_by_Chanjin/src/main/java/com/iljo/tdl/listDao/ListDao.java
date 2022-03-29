package com.iljo.tdl.listDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class ListDao {

	DataSource dataSource;
	
	public ListDao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:/comp/env/jdbc/todolist");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// 전체검색
//		public ArrayList<ToDoDto> list(){
//			ArrayList<ToDoDto> dtos = new ArrayList<ToDoDto>();
//			Connection connection = null;
//			PreparedStatement preparedStatement = null;
//			ResultSet resultSet = null;
//			
//			try {
//				connection = dataSource.getConnection();
//				String query = "select td_content, td_prior, td_status, ct_name from todo where user_id = ?";
//				preparedStatement = connection.prepareStatement(query);
//				resultSet = preparedStatement.executeQuery();
//				
//				while(resultSet.next()) {
//					int aId = resultSet.getInt("aId");
//					String aName = resultSet.getString("aName");
//					String aPhone = resultSet.getString("aphone");
//					String aAddress = resultSet.getString("aAddress");
//					String aEmail = resultSet.getString("aEmail");
//					String aRelation = resultSet.getString("aRelation");
//					
//					ADto dto = new ADto(aId, aName, aPhone, aAddress, aEmail, aRelation);
//					dtos.add(dto);
//				}
//				
//			}catch(Exception e) {
//				e.printStackTrace();
//			}finally {
//				try {
//					if(resultSet != null) resultSet.close();
//					if(preparedStatement != null) preparedStatement.close();
//					if(connection != null) connection.close();
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			}
//			return dtos;
//			
//		} // list
}
