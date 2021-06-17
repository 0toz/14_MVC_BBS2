package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;

public class Comm_delCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String b_idx = request.getParameter("b_idx");
		String c_idx = request.getParameter("c_idx");
		
		int result = DAO.getComm_Delete(c_idx);
		if(result>0) {
			
			return "MyController?cmd=onelist&b_idx="+b_idx;
		}
		return null;
	}
}