package com.iljo.tdl.listCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iljo.tdl.Command.TdlCommand;
import com.iljo.tdl.listDao.ListDao;

public class DeleteCommand implements TdlCommand {

	@Override
	public void execute(HttpServletRequest requset, HttpServletResponse response) {
		
		int td_id = Integer.parseInt(requset.getParameter("td_id"));
		ListDao dao = new ListDao();
		dao.delete(td_id);

	}

}
