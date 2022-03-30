package com.iljo.tdl.listCommand;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iljo.tdl.Command.TdlCommand;
import com.iljo.tdl.listDao.ListDao;
import com.iljo.tdl.todoDto.ToDoDto;

public class ListCommand implements TdlCommand {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		//String user_id = requset.getParameter("user_id");
		//int td_prior = Integer.parseInt(requset.getParameter("td_prior"));
		//int td_status = Integer.parseInt(requset.getParameter("td_status"));
	    //int ct_id = Integer.parseInt(requset.getParameter("ct_id"));		
		
		String user_id = "fk1119";
		int td_prior = 0;
		int td_status = 0;
	    int ct_id = 1;
		
	    
	    
	    
	    //연습중

	    
	    
	    
	    
	    
	    
		
		ArrayList<ToDoDto> dtos = null;
		ListDao dao = new ListDao();
		dtos = dao.list(user_id, ct_id, td_prior, td_status);
	    requset.setAttribute("list", dtos);
	
	}

}
