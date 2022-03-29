package com.iljo.tdl.todoCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iljo.tdl.Command.TdlCommand;
import com.iljo.tdl.todoUpdateDao.TodoUpdateDao;

public class PriorCommand implements TdlCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String td_id = request.getParameter("td_id");
		String td_prior = request.getParameter("td_prior");

		TodoUpdateDao dao = new TodoUpdateDao();
		dao.prior(td_id, td_prior);
	}

}
