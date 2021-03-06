package com.iljo.tdl.homeController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iljo.tdl.Command.TdlCommand;
//import com.iljo.tdl.ctCommand.CtCreateCommand;
//import com.iljo.tdl.ctCommand.CtDeleteCommand;
//import com.iljo.tdl.ctCommand.CtListCommand;
//import com.iljo.tdl.ctCommand.CtModifyCommand;
//import com.iljo.tdl.listCommand.DeleteCommand;
//import com.iljo.tdl.listCommand.ListCommand;
import com.iljo.tdl.todoCommand.CreateCommand;
import com.iljo.tdl.todoCommand.ModifyCommand;
import com.iljo.tdl.todoCommand.PriorCommand;
//import com.iljo.tdl.userCommand.FindIdCommnad;
//import com.iljo.tdl.userCommand.FindPwCommand;
//import com.iljo.tdl.userCommand.LoginCommand;
//import com.iljo.tdl.userCommand.LogoutCommand;
//import com.iljo.tdl.userCommand.RegisterCommand;


/**
 * Servlet implementation class tdlHomeController
 */
@WebServlet("*.do")
public class tdlHomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tdlHomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8");
		
		// switch??? ????????? ?????? ????????????
		String viewPage = null;
		TdlCommand command = null;
		
		
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();		
		String com = uri.substring(conPath.length()); // ????????? ???????????? ???????????? 
		
		
		switch(com) {
		// Todolist ??????
//		case("/list.do") : 
//			command = new ListCommand();
//			command.execute(request, response);
//			viewPage = "list.jsp";	
//			break;
//		
//		// ???????????? 
//		case("/register.do") :
//			command = new RegisterCommand();
//			command.execute(request, response);
//			viewPage = "login.do";		
//			break;
//			
//	    // ?????????
//		case("/login.do") :
//			command = new LoginCommand();
//			command.execute(request, response);
//			viewPage = "list.do";
//			break;
//			
//		// ????????????	
//		case("logout.do") :
//			command = new LogoutCommand();
//			command.execute(request, response);
//			viewPage = "login.do";
//			break;
//			
//		// ????????? ??????  
//		case("/findId.do") :
//			command = new FindIdCommnad();
//			command.execute(request, response);
//			viewPage = "getId.jsp";			
//			break;
//		
//		// ???????????? ??????
//		case("/findPw.do") :
//			command = new FindPwCommand();
//			command.execute(request, response);
//			viewPage = "getPw.jsp";			
//			break;
//		
//		// Todolist ?????? 
//		case("/delete.do") :
//			command = new DeleteCommand();
//			command.execute(request, response);
//			viewPage = "list.do";			
//			break;
		
		// Todolist ?????? 	
		case("/create.do") :
			command = new CreateCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;	
		
		// Todolist ??????
		case("/modify.do") :
			command = new ModifyCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
		
		// ???????????? 
		case("/prior.do") :
			command = new PriorCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
		
//		// Category ????????? ??????
//		case("ctList.do") :
//			command = new CtListCommand();
//			command.execute(request, response);
//			viewPage = "ctList.jsp";
//			break;
//		
//		// Category ?????? 
//		case("ctCreate.do") :
//			command = new CtCreateCommand();
//			command.execute(request, response);
//			viewPage = "ctList.do";
//			break;
//			
//		// Category ??????	
//		case("ctModify.do") :
//			command = new CtModifyCommand();
//			command.execute(request, response);
//			viewPage = "cdList.do";
//			break;
//		
//		// Category ??????
//		case("ctDelete.do") :
//			command = new CtDeleteCommand();
//			command.execute(request, response);
//			viewPage = "ctList.do";
//			break;		
		}
		
				
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
