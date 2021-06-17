package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.MVO;

public class Join_okCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	
		String id= request.getParameter("id");
		String pwd= request.getParameter("pwd");
		
		
		MVO mvo = new MVO();
		mvo.setId(id);
		mvo.setPwd(pwd);
		
		int result = DAO.get_ID_Insert(mvo);
		request.getSession().setAttribute("mvo", mvo);

		return "view/list.jsp";
	}
	
	
}
