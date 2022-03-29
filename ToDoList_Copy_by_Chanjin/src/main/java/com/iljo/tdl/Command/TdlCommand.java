package com.iljo.tdl.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface TdlCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response);

}
