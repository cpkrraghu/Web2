package com.imcs.raghu.ui.Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imcs.raghu.bonus.pojo.Employee;
import com.imcs.raghu.bonus.service.EmployeeServiceImpl;

public class DepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DepartmentServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int deptId = Integer.parseInt(request.getParameter("deptId"));
		List<Employee> emps = new EmployeeServiceImpl().getEmployees(deptId);
		if (emps.size() != 0) {
			request.setAttribute("employees", emps);
			RequestDispatcher rd = request.getRequestDispatcher("/pages/department.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
