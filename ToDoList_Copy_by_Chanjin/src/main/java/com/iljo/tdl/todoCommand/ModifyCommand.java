package com.iljo.tdl.todoCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iljo.tdl.Command.TdlCommand;
import com.iljo.tdl.todoUpdateDao.TodoUpdateDao;

public class ModifyCommand implements TdlCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String td_id = request.getParameter("td_id");
		String td_content = request.getParameter("td_content");
		String category_ct_id = request.getParameter("category_ct_id");
		
		TodoUpdateDao dao = new TodoUpdateDao();
		dao.modify(td_id, td_content, category_ct_id);
	}

}
