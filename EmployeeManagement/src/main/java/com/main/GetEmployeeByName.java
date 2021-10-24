package com.main;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

import com.dao.Employee;

public class GetEmployeeByName extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = null;

	@Override
	public void init() throws ServletException {
		System.out.println("Creating the session");
		session = sf.openSession();
		session.beginTransaction();
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Query q = session.createQuery("FROM employee where name = :name");
		q.setParameter("name", req.getParameter("name"));
		List<Employee> employeesList = q.list();
		req.setAttribute("list", employeesList);
		req.getRequestDispatcher("search.jsp").forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Destroying the session");
		session.getTransaction().commit();
		session.close();
		super.destroy();
	}
}
