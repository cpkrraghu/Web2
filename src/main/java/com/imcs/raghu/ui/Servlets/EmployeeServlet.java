package com.imcs.raghu.ui.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imcs.raghu.bonus.pojo.Employee;
import com.imcs.raghu.bonus.service.EmployeeServiceImpl;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int empId = Integer.parseInt(request.getParameter("empId"));
		Employee e = new EmployeeServiceImpl().getEmployee(empId);
		if (e != null) {
			request.setAttribute("employee", e);
			RequestDispatcher rd = request.getRequestDispatcher("/pages/employee.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
