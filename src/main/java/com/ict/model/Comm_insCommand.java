package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.ict.db.BVO;
import com.ict.db.CVO;
import com.ict.db.DAO;
import com.ict.db.MVO;

public class Comm_insCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// b_idx를 얻기위해서 session에 bvo호출
		BVO bvo = (BVO)request.getSession().getAttribute("bvo");

		CVO cvo = new CVO();
		cvo.setB_idx(bvo.getB_idx());
		cvo.setWriter(request.getSession().getId());
		cvo.setContent(request.getParameter("content"));
		
		int result = DAO.getComm_Insert(cvo);
		if(result>0) {
			
			return "MyController?cmd=onelist&b_idx="+bvo.getB_idx();
		}
		return null;
	}
}
