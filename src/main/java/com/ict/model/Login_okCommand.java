package com.ict.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;
import com.ict.db.MVO;

public class Login_okCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	
		String id= request.getParameter("id");
		String pwd= request.getParameter("pwd");
		
		
		MVO mvo = new MVO();
		mvo.setId(id);
		mvo.setPwd(pwd);
		
		List<MVO> list = DAO.get_ID_Select(mvo.getId());
		if(list.isEmpty()) {
			int result = DAO.get_ID_Insert(mvo);
		}
		request.getSession().setAttribute("mvo", mvo);

		return "MyController?cmd=list&cPage=1";
	}
	
	
}
