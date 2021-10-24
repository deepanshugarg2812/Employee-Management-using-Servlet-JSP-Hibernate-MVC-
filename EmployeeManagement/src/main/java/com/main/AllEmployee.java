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

import com.dao.Employee;

public class AllEmployee extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session session = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		session = sf.openSession();
		session.beginTransaction();
		List<Employee> employeesList = session.createQuery("FROM employee").list();
		req.setAttribute("list", employeesList);
		session.getTransaction().commit();
		session.close();
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
